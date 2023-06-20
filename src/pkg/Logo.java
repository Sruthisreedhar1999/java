package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo {
				ChromeDriver driver;
				@Before
				public void setUp()
				{
					driver=new ChromeDriver();
					driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
				}
				@Test
				public void test1()
				{
					boolean logo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
					if(logo)
					{
						System.out.println("logo is present");
					}
					else
					{
						System.out.println("logo is not present");
					}
					//radio button selected or not
					boolean radio=driver.findElement(By.xpath("//input[@value='m']")).isSelected();
					if(radio)
					{
						System.out.println("selected");
					}
					else
					{
						System.out.println("not selected");
					}
				}
}
				


