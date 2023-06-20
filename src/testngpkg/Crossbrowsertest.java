package testngpkg;

import org.openqa.selenium.WebDriver;

import com.beust.jcommander.Parameters;

public class Crossbrowsertest {
	WebDriver driver;
	@Parameters("browser");
	@BeforeTest
	public void setip(String browser)
	{
		if()
		driver=new ChromeDriver();
	}
	else 

}
