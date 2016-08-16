package com.xpts.csg.ui.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.mail.MessagingException;

import com.xpts.csg.util.MailManager;
import com.xpts.csg.util.PdfManager;

@ManagedBean(name = "emailPdfController", eager = true)
@RequestScoped
public class EmailPdfController {

	String message = "";
	String subject = "";
	String toAddress = "vijaykumarraju@gmail.com";
	String fromAddress = "swaroopeswara@gmail.com";
	PdfManager pdfManager = new PdfManager();

	public void pdfAndEmailGeneration() throws MessagingException {
		System.out.println("Entered into the method pdfAndEmailGeneration");
		pdfManager.createPDFFile();
		MailManager mailManager = new MailManager(toAddress, fromAddress);
		mailManager.start();
	}

}
