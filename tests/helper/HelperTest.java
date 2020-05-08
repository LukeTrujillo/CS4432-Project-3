package helper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelperTest {

	
	@Test
	void testZerotoInt() {
		assertEquals("004", Helper.padZerotoInt(4, 3));
		assertEquals("04", Helper.padZerotoInt(4, 2));
		assertEquals("999", Helper.padZerotoInt(999, 3));
	}
}
