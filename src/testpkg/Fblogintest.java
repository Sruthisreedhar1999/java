package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.fbloginpage;

public class Fblogintest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void fbtest()
	{
		fbloginpage f=new fbloginpage(driver);
		f.setvalues("abc@gmail.com", "anju23");
		f.login();
	}

}
