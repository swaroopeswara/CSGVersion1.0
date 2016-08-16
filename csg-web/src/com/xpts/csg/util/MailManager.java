package com.xpts.csg.util;

import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailManager extends Thread {

	public static ResourceBundle SMTP = ResourceBundle
			.getBundle("com.xpts.csg.resource.smtp");
	public static ResourceBundle BUNDLE = ResourceBundle
			.getBundle("com.xpts.csg.resource.bundle");

	private static final Properties props = convertBundleToProperty(SMTP);

	private String toAddress;
	private String fromAddress;
	private String password;
	private String messagebody;

	@Override
	public void run() {
		this.sendEmail();
	}

	public MailManager(String toAddress, String fromAddress) {
		this.toAddress = toAddress;
		this.fromAddress = fromAddress;
	}

	public void sendEmail() {
		System.out.println("Entered into the method sendEmail");
		
		final String userName = BUNDLE.getString("mail.username");
		final String password = BUNDLE.getString("mail.password");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(userName, password);
					}

				});

		try {

			// Create a default MimeMessage object.
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromAddress));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(toAddress));
			message.setSubject("Testing Subject");
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setText("This is message body");
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);
			messageBodyPart = new MimeBodyPart();
			String filename = "C:/PDF/PDFTEMP/ThirdPdf.pdf";
			DataSource source = new FileDataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(filename);
			multipart.addBodyPart(messageBodyPart);
			message.setContent(multipart);
			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException e) {

			throw new RuntimeException(e);

		}

	}

	public static Properties convertBundleToProperty(ResourceBundle bundle) {
		Properties props = new Properties();
		Enumeration<String> keys = bundle.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			props.put(key, bundle.getString(key));
		}
		return props;
	}

}
