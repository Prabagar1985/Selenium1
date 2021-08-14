package Practice;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.testng.annotations.Test;

public class SendEmailAttachTest1 {
  @Test
  public void f() {
	  
	  
	  try {
		EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("C:\\Users\\Admin\\Downloads\\Prabagar Balakrishnan Lead Test Analyst Resume.pdf");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Prabagar Resume");
		  attachment.setName("Resume.pdf");

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
