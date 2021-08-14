package Practice;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.Reporter;


public class SendEmailAttachTest extends Reporter{
	
	@BeforeTest
	public void setData() {
		System.out.println("in BeforeTest");
		testcaseName = "TC001";
		testcaseDec = "Send Email with Attachment Test";
		author = "Praba";
		category = "Unit";
		excelFileName = "No input data";
	} 
	
	
	@Test
	public void test1()
	{
		System.out.println("inside Test1");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2()
	{
		System.out.println("inside Test2");
		Assert.assertTrue(false);
	}
	
	
  @AfterSuite
  public void f() {
	  
	  
	  
	  System.out.println("in AfterSuite");
	  try {
		  
		  reporter.flush();
		EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("./reports/result.html");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Prabagar Resume");
		  attachment.setName("test report.html");

		  // Create the email message
		  MultiPartEmail email = new MultiPartEmail();
		  email.setHostName("smtp.gmail.com");
		  email.setSmtpPort(465);
		  email.setSSL(true);
		  email.setAuthenticator(new DefaultAuthenticator("prabalearnselenium1@gmail.com", "learnselenium1"));
		  email.addTo("prabalearnselenium1@gmail.com");
		  email.setFrom("prabalearnselenium1@gmail.com", "Me");
		  email.setSubject("Resume");
		  email.setMsg("Here is the picture you wanted");

		  // add the attachment
		  email.attach(attachment);
		  // send the email
		  email.send();
	} catch (EmailException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  
}
