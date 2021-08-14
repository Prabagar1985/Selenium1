package Practice;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

public class SendEmailTest {

	
	@Test
	public void sendMail()
	{
		try {
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("prabalearnselenium1@gmail.com", "learnselenium1"));
			email.setSSLOnConnect(true);
			email.setFrom("prabalearnselenium1@gmail.com");
			email.setSubject("TestMail");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("praba123@gmail.com");
			email.send();
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
