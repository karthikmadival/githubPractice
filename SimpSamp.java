package maven_pr;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpSamp {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		SearchContext si;
		WebDriver drivers;
		EventFiringWebDriver drrr;
		RemoteWebDriver ddddd;
		ChromeDriver fd;
		Set<String> as = driver.getWindowHandles();

//		driver.manage()
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@class='gb_Ue']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 4000);

		String Keyword = "Play";

		String element = "//ul[@class='LVal7b u4RcUd'] //following-sibling :: span [contains(text(),'" + Keyword
				+ "')]";

		driver.switchTo().frame(1);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(element))));

		driver.findElement(By.xpath(element)).click();
		
		Robot rb = new Robot();
		Actions name = new Actions(driver);
		
	
	}
}
