package ScreenshotDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	public static WebDriver driver;
	
	public static void initialize() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", new File(".").getCanonicalPath()+"/lib/Chrome/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	public void takeScreenshot(String method)
	{
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File(new File(".").getCanonicalPath()+"\\screenshot\\"+method+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	
	}
	

}
