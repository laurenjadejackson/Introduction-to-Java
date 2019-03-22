package work;

import java.util.Scanner;

public class BabyBoomer {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your age?");

		String userAge = scanner.nextLine();

		int age = Integer.parseInt(userAge);

		int myUser = (2018 - age);

		System.out.println(2018 - myUser);

		if (myUser < 1964 && myUser > 1945) {
			System.out.println("you are	a baby boomer");
		}

		else {
			System.out.println("you are not a baby boomer");
		}
		scanner.close();
	}
}


