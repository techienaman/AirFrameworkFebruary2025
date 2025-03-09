package Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private int retry=0;
    private static final int maxRetry=2;



    @Override
    public boolean retry(ITestResult iTestResult) {

        if(retry<maxRetry){
            retry++;
            return true;
        }
        return false;
    }
}
