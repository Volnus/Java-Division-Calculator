import java.util.Scanner;
public class Division {

		public static void main (String [] args){
		double number1, number2;
		double quotient;
		
		// Scanner
		Scanner keyboard = new Scanner (System.in);
		
		// Get the first number
		System.out.println("Enter a number: ");
		number1 = keyboard.nextDouble();
		
		// Get the second number
		System.out.println("Enter another number: ");
		number2 = keyboard.nextDouble();
		
		keyboard.close();
		
		// Print The Possible Errors
		if (number2 == 0) {
			System.out.println("Division by zero is not possible");
			System.out.println("Please run the program again");
			System.out.println("Enter a number other than zero");
		}
		
		// Print The Answer
		else{
			quotient = number1 / number2;
			System.out.println("Divided by: " +  number2);
			System.out.println("Equals: " +  quotient);
			
		}
		
		}
}
