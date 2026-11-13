import java.util.Random;

public class App01 {

	public static void main(String[] args) {
		
		Random random=new Random();

		for(int i=1;i<=10;i++){
			System.out.println(random.nextInt());
		}
		System.out.println("++++++++++++++++++++++++++++++");
		for(int i=1;i<=10;i++){
			System.out.println(random.nextInt(1000));
		}

	}
	
}