package com.stuff.barchart;

import com.stuff.utilities.Calculator;
import com.stuff.utilities.MyCharacters;

public class YAxis {

    private Calculator calculate = new Calculator();
    private static char BAR_STYLE = '*';

	public void create(String sentence) {

	    final String[] charactersToCompare = MyCharacters.ARRAY;

	    for (int i = 0; i < charactersToCompare.length; i++) {

            printLetterAndAxisOnNewLine(charactersToCompare[i]);

            double relativeFrequency = calculate.relativeFrequency(charactersToCompare[i], sentence);
            printBar(relativeFrequency);
	    }
    }

    private void printBar(double relativeFrequency) {
        for (int i = 0; i < relativeFrequency; i++) {
            System.out.print(BAR_STYLE);
        }
    }

    private void printLetterAndAxisOnNewLine(String letter) {
        System.out.print("\n " + letter + " |");
    }
}
