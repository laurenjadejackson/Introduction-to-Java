package com.stuff.barchart;

import com.stuff.barchart.XAxis;
import com.stuff.barchart.YAxis;

public class BarChart {

	public YAxis characterAxisAndRelativeFrequencyBars = new YAxis();
	public XAxis relativeFrequencyAxis = new XAxis();
	
	public void create(String sentence) {
		printMainTitle();

		characterAxisAndRelativeFrequencyBars.create(sentence);
		relativeFrequencyAxis.print();
	}

	private void printMainTitle() {
		System.out.println("Relative Frequency Table");
	}
}
