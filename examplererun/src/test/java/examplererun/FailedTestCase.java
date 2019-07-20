package examplererun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCase {

	
	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void first_test()
	{
		Assert.assertEquals(true, false);
	}
	
	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void second_test()
	{
		Assert.assertEquals(false, true);
	}
}
