package Utils;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter {

	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public String testcaseName, testcaseDec, author, category;
	public static  String excelFileName;
	
	@BeforeSuite
	public void startReport() {
		System.out.println("in BeforeSuite");
		reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true); 
		extent   = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
    @BeforeClass
	public void report() throws IOException {
    	System.out.println("in BeforeClass");
		test = extent.createTest(testcaseName, testcaseDec);
	    test.assignAuthor(author);
	    test.assignCategory(category);  
	}
    
    public void reportStep(String dec, String status) {
    	System.out.println("in reportstep");
    	if(status.equalsIgnoreCase("pass")) {
    		test.pass(dec);
    	} else if(status.equalsIgnoreCase("fail")) {
    		test.fail(dec); 
    	}
    }
    
    @AfterSuite
    public void stopReport() {
    	extent.flush();
    }
}
