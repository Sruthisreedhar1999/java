package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertpgm {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test()
	{
		 WebElement f = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	        f.sendKeys("D:\\Book1.xlsx");
	        driver.findElement(By.name("terms")).click();
	        driver.findElement(By.name("send")).click();
	        
	}

}
