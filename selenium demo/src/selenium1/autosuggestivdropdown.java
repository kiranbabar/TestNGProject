package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestivdropdown {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win-10\\Desktop\\chromeDriver\\chromedriver.exe");
	      WebDriver driver =new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
WebElement b=driver.findElement(By.xpath("//input[@id='autosuggest']"));
	b.sendKeys("Ind");
	Thread.sleep(2000);

List<WebElement> a=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
	
for(WebElement k:a) {
	 if(k.getText().equalsIgnoreCase("India")) {
		 k.click();
	break;
	 
	 }
 }

	/*for(int i=0; i<a.size();i++) {
		
		if(a.get(i).getText().equalsIgnoreCase("India")) {
			a.get(i).click();
		break;
		}
	}*/

	}
}

