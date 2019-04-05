package com.stuff.table;

public class Table {

	private final Header header = new Header();
	private final Body body = new Body();

	public void create(String inputtedSentence) {
		header.print();
		body.printRows(inputtedSentence);
	}

}
