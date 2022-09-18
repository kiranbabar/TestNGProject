package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
//this driver have no scope
	public WebDriver driver;
private By username=By.xpath("//input[@id='username']");
private By password=By.xpath("//input[@id='password']");
private By LoginButton=By.xpath("//input[@id='Login']");
private By TryforFree=By.xpath("//a[@id='signup_link']");

public LoginPageObject(WebDriver driver2) {
	this.driver=driver2;
}
public WebElement EnterUsername() {
	return driver.findElement(username);
}
public WebElement EnterPassword()	{
	return driver.findElement(password);
}

public WebElement ClickLogin() {
	return driver.findElement(LoginButton);
}

public WebElement ClickOnTryforFree() {
	return driver.findElement(TryforFree);
}









}
