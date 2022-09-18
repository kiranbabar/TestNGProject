package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win-10\\Desktop\\chromeDriver\\chromedriver.exe");
      WebDriver driver =new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	}

}
