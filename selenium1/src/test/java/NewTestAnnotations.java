import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestAnnotations {
  @Test
  public void f1() {
	  System.out.println("in Test1");
  }
  
  @Test
  public void f2() {
	  System.out.println("in Test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("in before method");
  }

  @AfterMethod
  public void afterMethod() {
  
	  System.out.println("in after method");
  }

  @BeforeClass
  public void beforeClass() {System.out.println("in before class");
  }

  @AfterClass
  public void afterClass() {System.out.println("in after class");
  }

  @BeforeTest
  public void beforeTest() {System.out.println("in before test");
  }

  @AfterTest
  public void afterTest() {System.out.println("in after test");
  }

  @BeforeSuite
  public void beforeSuite() {System.out.println("in before suite");
  }

  @AfterSuite
  public void afterSuite() {System.out.println("in after suite");
  }

}
