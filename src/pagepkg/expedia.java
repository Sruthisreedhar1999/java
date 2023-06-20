package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class expedia {
	WebDriver driver;
	By flight=By.id("uitk-tab-text");
	By travelers=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[1]/div/div[1]/div/div/button");
	/*By adult=By.xpath("//*[@id=\"app-layer-travelers-dialog-wizard-flight-pwa-1\"]/section/div[3]/div/div[2]/section/div[1]/div[1]/div/button[2]/span/svg/path");
	By child=By.xpath("//*[@id=\"app-layer-travelers-dialog-wizard-flight-pwa-1\"]/section/div[3]/div/div[2]/section/div[1]/div[2]/div/button[2]/span/svg");
	WebElement age=driver.findElement(By.xpath("//*[@id=\"child-age-input-0-0\"]"));
	Select agede=new Select(age);
	agede.selectByValue("3");
	By from=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[1]/div/div[1]/div/div/div[2]/div[1]/button");
	By to=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[1]/div/div[2]/div/div/div[2]/div[1]/button");
	WebElement economy=driver.findElement(By.xpath("//*[@id=\"preferred-class-input-trigger\"]"));
	Select economydetails=new Select(economy);
	economydetails.selectByVisibleText("First Class");*/
	public expedia(WebDriver driver) {
		this.driver=driver;
	}
	public void setvalues()
	{
		driver.findElement(flight).click();

		driver.findElement(travelers).click();
		
	}
	/*public void login()
	{
		driver.findElement(fbloginbutton).click();
	}
}*/


}
