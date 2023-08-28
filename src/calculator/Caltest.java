package calculator;


import org.junit.Assert;
import org.junit.Test;

public class Caltest {
	@Test
	public void testsum() {
		calculator calculator =new calculator();
		Assert.assertEquals(8, calculator.sum(3, 5));
	}
	@Test
	public void testsubtract() {
		calculator calculator =new calculator();
		Assert.assertEquals(2, calculator.subtract(5, 3));
	}
	@Test
	public void testmultiply() {
		calculator calculator =new calculator();
		Assert.assertEquals(6, calculator.multiply(2, 3));
	}
	@Test
	public void testdivide() {
		calculator calculator =new calculator();
		Assert.assertEquals(2.5, calculator.divide(5, 2),0.0001);
	}
}



