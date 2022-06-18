import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSummation {
	
	@Test
	public void testAddition()
	{
		Summation sum = new Summation();
		assertEquals(5,sum.add(2, 3));
	
	}

}
