package scannerPractice;
import javax.swing.JOptionPane;
import java.lang.Math; 
import java.util.Random;




public class scannerMenu {
	
	 public static void main(String[] args) {
			
	      	 
	 int userInput = getUserInput();
	 
	 while (userInput != 3 ) {
		 
		 switch(userInput) {
		 case 1:
			 
			 JOptionPane.showMessageDialog(null, randNum());
			 userInput = getUserInput();
			 break;
		 case 2:
			 
			 String reverseString = (JOptionPane.showInputDialog("Enter a word to reverse"));
			 
			 JOptionPane.showMessageDialog(null, reverseWord(reverseString));
			 userInput = getUserInput();
			 break;
		 case 3:
			 userInput = 4;
			 break;
		 default:
			 JOptionPane.showMessageDialog(null, "Invalid Choice");
			 userInput = getUserInput();
			 break;			 
		 
		 }
	 }
	 
	      
	 }
	 
		public static String randNum(){
			Random random = new Random();			
			return ("Random Number is : " + Math.round(Math.random()*100));

			}
		public static String reverseWord(String word){
			
			StringBuffer sb = new StringBuffer(word);
			
			return sb.reverse().toString();

			}
	 
	 public static int getUserInput() {
		 int num = Integer.parseInt(JOptionPane.showInputDialog("Menu: Enter 1, 2 or 3"));
		 return num;
	 }
	 
	 
	      
}
