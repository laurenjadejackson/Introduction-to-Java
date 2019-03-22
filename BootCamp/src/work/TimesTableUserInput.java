package work;

import java.util.Scanner;

public class TimesTableUserInput {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number");

		int userNumber = scanner.nextInt();
		 
		
		System.out.println("1 x " + userNumber + " = " + 1 * userNumber);
		System.out.println("2 x " + userNumber + " = " + 2 * userNumber);
		System.out.println("3 x " + userNumber + " = " + 3 * userNumber);
		System.out.println("4 x " + userNumber + " = " + 4 * userNumber);
		System.out.println("5 x " + userNumber + " = " + 5 * userNumber);
		System.out.println("6 x " + userNumber + " = " + 6 * userNumber);
		System.out.println("7 x " + userNumber + " = " + 7 * userNumber);
		System.out.println("8 x " + userNumber + " = " + 8 * userNumber);
		System.out.println("9 x " + userNumber + " = " + 9 * userNumber);
		System.out.println("10 x " + userNumber + " = " + 10 * userNumber);
		System.out.println("11 x " + userNumber + " = " + 11 * userNumber);
		System.out.println("12 x " + userNumber + " = " + 12 * userNumber);
	
		scanner.close();
	}
}
