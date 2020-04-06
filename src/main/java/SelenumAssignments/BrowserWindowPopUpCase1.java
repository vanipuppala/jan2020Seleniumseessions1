package SelenumAssignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUpCase1 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\Browserservers\\BrowserServers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		//open the 2 child windows
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #1']")).click();
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #2']")).click();
		
		Set<String>handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		
		String parentwinId=it.next();
		String childwinId1=it.next();
		String childwinId2=it.next();
		
		//switching to child window1
		driver.switchTo().window(childwinId1);
		System.out.println(driver.getTitle());
		driver.close();
		//switchinhg to child window2
		
		driver.switchTo().window(childwinId2);
		System.out.println(driver.getTitle());
		driver.close();
		
		//switching to parent window
		driver.switchTo().window(parentwinId);
		System.out.println(driver.getTitle());
		driver.quit();
		
		

	}

}
