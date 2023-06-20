package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.expedia;

public class booking {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.expedia.com/");
	}
	@Test
	public void expediatest()
	{
		expedia f=new expedia(driver);
		f.setvalues();
		
	}

}


