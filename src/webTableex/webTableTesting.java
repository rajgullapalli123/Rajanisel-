package webTableex;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webTableTesting 
{
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
	}
	@Test
	public void webtabletest()
	{
		String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
				
		String part2="]/td[1]/a";
		System.out.println(driver.findElement(By.xpath(part1+1+part2)).getText());
	/*for (int i=0;i<36;i++)
		{
			String x =driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(x);
		}
		*/		
	}
}
