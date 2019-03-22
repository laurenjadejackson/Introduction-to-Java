package work;

import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 and 10");
		
		int usersNumber = scanner.nextInt();
		
		int randomNumber = (int) (Math.random() * 10) + 1; 
		
		System.out.println(randomNumber);
		
		if (usersNumber == randomNumber) {
			System.out.println("You got it correct");
		} else {
			System.out.println("That number was incorrect");
		} scanner.close();
	}
	

}
