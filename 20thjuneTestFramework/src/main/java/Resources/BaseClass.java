package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public WebDriver driver;
public WebDriver browserLaunch() throws IOException {

	//to read the data.properties file
	FileInputStream fis=new FileInputStream("C:\\Users\\Win-10\\eclipse-workspace\\20thjuneTestFramework\\src\\main\\java\\Resources\\data.properties");
	
	//to access the data.properties file
	
	Properties prop=new Properties();
	
    prop.load(fis);

    String browserName =prop.getProperty("browser");

if(browserName.equalsIgnoreCase("chrome")) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win-10\\Desktop\\chromeDriver\\chromedriver.exe");
     driver =new ChromeDriver();
}
else if(browserName.equalsIgnoreCase("Firefox")) {
	//firefox code
	
}else if(browserName.equalsIgnoreCase("Edge")) {
	//edge code


}else {
	
}
System.out.println("please select valid browser");

return  driver;
}


}
