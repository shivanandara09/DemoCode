package retryanalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{  
	int counter=0;
	int executionLimit=2;

	public boolean retry(ITestResult result) //method name should be same 
	{
		if(counter<executionLimit)
		{
			counter++;
			return true;
		}
		else
			return false;
	}

}
