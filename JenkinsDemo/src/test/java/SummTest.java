import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SummTest {
	
	Summ obj;
	int c, d;
	

	@Before
	public void setUp() throws Exception {
		obj = new Summ(); 
		c=2;
		d=3;
			
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		c=0;
		d=0;
		
	}

	@Test
	public void testMultiply() {
		assertEquals(5, obj.multiply(c, d));
	}

}
