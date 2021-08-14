package selenium1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngTest1 {
	
	String url = "https://demoqa.com/";
	WebDriver driver;
	String title;
	
	@BeforeTest
	public void openUrl()
	{
		System.out.println("inside openurl");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Test
	public void test1()
	{
		System.out.println("inside test1");
		title = driver.getTitle();
		if(title.equalsIgnoreCase("ToolsQA"))
			System.out.println("Title is matching...");
		else
			System.out.println("Title is NOT matching...");
	}
	
	@Test 
	public void test2() throws Exception
	{
		
		driver.findElement(By.xpath("//div[@class='card-body']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		driver.findElement(By.className("text")).click();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("inside close browser");
		//driver.quit();
	}
	
	
}
