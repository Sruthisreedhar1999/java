package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpgm {
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
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("05");
		List<WebElement>li=daydetails.getOptions();
		System.out.println("count of day="+li.size());
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("JAN");
		List<WebElement>lm=daydetails.getOptions();
		System.out.println("count of day="+lm.size());
		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("2023");
		List<WebElement>ly=daydetails.getOptions();
		System.out.println("count of day="+ly.size());
		
		
	}
}
