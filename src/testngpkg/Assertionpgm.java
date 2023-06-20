package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Assertionpgm {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test1()
	{
		WebElement buttonElement=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		boolean isButtonDisplayed = buttonElement.isDisplayed();
		 Assert.assertTrue(isButtonDisplayed, "Button is not displayed on the webpage.");
	}
	

}
