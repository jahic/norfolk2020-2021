package test.common.ops.files;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import part.common.ops.files.ReadFromFile;
import part.common.ops.files.WriteToFile;

class TestWriteToFile {

	@Test
	void testWriteToFileString() throws IOException {
		String folderName = "src/test/resources";
		String fileName = "testWrite.txt";
		
		WriteToFile writeToFile = new WriteToFile("src/test/resources", "testWrite.txt");
		
		LinkedList<String> lines1 = new LinkedList<String>();
		lines1.add("1"); lines1.add("Norfolk"); lines1.add("Cambridge");
		
		for(String s:lines1)
			writeToFile.writeToFile(s);
		
		ReadFromFile readFromFile = new ReadFromFile(folderName, fileName);
		
		LinkedList<String> lines2 = readFromFile.readFile();
		
		assertEquals(lines1, lines2);
	}

	@Test
	void testWriteTempBufferToFile() throws IOException
	{
		String folderName = "src/test/resources";
		String fileName = "testWrite.txt";
		
		WriteToFile writeToFile = new WriteToFile("src/test/resources", "testWrite.txt");
		
		writeToFile.setUseBufferedWriter(true);
		
		LinkedList<String> lines1 = new LinkedList<String>();
		lines1.add("1"); lines1.add("Norfolk"); lines1.add("Cambridge");
		
		for(String s:lines1)
			writeToFile.writeToFile(s);
		
		writeToFile.writeTempBufferToFile();
		
		ReadFromFile readFromFile = new ReadFromFile(folderName, fileName);
		
		LinkedList<String> lines2 = readFromFile.readFile();
		
		assertEquals(lines1, lines2);
	}

	@Test
	void testWriteToTempBuffer() throws IOException
	{
		String folderName = "src/test/resources";
		String fileName = "testWrite.txt";
		
		WriteToFile writeToFile = new WriteToFile("src/test/resources", "testWrite.txt");
		
		LinkedList<String> lines1 = new LinkedList<String>();
		lines1.add("1"); lines1.add("Norfolk"); lines1.add("Cambridge");
		
		for(String s:lines1)
			writeToFile.writeToTempBuffer(s);
		
		writeToFile.writeTempBufferToFile();
		
		ReadFromFile readFromFile = new ReadFromFile(folderName, fileName);
		
		LinkedList<String> lines2 = readFromFile.readFile();
		
		assertEquals(lines1, lines2);
	}
}
