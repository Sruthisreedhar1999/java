package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonwh {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test()
	{
		String pw=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Set<String> allwh=driver.getWindowHandles();
		for(String handle:allwh)
		{
			if(!handle.equalsIgnoreCase(pw))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.id("add-to-cart-button")).click();
				driver.close();
			}
			driver.switchTo().window(pw);
		}
	}

}
