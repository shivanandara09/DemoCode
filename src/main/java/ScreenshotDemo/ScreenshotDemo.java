package ScreenshotDemo;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(CustomListner.class)
public class ScreenshotDemo extends Base {

	
	@BeforeMethod()
	public static void intialize() throws IOException
	{
		initialize();
	}

	@Test()
	public void takescreenshotTest() throws IOException
	{
		Assert.assertEquals(true, false);
	}
	

	@Test()
	public void takescreenshotTest1()
	{
		Assert.assertEquals(true, false);
	}
	
	@Test()
	public void takescreenshotTest2()
	{
		Assert.assertEquals(true, false);
	}

	@AfterMethod()
	public void closeBrowser(){
		driver.quit();
	}
}
