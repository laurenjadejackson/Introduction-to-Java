package work;

import java.util.Scanner;

public class GreetingSelection {

	static boolean loop = true;

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

		String[] myArray = new String[3];

		myArray[0] = "Hi";

		myArray[1] = "Hello";

		myArray[2] = "yo";

		while (loop)

		{

			try {

				System.out.println("Please enter a number between 0-2.");

				Scanner scanner = new Scanner(System.in);

				int number = scanner.nextInt();

				System.out.println(myArray[number]);

			}

			catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)

			{

				System.out.println("Sorry that number is not valid, please try again.");

			}

		}

	}
}
