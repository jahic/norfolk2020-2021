package test.common.ops.files;

/**
 * Test different file operations.
 * @author jahic
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import part.common.ops.files.FileOperation;

class Test_FileOperationTest {
	@Test
	void testGetTextFileName() {
		FileOperation fileOperation = new FileOperation("src/test/resources", "testRead.txt");
		
		assertEquals("testRead.txt", fileOperation.getTextFileName());
	}

	@Test
	void testGetTextFolderName() {
		FileOperation fileOperation = new FileOperation("src/test/resources", "testRead.txt");
		
		assertEquals("src/test/resources", fileOperation.getTextFolderName());
	}

	@Test
	void testGetFileSizeBytes() {
		//FileOperation fileOperation = new FileOperation("src/test/resources", "testRead.txt");
		
		//assertEquals(18.0, fileOperation.getFileSizeBytes());	
	}

	@Test
	void testGetFileSizeKiloBytes() {
		FileOperation fileOperation = new FileOperation("src/test/resources", "testRead.txt");

		//assertEquals(0.017578125, fileOperation.getFileSizeKiloBytes());
	}

	@Test
	void testGetFileSizeMegaBytes() {
		FileOperation fileOperation = new FileOperation("src/test/resources", "testRead.txt");

		//assertEquals(1.71661376953125E-5, fileOperation.getFileSizeMegaBytes());
	}

}
