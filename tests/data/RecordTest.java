package data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataset.Dataset;

public class RecordTest {
	
	@Test
	void testRecordToString() {
		Record record = new Record(Dataset.A, 28, 1, "Name", "address", 180);
		
		String expected = "A28-Rec001, Name001, address001, 0180...";
	
		assertEquals(expected, record.toString());
		assertEquals(40, record.toString().length());
		
		record = new Record(Dataset.B, 28, 1, "Name", "address", 180);
		
		expected = "B28-Rec001, Name001, address001, 0180...";
	
		assertEquals(expected, record.toString());
		assertEquals(40, record.toString().length());
	}

}
