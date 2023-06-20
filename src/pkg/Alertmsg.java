package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmsg {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///D:/alert_example.html");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//input[@value='Display alert box']")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		if(text.equalsIgnoreCase("Hello Iam alert box!!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sruthi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sreedhar");
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		
	}
	}


