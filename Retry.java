package maven_pr;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	
	private int IntialCount = 0;
	private int FinalCount = 3;		
	
	public boolean retry (ITestResult result) {
		// TODO Auto-generated method stub
		if (!result.isSuccess()) {
			if(IntialCount<FinalCount) {
				IntialCount++;
				return true;
			}
			
		}
		return false;
	}

}
