package example;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number1 = reader.nextInt();
		System.out.print("Enter another number: ");
		int number2 = reader.nextInt();
		int result = 0;
		System.out.print("enter operator:");
		char operator = reader.next().charAt(0);
		
		switch(operator) {
		case '+':
			result = number1+number2;
			break;
		case '-':
			result = number1-number2;
			break;
		case '*':
			result = number1 * number2;
			break;
		case '/':
			result= number1/number2;
			break;
		default:
			System.out.println("invalid");
		}
		System.out.println("Result: "+result);

	}

}
