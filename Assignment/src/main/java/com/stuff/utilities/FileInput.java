package com.stuff.utilities;

// to read in a file, to speak to the characters class, which will then count each character in the file.  

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileInput {

	public String getFileName() {
		Scanner userPicksFile = new Scanner(System.in);

		System.out.println("Enter a filename to read from");

		String name = userPicksFile.nextLine();

		userPicksFile.close();
		return name;
	}

	public String readAllLines(BufferedReader reader) throws IOException {
		StringBuilder allLines = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			allLines.append(line);
		}
		return allLines.toString();
	}

	public BufferedReader createReader(String fileName) throws FileNotFoundException {
		BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
		return fileReader;

	}

}