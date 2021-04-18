package test.common.ops.files;

/**
 * Test reading from files.
 * @author jahic
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import part.common.ops.files.ReadFromFile;

class TestReadFromFileTest {

	@Test
	void testReadFile() throws IOException
	{
		ReadFromFile readFromFile = new ReadFromFile("src/test/resources", "testRead.txt");
		
		LinkedList<String> lines1 = readFromFile.readFile();
		LinkedList<String> lines2 = readFromFile.readFile();

		assertEquals(lines1, lines2);
		
		lines2.clear();
		lines2.add("1"); lines2.add("2"); lines2.add("3");
		lines2.add("-4"); lines2.add("-4"); lines2.add("4");
		
		assertEquals(lines1, lines2);
	}

	@Test
	void testReadFileStringCharset() throws IOException {
	
		LinkedList<String> lines1 = ReadFromFile.readFile("src/test/resources/testRead.txt", Charset.defaultCharset());
		
		LinkedList<String> lines2 = new LinkedList<String>();
		lines2.add("1"); lines2.add("2"); lines2.add("3");
		lines2.add("-4"); lines2.add("-4"); lines2.add("4");
		
		assertEquals(lines1, lines2);
	}

	@Test
	void testGetNumberOfLines() throws IOException {
		ReadFromFile readFromFile = new ReadFromFile("src/test/resources", "testRead.txt");

		assertEquals(6, readFromFile.getNumberOfLines());
	}
	
	@Test
	void testReadFileLongInt() throws IOException {
		ReadFromFile readFromFile = new ReadFromFile("src/test/resources", "testRead.txt");
		
		
		LinkedList<String> lines = new LinkedList<String>();
		lines.add("3"); lines.add("-4"); lines.add("-4");
				
		assertEquals(lines, readFromFile.readFile(2, 3));
	}

}
