package mavenPracticeProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAdd() {
		assertEquals(10,Calculator.add(5,5));
		assertEquals(-5,Calculator.add(-7,2));

	}
	@Test
	public void testSub() {
		assertEquals(5,Calculator.subtract(7,2));
		assertEquals(-2,Calculator.subtract(-4,-2));

	}
	@Test
	public void testProduct() {
		assertEquals(50,Calculator.product(10,5));
		assertEquals(-6,Calculator.product(2,-3));

	}
	@Test
	public void testQuotient() {
		assertEquals(2,Calculator.quotient(10,5));
		assertEquals(-3,Calculator.quotient(-9,3));

	}
}
