package pkg;
import org.openqa.selenium.chrome.ChromeDriver;
public class Firstscript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("Https://www.google.com");
		String actualtitle=driver.getTitle();
		System.out.println("actualtitle="+actualtitle);
		String expecttitle="Google";
		if(expecttitle.equals(actualtitle))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		

	}

}
