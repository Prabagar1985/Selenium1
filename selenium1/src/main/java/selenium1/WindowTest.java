package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/");
		WebElement win = driver.findElement(By.xpath("//h5[text()='Window']"));
		win.click();
		
		//driver.switchTo().window(main);
		
		String title = driver.getTitle();
		System.out.println("Window title : "+title);
		
		System.out.println("Working on first window popup");
		String main = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		Set<String> winList1 = driver.getWindowHandles();

		for(String x: winList1) {
			driver.switchTo().window(x);
			System.out.println("Popup window title : "+ driver.getTitle());
			driver.switchTo().window(main);
		}

		

	}

}
