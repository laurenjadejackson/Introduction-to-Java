package com.stuff.utilities;

public class Calculator {

    public int frequency(String chosenLetter, String sentence) {

        final String[] splitLetters = splitIntoCharacters(sentence);

        int frequencyCount = 0;
        for (int i = 0; i < splitLetters.length; i++) {
            if (lowerCase(splitLetters[i]).equals(chosenLetter)) {
                frequencyCount++;
            }
        }
        return frequencyCount;
        // For loop ends when i is less than the split sentence length
        // IF the the element of split sentence is equivalent to a letter in the
        // sentence then count will increase if not count will not increase
    }

    public int relativeFrequency(String letter, String sentence) {
        int frequency = frequency(letter, sentence);
        final double frequencyPercentage = ((((double) frequency / sentence.length()) * 100) / 100 ) * 100;

        return (int) frequencyPercentage;
        // easy way to round decimal double to whole number integer
    }

    private String[] splitIntoCharacters(String sentence) {
        String[] characters = sentence.split("");
        return characters;
    }

    private String lowerCase(String character) {
        return character.toLowerCase();
    }
}
