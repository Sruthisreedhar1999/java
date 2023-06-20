package pkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodepgm {
		ChromeDriver driver;
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
		@Test
		public void test() throws IOException
		{
			List<WebElement> links=driver.findElements(By.tagName("a"));
			 System.out.println("total no of links="+links.size());
			for(WebElement u:links){
				 String link=u.getAttribute("href");
				 verify(link);
			}
			
}
		private void verify(String link) throws IOException  {
			URL n=new URL(link);
			HttpURLConnection con	=(HttpURLConnection)n.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("Response code is 200----"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("Response code is 404----"+link);
			}
		}
}
	
	
