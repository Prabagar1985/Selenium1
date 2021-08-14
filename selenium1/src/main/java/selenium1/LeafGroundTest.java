package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LeafGroundTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void openUrl()
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
			  
	}
	
	@Test
	public void textBoxTest()
	{
		driver.findElement(By.xpath("//h5[text()='Edit']")).click();;
		
		driver.findElement(By.id("email")).sendKeys("praba123@gmail.com");
		System.out.println("1st textbox input entered...");
		WebElement ele = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[2]/div[1]/div[1]/input[1]"));
		ele.sendKeys("text");
		System.out.println("2nd textbox ");
		ele.sendKeys(Keys.TAB);
		
		System.out.println(ele.getText());
		System.out.println("3rd textbox contains the text : "+ ele.getText());
		ele.sendKeys(Keys.TAB);
		
		ele.clear();
		System.out.println("4th textbox cleared");
		
		ele = driver.findElement(By.xpath("//label[contains(text(),'disabled')]//following::input"));
		
		if(!ele.isEnabled()) {
			System.out.println("5th textbox is disabled...");
		}else
		{
			System.out.println("5th textbox is NOT disabled...");
		}
		
		
	}
	
	public void linkTest()
	{
		
	}
	
	public void buttonTest()
	{
		
	}
	
	
	
}
