package com.stuff.barchart;

public class XAxis {

	private static int LEFT_MARGIN_LENGTH = 3;
	
	public void print() {
		printXAxisLine();
		printPointsOnXAxis();
		printPercentageNumbersOnXAxis();
		printXAxisTitle();
	}

	private void printXAxisLine() {
		System.out.print("\n" + leftMargin());
		for (int i = 0; i < 10; i++) {
			System.out.print("__________");
		}
		System.out.println("_");
	}

	private String leftMargin() {
		String margin = "";
		for (int i = 0; i < LEFT_MARGIN_LENGTH; i++) {
			margin = margin + " ";
		}
		return margin;
	}

	private void printPercentageNumbersOnXAxis() {
		System.out.print(leftMargin());
		for (int i = 0; i <= 10; i++) {
			System.out.print((i * 10) + "        ");
		}
		System.out.println();
	}

	private void printPointsOnXAxis() {
		System.out.print(leftMargin());
		for (int i = 0; i <= 10; i++) {
			System.out.print("'         ");
		}
		System.out.println();
	}

	private void printXAxisTitle() {
		System.out.println(leftMargin() + "                                          Relative Frequency (%)");
	}
}
