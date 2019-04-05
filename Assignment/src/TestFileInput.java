import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

import main.com.java.utilities.FileInput;


public class TestFileInput {

	String file = "UserInput.txt";
	FileInput input = new FileInput();

	@Test
	@Ignore
	public void testGetFileName() {
		String fileName = input.getFileName();
		// gets file name, returns file name
		String expectedFileName = "UserInput.txt";
		// expected string created
		assertTrue(fileName.equals(expectedFileName));
		// test that get file name equals the expected file name
	}

	@Test
	public void testsThatBufferReaderIsCreated() throws Exception {
		BufferedReader reader = input.createReader(file);
		// tests that the buffer reader is created
		assertNotNull(reader);
		// tests that something is there
	}

	@Test
	public void testReadsFirstLineOnly_FromFile() throws Exception {
		BufferedReader reader = input.createReader(file);
		String actualLine = reader.readLine();
		// returns a line
		String expectedFirstLine = "Hi my name is Lauren! (i am learning java) 12345678910 & [java is cool] ";
		assertEquals(expectedFirstLine, actualLine);
		// tests that the line equals expected first line
	}

	@Test
	public void testReadMultipleLines_FromFile() throws IOException {
		BufferedReader reader = input.createReader(file);
		String actualOutcome = input.readAllLines(reader);
		// returns all lines read as a string
		String expectedOutcome = "Hi my name is Lauren! (i am learning java) 12345678910 & [java is cool] "
				+ "bfjbjkdbfbsdjf";
		assertEquals(expectedOutcome, actualOutcome);
		// tests that the reader is reading the same lines as the expected outcome
	}

}
