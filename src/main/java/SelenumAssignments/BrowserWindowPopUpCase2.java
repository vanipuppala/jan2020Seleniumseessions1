package SelenumAssignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUpCase2 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\Browserservers\\BrowserServers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		//open the child window1
		driver.findElement(By.xpath("//a[text()='Good PopUp #1']")).click();
		System.out.println(driver.getTitle());
		
		Set<String>handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		
		//for parent window id
		String parentWinId=it.next();
		
		//for child windowId
		String childwinId=it.next();
		
		driver.switchTo().window(childwinId);
		System.out.println(driver.getTitle());
		driver.close();
		
		//switching to parent
		driver.switchTo().window(parentWinId);
		System.out.println(driver.getTitle());
		
		//open child window2
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #2']")).click();
		Set<String>handles1=driver.getWindowHandles();
		Iterator<String>it1=handles1.iterator();
		
		String parentwinid2=it1.next();
		
		String childwinId2=it1.next();
		
		driver.switchTo().window(childwinId2);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
