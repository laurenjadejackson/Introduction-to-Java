package work;

import java.util.Scanner;

public class ValidMobileNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your mobile phone number?");

		String userNumber = scanner.nextLine();

		boolean startNumber = userNumber.startsWith("07");

		int lengthOfNumber = userNumber.length();

		if (startNumber) {
			if (lengthOfNumber == 11) {

				System.out.println("your number is " + userNumber + " which is correct");
			} else {
				System.out.println("The number is not the correct length");
			}
		} else if (lengthOfNumber == 11) {
			System.out.println("your number should start with 07");

		} else {

			{
				System.out.println("your number is the wrong length and does not start with 07");

			}
			scanner.close();
		}
	}
}
