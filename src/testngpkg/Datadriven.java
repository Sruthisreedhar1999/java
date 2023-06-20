package testngpkg;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.FileInputStream;

public class Datadriven {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test() throws Exception
	{
		FileInputStream f=new FileInputStream("D:\\Book1");
		XSSFWorkbook wb=new XSSFWorkbook(f);//workbook details
		XSSFSheet sh=wb.getSheet("Sheet1");//sheet details
		int row=sh.getLastRowNum();//row details
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String pwd=sh.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(pwd);
			driver.findElement(By.name("login")).click();
			
			
		}
		
	}

}
