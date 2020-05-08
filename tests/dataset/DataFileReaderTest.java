package dataset;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

public class DataFileReaderTest {

	
	@Test
	void testGetLocalPath() { 
		DataFileReader reader = new DataFileReader(Dataset.A, 29);
		assertEquals("Project3Dataset-A/A29.txt", reader.getLocalPath());
		
		reader = new DataFileReader(Dataset.B, 99);
		assertEquals("Project3Dataset-B/B99.txt", reader.getLocalPath());
	}
	
	@Test
	void testDatasetPresent() {
		assertDoesNotThrow(() -> {
			DataFileReader reader = new DataFileReader(Dataset.A, 29);
			File file = new File(reader.getLocalPath());
			assertTrue(file.exists());
		});
		
		assertDoesNotThrow(() -> {
			DataFileReader reader = new DataFileReader(Dataset.B, 99);
			File file = new File(reader.getLocalPath());
			assertTrue(file.exists());
		});
	
	}
}
