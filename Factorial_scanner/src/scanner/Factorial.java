package scanner;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		long factorial = 1;
		for (int i=1; i<=num;i++) {
			factorial = factorial * i;
			}
		System.out.printf("Factorial of %d = %d", num, factorial);

	}

}
