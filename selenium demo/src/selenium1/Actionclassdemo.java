package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclassdemo {

	public static void main( String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win-10\\Desktop\\chromeDriver\\chromedriver.exe");
	      WebDriver driver =new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	WebElement a=driver.findElement(By.xpath("//button[@id='openwindow']"));  
		  
		  Actions obj =new Actions(driver);
		  obj.contextClick(a).perform();
	
	obj.doubleClick(a).perform();
	}





}
