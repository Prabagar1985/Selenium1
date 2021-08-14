package test2;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class LeafGroundTest1 extends BaseMethods {

	@BeforeTest
	public void init()
	{
		initDriver();
	}
	
	@Test(priority = 0)
	public void noOfElementsInHomePage()
	{
		Assert.fail();
	}
	
	@Test(priority = 1)
	public void textBoxTest()
	{
		
	}
	
	@Test(priority = 1)
	public void buttonTest()
	{
		
	}
	
	@Test(priority = 1)
	public void linksTest()
	{
		
	}
	
	@Test(priority = 1)
	public void dropDownTest()
	{
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	
}
