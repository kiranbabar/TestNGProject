package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframes {

	public static void main(String[]args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win-10\\Desktop\\chromeDriver\\chromedriver.exe");
	      WebDriver driver =new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/frames" );
	
	driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
	
	WebElement a=driver.findElement(By.xpath("//frame[@name='frame-top']"));
	
	driver.switchTo().frame(a);
	
	WebElement b=driver.findElement(By.xpath("//frame[@name='frame-middle']"));
	driver.switchTo().frame(b);
	
	System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
	
	
	
	
	}
	
	
	
	
}
