package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test()
	{
		String pw=driver.getWindowHandle();
		System.out.println("parent window title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> allwh=driver.getWindowHandles();
		for(String handle:allwh)
		{
			if(!handle.equalsIgnoreCase(pw))
			{
				driver.switchTo().window(handle);
				String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).getText();
				System.out.println(s);
				driver.close();
			}
			driver.switchTo().window(pw);
		}
		
	}

}
