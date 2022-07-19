package maven_pr;

import java.util.Set;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SimpSamp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		SearchContext si;
		WebDriver drivers;
		EventFiringWebDriver drrr;
		RemoteWebDriver ddddd;
		ChromeDriver fd;
		Set<String> as = driver.getWindowHandles();
		
WebDriver asd = driver.switchTo().window("asd");

	}
}
