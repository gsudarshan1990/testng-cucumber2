package examplererun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int counter=0;
	int max_count=4;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if (counter<max_count)
		{
			counter++;
			return true;
		}
		return false;
	}

}
