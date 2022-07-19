package maven_pr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class opn {

	public class NewTest {

	    public WebDriver driver;

	    @Test
	   public void main() throws Exception {
		
		   	
	            System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	            driver = new ChromeDriver();
	            driver.manage().deleteAllCookies();
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	            driver.get("http://www.ebay.com");
	            Thread.sleep(4000);
	            driver.quit();
	            System.out.println("Test passed");
	       
	}
	    	  
	    
	}
}
