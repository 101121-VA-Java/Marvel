package scannerPractice;

import java.lang.Math; 
import java.util.Random;

public class scannerMenu {
	public static void main(String[] args) {
		randNum();
		
	}
	
	public static void randNum(){
		Random random = new Random();
//		int y = random.nextInt(1000);  
		System.out.println("Random Number is : " + Math.round(Math.random()*100));
//		System.out.println("Random Number is : " + y);
		}
}
