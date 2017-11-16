import junit.framework.TestCase;

public class OperatorTest extends TestCase {
	Operator obj;
	int a;
	int b;
	int rad;
	protected void setUp() throws Exception {
	 obj= new Operator();
		a=3;
		b=2;
		rad=2;
		
	}

	protected void tearDown() throws Exception {
		
obj= null;
a=0;
b=0;
		
		
		
	}
	public void testMultiplyFail() {
		assertEquals(6,obj.multiply(a, b));
		
	}

	public void testMultiply() {
		assertEquals(6,obj.multiply(a, b));
		
	}

	public void testAreaofCircle()
	{
		assertEquals(12.56f,obj.AreaOfCircle(rad));
	}
	
	public void testRectangle()
	{
		assertEquals(6,obj.Rectangle(a, b));
	}
	
	public void testAreaofTriangle()
	{
		assertEquals(3.0f,obj.AreaofTriangle(a, b));
	}
}