import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.calci.app.*;

class TestingCalculator {

	@Test
	void testadd()
	{
		assertEquals(50, Calculator.add(20, 30));
		
	}

	@Test
	void testsub()
	{
		assertEquals(10, Calculator.sub(30, 20));
	}

	@Test
	void testmul()
	{
		assertEquals(600, Calculator.mul(30, 20));
	}
}
