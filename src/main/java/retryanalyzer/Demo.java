package retryanalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

	@Test(retryAnalyzer=retryanalyzer.RetryAnalyzer.class)
	public void verifyTitle()
	{
		Assert.assertEquals(true, false);
	}
}
