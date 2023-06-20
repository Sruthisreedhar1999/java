package pkg;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
public class Junitscript {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.id("search2")).sendKeys("java",Keys.ENTER);
		String actualtitle=driver.getTitle();
		System.out.println("actualtitle="+actualtitle);
		
	}
	

}
