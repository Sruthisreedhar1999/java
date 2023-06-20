package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookscript {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
		
		driver.findElement(By.name("email")).sendKeys("sruthi@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("hsjjsbsss");
		driver.findElement(By.name("login")).click();
		
	}

}
