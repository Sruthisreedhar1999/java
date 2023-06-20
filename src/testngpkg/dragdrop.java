package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dragdrop {
	ChromeDriver driver;
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod(alwaysRun=true)
	public void urlloads()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test1()
	{
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));			
        WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        Actions act=new Actions(driver);						
        act.dragAndDrop(drag, drop).build().perform();	
        String s="Dropped!";
        String a=drop.getText();
        if(a.equals(s))
        {
        	System.out.println("passed");
        }
        else
        {
        	System.out.println("failed");
        }
	}
	}


