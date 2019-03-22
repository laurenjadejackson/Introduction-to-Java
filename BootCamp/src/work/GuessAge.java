package work;

import java.util.Scanner;

public class GuessAge {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter your age");
		
		int usersAge = scanner.nextInt();
		
		System.out.println(2017 - usersAge + " is this your year of birth?");
		
		String usersAnswer = scanner.nextLine();
		
		System.out.println("Please enter y or n");
		
		String answer = scanner.nextLine();
		
		if (answer.equals("n")) {
			System.out.println(2017 - usersAge - 1);
		} 
		scanner.close();
	}
}
