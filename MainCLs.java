package maven_pr;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class MainCLs {

	public static WebDriver driver;

	@Test
	// (retryAnalyzer = Retry.class)
	public void main() throws IOException {

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver(getChromeOption());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://testautomationu.applitools.com/learningpaths.html");
		// driver.manage().ime().isActivated();
		WebElement ele = driver.findElement(By.xpath("(//div[@class='card mb-4 shadow-lg'])[4]"));
		File source = ele.getScreenshotAs(OutputType.FILE);
		File dest = new File("./element screenshot.png");
		FileHandler.copy(source, dest);

		// assertEquals(true, false);

	}

	@AfterMethod
	public void getscreenshot(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			TakesScreenshot screen = (TakesScreenshot) driver;
			File path = screen.getScreenshotAs(OutputType.FILE);
			try {
				Files.move(path, new File("./test.png"));
				System.out.println();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public ChromeOptions getChromeOption() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-infobars");
		// option.setHeadless(true);
		return option;
	}

}
