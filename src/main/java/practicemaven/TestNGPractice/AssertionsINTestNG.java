package practicemaven.TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsINTestNG {

	@Test
	public void test() {
		Assert.assertTrue(true);
			
	}
	@Test
	public void test2() {
		Assert.assertTrue(false);
			
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("America", "American");
			
	}
}
