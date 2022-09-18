package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win-10\\Desktop\\chromeDriver\\chromedriver.exe");
	      WebDriver driver =new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	driver.manage().window().maximize();
	
	WebElement a=driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
	a.click();
	Thread.sleep(2000);
	for(int i=0; i<6;i++ ) {
		
	WebElement b=driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
	b.click();
	
	for(int j=0; j<7;j++) {
	driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
	}
	
	for (int k=0; k<4;k++) {
		driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
	}
	System.out.println(driver.switchTo().alert().getText());
	
	
	}
	 
	
	
	}

}
