package com.xpts.csg.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;

public class PdfManager {

	public void createPDFFile() {

		try {

			Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
					Font.NORMAL);
			Font blueFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
					Font.NORMAL, BaseColor.BLUE);
			OutputStream file = new FileOutputStream(new File(
					"C:/PDF/PDFTEMP/ThirdPdf.pdf"));
			Document document = new Document();
			Paragraph para = new Paragraph();
			Paragraph preface = new Paragraph();
			PdfWriter.getInstance(document, file);

			// Inserting Image in PDF
			Image image = Image.getInstance("C:/PDF/PDFTEMP/CGS Image.png");
			image.scaleAbsolute(315f, 80f);// image width,height

			document.open();// PDF document opened........
			document.add(image);

			Chunk glue = new Chunk(new VerticalPositionMark());

			para.add(Chunk.NEWLINE);
			para.add(Chunk.NEWLINE);

			Paragraph ptes = new Paragraph("");
			Paragraph ptes1 = new Paragraph("");
			Paragraph ptes2 = new Paragraph("");
			Paragraph p = new Paragraph("Your Ref:Reference", smallBold);
			Paragraph p1 = new Paragraph("Address", smallBold);
			Paragraph p2 = new Paragraph("Posbus 154", smallBold);
			Paragraph p3 = new Paragraph("WINGATE PARK", smallBold);
			Paragraph p4 = new Paragraph("0153", smallBold);
			Paragraph p5 = new Paragraph("", smallBold);
			Paragraph p6 = new Paragraph("", smallBold);
			ptes.add(new Chunk(glue));
			ptes.add("");
			ptes1.add(new Chunk(glue));
			ptes1.add("");
			ptes2.add(new Chunk(glue));
			ptes2.add("");

			/*
			 * preface.add(new Chunk(glue)); //p.add("The Surveyor General");
			 * preface.add("The Surveyor Generals"); preface.add(new
			 * Paragraph("cnr Pretorius and Bosman Streets")); preface.add(new
			 * Paragraph("Pretoria")); preface.add(new Paragraph("0001"));
			 * preface.add(new Paragraph("Tel : (012) 303-1600"));
			 * preface.add(new Paragraph("Fax : (012)323-1527"));
			 * preface.add(new Paragraph("Date:" + new Date()));
			 * preface.setAlignment(Element.ALIGN_CENTER);
			 */

			p.add(new Chunk(glue));
			p.add("The Surveyor General");
			p1.add(new Chunk(glue));
			p1.add("cnr Pretorius and Bosman Streets");
			p2.add(new Chunk(glue));
			p2.add("Pretoria");
			p3.add(new Chunk(glue));
			p3.add("0001");
			p4.add(new Chunk(glue));
			p4.add("Tel : (012) 303-1600");
			p5.add(new Chunk(glue));
			p5.add("Fax : (012)323-1527");
			p6.add(new Chunk(glue));
			p6.add("Date:" + new Date());
			p.setAlignment(p.ALIGN_CENTER);

			para.add(Chunk.NEWLINE);
			para.add(Chunk.NEWLINE);
			para.add(Chunk.NEWLINE);

			para.add(new Paragraph("Sir/Madam,", smallBold));
			para.add(Chunk.NEWLINE);
			para.add(new Paragraph(
					"I hereby acknowledge receipt of the following documents in respect of:",
					smallBold));
			para.add(Chunk.NEWLINE);
			para.add(Chunk.NEWLINE);
			para.add(new Paragraph("Survey Description", blueFont));
			para.add(Chunk.NEWLINE);
			para.add(Chunk.NEWLINE);
			para.add(new Paragraph(
					"Please quote the following reference(s) in all enquiries batch number Batch Numberconsisting of:",
					smallBold));
			para.add(Chunk.NEWLINE);
			para.add(new Paragraph("Document type	Document Number", blueFont));

			para.add(Chunk.NEWLINE);
			para.add(Chunk.NEWLINE);

			para.add(new Paragraph(" Yours faithfully,"));

			para.add(Chunk.NEWLINE);
			para.add(Chunk.NEWLINE);

			para.add(new Paragraph(" Name Surname"));
			para.add(Chunk.NEWLINE);
			para.add(new Paragraph(" ____________________ "));
			para.add(Chunk.NEWLINE);
			para.add(new Paragraph(" for Surveyor-General "));
			para.add(Chunk.NEWLINE); // Something like in HTML :-)

			document.add(ptes);
			document.add(ptes1);
			document.add(ptes2);
			document.add(p);
			document.add(p1);
			document.add(p2);
			document.add(p3);
			document.add(p4);
			document.add(p5);
			document.add(p6);
			document.add(preface);
			document.add(para);

			document.close();

			file.close();

			System.out.println("Pdf created successfully..");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
