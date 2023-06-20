package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///D:/alert_example.html");
	}
	@Test
	public void test1() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D://scrnshot.png"));
		WebElement button=driver.findElement(By.xpath("//input[@value='Display alert box']"));
		File src1=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("./scrnshot/error.png"));
				
		
	}
	} 

