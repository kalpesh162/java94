This page lets the user pick a theme and choose the tracking method.

<form action="theme" method="post">
    Select Theme:
    <select name="theme">
        <option value="light">Light</option>
        <option value="dark">Dark</option>
    </select>

    <br><br>

    Tracking Method:
    <select name="method">
        <option value="cookie">Cookie</option>
        <option value="hidden">Hidden Field</option>
        <option value="url">URL Rewriting</option>
        <option value="session">Session</option>
    </select>

    <br><br>
    <button type="submit">Apply</button>
</form>

☕ Servlet (ThemeServlet.java)

Handles all 4 approaches in one place:

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/theme")
public class ThemeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String theme = request.getParameter("theme");
        String method = request.getParameter("method");

        if ("cookie".equals(method)) {
            Cookie c = new Cookie("theme", theme);
            response.addCookie(c);
            response.sendRedirect("cookie.jsp");

        } else if ("session".equals(method)) {
            HttpSession session = request.getSession();
            session.setAttribute("theme", theme);
            response.sendRedirect("session.jsp");

        } else if ("url".equals(method)) {
            response.sendRedirect("url.jsp?theme=" + theme);

        } else if ("hidden".equals(method)) {
            request.setAttribute("theme", theme);
            RequestDispatcher rd = request.getRequestDispatcher("hidden.jsp");
            rd.forward(request, response);
        }
    }
}


🍪 1. Cookie Example (cookie.jsp)
<%@ page import="javax.servlet.http.Cookie" %>
<%
    String theme = "light";

    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie c : cookies) {
            if ("theme".equals(c.getName())) {
                theme = c.getValue();
            }
        }
    }
%>

<h2>Cookie Theme: <%= theme %></h2>

👉 Stored in browser → persists even after closing browser (if maxAge set)

🧾 2. Hidden Field Example (hidden.jsp)
<%
    String theme = (String) request.getAttribute("theme");
%>

<h2>Hidden Field Theme: <%= theme %></h2>

<form action="hidden.jsp" method="post">
    <input type="hidden" name="theme" value="<%= theme %>"/>
    <button type="submit">Next Page</button>
</form>

👉 Travels only via forms → not persistent

🔗 3. URL Rewriting Example (url.jsp)
<%
    String theme = request.getParameter("theme");
%>

<h2>URL Theme: <%= theme %></h2>

<a href="url.jsp?theme=<%= theme %>">Next Page</a>

👉 Visible in URL → useful when cookies disabled

🗂 4. Session Example (session.jsp)
<%
    String theme = (String) session.getAttribute("theme");
%>

<h2>Session Theme: <%= theme %></h2>

👉 Stored on server → most commonly used in real apps



*****************************************************************

What you have right now is a basic CRUD app — it works, but it has no authentication or authorization. So anyone can delete/update books. That’s the core problem you want to fix.

You don’t need to rewrite everything. You just need to add login + role check (Admin/User) on top of your existing code.

🔑 Step 1: Create Users Table

Add a new table:

create table users (
  id int auto_increment primary key,
  username varchar(50),
  password varchar(50),
  role varchar(10)   -- 'admin' or 'user'
);

Insert sample data:

insert into users (username, password, role) values ('admin','admin123','admin');
insert into users (username, password, role) values ('user1','user123','user');
🔑 Step 2: Create User Model
package com.model;

public class User {
    private String username;
    private String password;
    private String role;

    // getters and setters
}
🔑 Step 3: Create Login DAO
package com.dao;

import java.sql.*;
import com.model.User;
import com.utility.DBUtility;

public class UserDao {

    public User login(String username, String password) {
        User user = null;

        String sql = "select * from users where username=? and password=?";
        try (Connection con = DBUtility.getDBUtility().getDBConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new User();
                user.setUsername(rs.getString("username"));
                user.setRole(rs.getString("role"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
🔑 Step 4: Login Servlet
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = userDao.login(username, password);

        if (user != null) {
            request.getSession().setAttribute("user", user);

            response.sendRedirect("readBook");
        } else {
            response.getWriter().println("Invalid login");
        }
    }
}
🔑 Step 5: Protect Delete & Update (IMPORTANT)

Modify your DeleteBookServlet:

User user = (User) request.getSession().getAttribute("user");

if (user == null || !"admin".equals(user.getRole())) {
    response.getWriter().println("Access Denied!");
    return;
}

👉 Put this at the TOP of:

DeleteBookServlet
UpdateBookServlet
AddBookServlet (optional but recommended)
🔑 Step 6: Hide Buttons in UI (ReadBookServlet)

Modify this part:

User user = (User) request.getSession().getAttribute("user");
boolean isAdmin = user != null && "admin".equals(user.getRole());

Then update table:

if (isAdmin) {
    out.print("<td><a href='deleteBook?id="+book.getId()+"'>DELETE</a></td>");
    out.print("<td><a href='updateBook?id="+book.getId()+"'>UPDATE</a></td>");
} else {
    out.print("<td> - </td>");
    out.print("<td> - </td>");
}
🔑 Step 7: Create Login Page (index.html)
<form action="login" method="post">
    Username: <input type="text" name="username"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit" value="Login">
</form>
🔑 Step 8: (Optional but Better) Use Filter

Instead of repeating role checks in every servlet, create a Filter:

@WebFilter("/deleteBook")
public class AdminFilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        User user = (User) request.getSession().getAttribute("user");

        if (user == null || !"admin".equals(user.getRole())) {
            response.getWriter().println("Access Denied!");
            return;
        }

        chain.doFilter(req, res);
    }
}
⚠️ Important Fixes in Your Code
❌ SQL typo:
id int autoincement

✅ Fix:

id int auto_increment
❌ Update link wrong:
out.print("<a href='deleteBook?id="+book.getId()+"'> UPDATE </a>");

✅ Fix:

out.print("<a href='updateBook?id="+book.getId()+"'> UPDATE </a>");
🧠 Final Architecture (Simple)
User logs in
Session stores user + role
UI shows:
Admin → full control
User → read-only
Backend double-checks role before delete/update


/*Write a Java program to check whether a given year is a leap year or not.*/

import java.util.Scanner;

class Example01{
    public static void main(String[] args) {
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENter Year : " );
        year=scanner.nextInt();

        if(year%4==0){
             System.out.println("Leap Year");
        }
        else{
            System.out.println("NOT Leap Year");
        }
        
    }
}

