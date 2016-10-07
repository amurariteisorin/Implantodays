package ro.implantodays.controllers;

	import java.util.Properties;

	import javax.mail.Message;
	import javax.mail.MessagingException;
	import javax.mail.Session;
	import javax.mail.Transport;
	import javax.mail.internet.AddressException;
	import javax.mail.internet.InternetAddress;
	import javax.mail.internet.MimeMessage;
	

	public class email {

		Properties emailProperties;
		Session mailSession;
		MimeMessage emailMessage;

		String emailHost = "smtp.gmail.com";
		String emailPort = "587";
		String fromUser = "implantodays2016@gmail.com";
		String fromUserEmailPassword = "Implantium2016";
		String[] toEmails = { "amurariteisorin@gmail.com" };

		public void setMailServerProperties() {
			emailProperties = System.getProperties();
			emailProperties.put("mail.smtp.port", emailPort);
			emailProperties.put("mail.smtp.auth", "true");
			emailProperties.put("mail.smtp.starttls.enable", "true");
		}

		public void createEmailMessage(String emailSubject, String emailBody)
				 {
			try{
			mailSession = Session.getDefaultInstance(emailProperties, null);
			emailMessage = new MimeMessage(mailSession);
			for (int i = 0; i < toEmails.length; i++) {
				emailMessage.addRecipient(Message.RecipientType.TO,
						new InternetAddress(toEmails[i]));
			}
			emailMessage.setSubject(emailSubject);
			emailMessage.setContent(emailBody, "text/html");// for a html email
			// emailMessage.setText(emailBody);// for a text email
			}
			catch(Exception e){
				e.printStackTrace();
				
			}

		}

		public void sendEmail(){
			try{
			Transport transport = mailSession.getTransport("smtp");
			transport.connect(emailHost, fromUser, fromUserEmailPassword);
			transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
			transport.close();
			}
			catch(Exception e){
				e.printStackTrace();
				
			}
		}
	}
