package work;

import java.util.Scanner;

public class ListOfLists {

	public static void main(String[] args) {
		System.out.println("Please select a topic:");
		System.out.println("(a) Animals");
		System.out.println("(b) Fruit and Vegetables");
		System.out.println("(c) Celebrities");

		char topic;
		Scanner sc = new Scanner(System.in);
		topic = sc.nextLine().charAt(0);

		if (topic == 'a') {
			System.out.println("You have selected Animals. Please select a sub-topic:");
			System.out.println("a. Mammals");
			System.out.println("b. Birds");
			System.out.println("c. Fish");

			char topic2;
			Scanner sc2 = new Scanner(System.in);
			topic2 = sc2.nextLine().charAt(0);

			if (topic2 == 'a') {
				System.out.println("You have selected Mammals. Here is a list of Mammals:");
				System.out.println("Dog, Cat, Horse, Cow");
			} else if (topic2 == 'b') {
				System.out.println("You have selected Birds. Here is a list of Birds:");
				System.out.println("Robin, Blackbird, Eagle, Owl");
			} else if (topic2 == 'c') {
				System.out.println("You have selected Fish. Here is a list of Fish:");
				System.out.println("Pike, Trout, Shark");
			}

		} else if (topic == 'b') {
			System.out.println("You have selected Fruit and Vegetables. Please select a sub-topic:");
			System.out.println("a. Root Vegetables");
			System.out.println("b. Salad Vegetables");
			System.out.println("c. Fruit Salad");

			char topic3;
			Scanner sc3 = new Scanner(System.in);
			topic3 = sc3.nextLine().charAt(0);

			if (topic3 == 'a') {
				System.out.println("You have selected Root Vegetables. Here is a list of Root Vegetables:");
				System.out.println("Carrots, Potato, Onion");
			} else if (topic3 == 'b') {
				System.out.println("You have selected Salad Vegetables. Here is a list of Salad Vegetables:");
				System.out.println("Lettuce, Cucumber, Peppers");
			} else if (topic3 == 'c') {
				System.out.println("You have selected Fruit Salad. Here is a list of Fruit Salad:");
				System.out.println("Grapes, Orange, Banana, Apple");
			}
		} else if (topic == 'c') {
			System.out.println("You have selected Celebrities. Please select a sub-topic:");
			System.out.println("a. A-List");
			System.out.println("b. Z-List");

			char topic4;
			Scanner sc4 = new Scanner(System.in);
			topic4 = sc4.nextLine().charAt(0);

			if (topic4 == 'a') {
				System.out.println("You have selected A-List. Here is a list of A-List:");
				System.out.println("Jennifer Aniston, Beyonce, Brad Pitt");
			} else if (topic4 == 'b') {
				System.out.println("You have selected Z-List. Here is a list of Z-List:");
				System.out.println("Sofia Richie, Mindy McKnight, Keke Wyatt");
			}

		}

	}

	
}
