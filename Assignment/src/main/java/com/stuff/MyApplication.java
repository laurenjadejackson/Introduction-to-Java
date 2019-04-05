package com.stuff;

import com.stuff.barchart.BarChart;
import com.stuff.table.Table;
import com.stuff.utilities.FileInput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class MyApplication {

    private final Scanner input;
    private final Table table = new Table();
    private final BarChart barChart = new BarChart();

    public MyApplication(InputStream inputStream) {
        this.input = new Scanner(System.in);
    }

    public void run() {
        displayWelcomeMessageAndInputOptions();

        final String userInput = input.nextLine();
        handleChosenInputOption(userInput);
    }

    private void handleChosenInputOption(final String userInput) {
        if ("Keyboard".equals(userInput)) {
            runKeyboardOption();
        } else if ("Demo".equals(userInput)) {
            runDemoOption();
        } else if ("Fileinput".equals(userInput)) {
            runFileInputOption();
        }
    }

    private void runDemoOption() {
        // TODO: what does Demo option do?
    }

    private void runFileInputOption() {
        askToInputFileName();
        final String inputtedFileName = input.nextLine();

        askToChooseTableOrBarchartDisplay();
        final String chosenDisplay = input.nextLine();

        if("Table".equals(chosenDisplay)) {
            table.create(inputtedFileName);
        } else if ("Barchart".equals(chosenDisplay)) {
            barChart.create(inputtedFileName);
        }
    }

    private void runKeyboardOption() {
        askToInputAnyText();
        final String inputtedText = input.nextLine();

        askToChooseTableOrBarchartDisplay();
        final String chosenDisplay = input.nextLine();

        if("Table".equals(chosenDisplay)) {
            table.create(inputtedText);
        } else if ("Barchart".equals(chosenDisplay)) {
            barChart.create(inputtedText);
        }
    }

    private void askToInputFileName() {
        System.out.println("Enter file name");
    }

    private void askToInputAnyText() {
        System.out.println("Enter some text");
    }

    private void displayWelcomeMessageAndInputOptions() {
		System.out.println("Welcome to my Java Assignment\nPick an option\nKeyboard\nDemo\nFileInput");
	}
	
	private void askToChooseTableOrBarchartDisplay() {
		System.out.println("How would you like it to be displayed?\nTable\nBarchart");
	}
	
	
	
	
	
	
	
	
	
	
	
	

	// TODO test and run this
	
	public static String getInputFile() {
		FileInput fileInput = new FileInput();
		String name = fileInput.getFileName();
		BufferedReader reader;
		String line = "";                               
		try {
			reader = fileInput.createReader(name);
			line = reader.readLine();

		} catch (FileNotFoundException fnfe) {
			System.out.println("The File could not be found");

		} catch (IOException ioe) {
			System.out.println("Input issue");
		}
		return line;
	}

//	public static int[] characterCountHandler(String line) {
//		zCalculator character = new zCalculator(line);
//		String[] splitSentence = character.splitSentence(line);
//		int[] frequenciesOfLetters = character.frequenciesOfLetters(splitSentence, character.arrayOfLetters);
//		return frequenciesOfLetters;
//	}
}
