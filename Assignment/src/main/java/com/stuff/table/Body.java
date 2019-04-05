package com.stuff.table;

import com.stuff.utilities.Calculator;
import com.stuff.utilities.MyCharacters;

public class Body {

    private final Calculator calculate = new Calculator();

    public void printRows(String inputtedSentence) {
        String[] charactersArray = MyCharacters.ARRAY;
        for (int i = 0; i < charactersArray.length; i++) {

            int frequency = calculate.frequency(charactersArray[i], inputtedSentence);
            int relativeFrequency = calculate.relativeFrequency(charactersArray[i], inputtedSentence);

            printCharactersColumn(charactersArray[i]);
            printFrequencyColumn(frequency);
            printRelativeFrequencyColumn(relativeFrequency);
        }
    }

    private static void printCharactersColumn(String character) {
        System.out.print("|     " + character + "      ");
    }

    private static void printFrequencyColumn(int number) {
        int numberPlaceHolderLength = 6;
        int numberLength = Integer.toString(number).length();
        int whiteSpacesRequired = numberPlaceHolderLength - numberLength;
        String whiteSpaces = "";

        for (int i = 0; i < whiteSpacesRequired; i++) {
            whiteSpaces = whiteSpaces + " ";
        }

        System.out.print("|     " + number + whiteSpaces);
    }

    private static void printRelativeFrequencyColumn(int number) {
        int numberPlaceHolderLength = 9;
        int numberLength = String.valueOf(number).length();
        int whiteSpacesRequired = numberPlaceHolderLength - numberLength;
        String whiteSpaces = "";

        for (int i = 0; i < whiteSpacesRequired; i++) {
            whiteSpaces = whiteSpaces + " ";
        }

        System.out.println("|          " + number + "%" + whiteSpaces + "|");
    }

    // TODO: re-factor this
    private static void resizeColumns(int number, int columnWidth) {
        String whiteSpaces = "" + number;
        int whiteSpacesRequired = columnWidth - Integer.toString(number).length();

        for (int i = 1; i <= whiteSpacesRequired; i++) {
            whiteSpaces = whiteSpaces + " ";
        }
    }
}
