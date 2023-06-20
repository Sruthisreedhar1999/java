package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbcreate {
	WebDriver driver;
	By fbcreate=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbutton=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[2]/div/div[1]/div[2]/button/div/div");
	public Fbcreate(WebDriver driver) {
		this.driver=driver;
	}
	public void setvalues()
	{

		driver.findElement(fbcreate).click();
		
	}
	public void login()
	{
		driver.findElement(fbutton).click();
	}

}
