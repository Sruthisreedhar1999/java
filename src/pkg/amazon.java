package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//div[@class='nav-search-field']input[1] ")).sendKeys("iphone",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='a-row a-spacing-micro']/span[2]")).click();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.name("email")).sendKeys("sruthi@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[8]")).click();
		driver.findElement(By.id("nav-hamburger-menu")).click();//
		
		
		
		
	}

}
