package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groupingng {
	ChromeDriver driver;
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod(alwaysRun=true)
	public void urlloads()
	{
		driver.get("https://www.google.com");
	}
	@Test(groups= {"smoke"})
	public void test1()
	{
		String actualtitle=driver.getTitle();
		System.out.println("actualtitle="+actualtitle);
	}
	@Test(groups= {"sanity"})
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
	@Test(groups= {"smoke,sanity"})
	public void test3()
	{
		System.out.println("test3");
	}

}
