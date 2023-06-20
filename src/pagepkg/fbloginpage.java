package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbloginpage {
	WebDriver driver;
	By fbemail=By.id("email");
	By fbpwd=By.id("pass");
	By fbloginbutton=By.name("login");
	public fbloginpage(WebDriver driver) {
		this.driver=driver;
	}
	public void setvalues(String email,String pwd)
	{
		driver.findElement(fbemail).sendKeys(email);

		driver.findElement(fbpwd).sendKeys(pwd);
		
	}
	public void login()
	{
		driver.findElement(fbloginbutton).click();
	}
}
