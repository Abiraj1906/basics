package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_analyzer implements IRetryAnalyzer{
	 private int retryCount = 0;
	    private static final int maxRetryCount = 2;
	    private static final int waitTime = 2000; // 2 seconds
	@Override
	public boolean retry(ITestResult result) {
		

        if (retryCount < maxRetryCount) {
            retryCount++;

            try {
                Thread.sleep(waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }
		
		
		
		
		
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
