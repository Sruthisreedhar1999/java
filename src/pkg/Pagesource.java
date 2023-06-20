package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("Https://www.google.com");
		String src=driver.getPageSource();
		if(src.contains("Images"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("Text is not present");
		}
		

	}

}