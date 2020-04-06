package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Browserservers\\BrowserServers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();


		driver.get("https://app.hubspot.com/login");
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		System.out.println(driver.getTitle());
		
		

	}

}
