package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://www.google.com");
	}
	@Test(priority=1)
	public void test1()
	{
		String actualtitle=driver.getTitle();
		System.out.println("actualtitle="+actualtitle);
	}
	@Test(priority=2,invocationCount=2)
	public void test2()
	{
		String src=driver.getPageSource();
		if(src.contains("Images"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("Text is not present");
		}
		
	}
	@Test(priority=2,enabled=true)
	public void test3()
	{
		driver.findElement(By.xpath("//*[@aria-label='Gmail (opens a new tab)']")).click();
	}
	@AfterMethod
	public void teardown()
	{
		System.out.println("aftermethod");
	}

}
