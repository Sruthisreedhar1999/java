package testngpkg;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



public class Loginvalidation {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test1()
	{
		 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sruthi@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("sruthi");
		driver.findElement(By.name("login")).click();
		String expectedurl="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg1NDM3MzI2LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		String actualurl=driver.getCurrentUrl();
		if(actualurl.equals(expectedurl))
		{
			System.out.println("login successfull");
		}
		else
		{
			System.out.println("login failed");
		}
	}

}
