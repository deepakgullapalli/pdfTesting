package pdft;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class pdf {

	public static void main(String args[]) throws DocumentException, IOException {
		String dest = "C:\\Users\\NICHEBIT\\Downloads\\sample.pdf";
		Document document = new Document();
		document.setMargins(30, 30, 30, 30);

		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(dest));

		PdfWriter writer = PdfWriter.getInstance(document, bufferedOutputStream);
		footer event = new footer();

		writer.setPageEvent(event);
		document.open();
		generateReport(document);

		document.close();
		bufferedOutputStream.close();
	}

	public static void generateIsNotAvailable(Document document) throws DocumentException {

		Font boldFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
		Font normalFont = new Font(Font.FontFamily.HELVETICA, 10);
		PdfPTable table = new PdfPTable(2);
		table.setWidthPercentage(100);

		// table1
		PdfPCell HeaderCell;
		HeaderCell = new PdfPCell(new Phrase("IS NOT Analysis", boldFont));
		HeaderCell.setColspan(2);
		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
		HeaderCell.setBackgroundColor(new BaseColor(192, 192, 192));
		table.addCell(HeaderCell);

		String Table1HeaddersArr[] = { "Problem Description", "Form: D2/3" };
		for (int i = 0; i < Table1HeaddersArr.length; i++) {
			HeaderCell = new PdfPCell(new Phrase(Table1HeaddersArr[i], normalFont));

			HeaderCell.setMinimumHeight(20);
			HeaderCell.setUseAscender(true);
			HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(HeaderCell);
		}

		HeaderCell = new PdfPCell(new Phrase("Problem Description :", normalFont));
		HeaderCell.setColspan(2);
		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(HeaderCell);

		HeaderCell = new PdfPCell(new Phrase("Problem Statement :", normalFont));
		HeaderCell.setColspan(2);
		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(HeaderCell);

		// table2
		PdfPTable table2 = new PdfPTable(5);
		table2.setWidthPercentage(100);
		// Headdes

		String Table2HeaddersArr[] = { "Problem Description", "IS", "IS NOT ", "Get Information" };
		for (int i = 0; i < Table2HeaddersArr.length; i++) {
			HeaderCell = new PdfPCell(new Phrase(Table2HeaddersArr[i], normalFont));
			if (Table2HeaddersArr[i].equals("Problem Description")) {
				HeaderCell.setColspan(2);
			}

			HeaderCell.setMinimumHeight(20);
			HeaderCell.setUseAscender(true);
			HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table2.addCell(HeaderCell);
		}

		// RealData
		HeaderCell = new PdfPCell(new Phrase("WHAT", normalFont));
		HeaderCell.setRowspan(2);

		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table2.addCell(HeaderCell);
		HeaderCell = new PdfPCell(new Phrase("Object", normalFont));

		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table2.addCell(HeaderCell);

		HeaderCell = new PdfPCell(new Phrase("\r\n"
				+ "It looks like you're asking for a paragraph with 100 characters. Here's an example using the iText library in Java:",
				normalFont));
		HeaderCell.setPadding(3);

		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table2.addCell(HeaderCell);
		HeaderCell = new PdfPCell(new Phrase("WHAT", normalFont));

		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table2.addCell(HeaderCell);
		HeaderCell = new PdfPCell(new Phrase("WHAT", normalFont));

		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table2.addCell(HeaderCell);
		HeaderCell = new PdfPCell(new Phrase("Defect", normalFont));

		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table2.addCell(HeaderCell);
		HeaderCell = new PdfPCell(new Phrase("WHAT", normalFont));

		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table2.addCell(HeaderCell);
		HeaderCell = new PdfPCell(new Phrase("\r\n"
				+ "It looks like you're asking for a paragraph with 100 characters. Here's an example using the iText library in Java:",
				normalFont));
		HeaderCell.setPadding(3);

		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table2.addCell(HeaderCell);
		HeaderCell = new PdfPCell(new Phrase("WHAT", normalFont));

		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table2.addCell(HeaderCell);

		document.add(table);
		document.add(table2);
	}

	public static void generate_Why_Analysis(Document document) throws DocumentException {

		Font boldFont = new Font(Font.FontFamily.HELVETICA, 8, Font.BOLD);
		Font normalFont = new Font(Font.FontFamily.HELVETICA, 7);
		PdfPTable table = new PdfPTable(8);
		float[] columnWidths = { 1.5f, 1f, 1f, 1f, 1f, 1f, 1f, 1f };
		table.setWidths(columnWidths);
		table.setWidthPercentage(100);
		setCell(table, "Why Analysis", boldFont, 10, 0, 8, 20, "mc", "", 0, "bg");
		setCell(table, "", boldFont, 10, 0, 8, 20, "mc", "lrtb", 0, "");
		String Table2HeaddersArr[] = { "PROBABLE CAUSE (TO BE FETCH FROM CAUSE VERIFICATION FORM)", "WHY1", "WHY2",
				"WHY3", "WHY4", "WHY5", "ROOT CAUSE", "VALID" };

		for (int i = 0; i < Table2HeaddersArr.length; i++) {

			setCell(table, Table2HeaddersArr[i], boldFont, 10, 0, 0, 20, "mc", "", 0, "");

		}

		String Table2HeaddersArr1[] = {
				"PROBABLE hhhhhh ng jjjg nnn jjjj kkkk kkkk kkkk kkkk kkkk kkkk kkkk kuhghfinj  hgbuijnCAUSE TFOR",
				"WH  kkkk kkkk kkkk k  kkkk kkkk kkkk kkkk kkkk k  kkkk kkkk kkkk kkkk kkkk kID\" };\r\n"
						+ "		for (int i = 0; i < Table2HeaddersArr.length; i++) {  kkkk kkkk kkkk k  kkkk kkkk kkkk kkkk kkkk k  kkkk kkkk kkkk kkkk kkkk kID\" };\r\n"
						+ "		for (int i = 0; i < Table2HeaddersArr.length; i++) {  kkkk kkkk kkkk k  kkkk kkkk kkkk kkkk kkkk k  kkkk kkkk kkkk kkkk kkkk kID\" };\r\n"
						+ "		for (int i = 0; i < Table2HeaddersArr.length; i++) {  kkkk kkkk kkkk k  kkkk kkkk kkkk kkkk kkkk k  kkkk kkkk kkkk kkkk kkkk kID\" };\r\n"
						+ "		for (int i = 0; i < Table2HeaddersArr.length; i++) {Y1 PROBABLON FOR",
				"WHY2", "WHY3", "WHY4", "WHY5", "ROOT CAUSE",
				"VAL  kkkk kkkk kkkk kkkk kkkk k  kkkk kkkk kkkk kkkk kkkk k  kkkk kkkk kkkk kkkk kkkk k  kkkk kkkk kkkk kkkk kkkk k  kkkk kkkk kkkk kkkk kkkk kID" };
		for (int i = 0; i < Table2HeaddersArr.length; i++) {

			setCell(table, Table2HeaddersArr1[i], normalFont, 0, 0, 0, 10, "l", "", 0, "");
		}
		document.add(table);

	}

	public static void setCell(PdfPTable table, String text, Font fontStyle, int Padding, int rowSpan, int colSpan,
			int Height, String alignment, String Border, float borderSize, String Color) {
		PdfPCell Cell;
		Cell = new PdfPCell(new Phrase(text, fontStyle));
		if (colSpan != 0) {
			Cell.setColspan(colSpan);
		}
		if (rowSpan != 0) {
			Cell.setRowspan(rowSpan);
		}
		if (Padding != 0) {
			Cell.setPadding(Padding);
		}
		Cell.setMinimumHeight(Height);
		Cell.setUseAscender(true);
		// alignmet (vertical/Horizontal) MC,ML
		if (alignment.equalsIgnoreCase("mc")) {
			Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		} else if (alignment.equalsIgnoreCase("ml")) {
			Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		} else if (alignment.equalsIgnoreCase("l")) {

			Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		}

		if (Border.contains("l")) {
			Cell.setBorderWidthLeft(borderSize);
		}
		if (Border.contains("r")) {
			Cell.setBorderWidthRight(borderSize);
		}

		if (Border.contains("t")) {
			Cell.setBorderWidthTop(borderSize);
		}
		if (Border.contains("r")) {
			Cell.setBorderWidthBottom(borderSize);
		}

		if (!"".equals(Color)) {
			Cell.setBackgroundColor(new BaseColor(192, 192, 192));
		}

		table.addCell(Cell);
	}

	public static void generate_PartAndVendorDetails(Document document) throws DocumentException {
		Font boldFont = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
		Font boldnormalFont = new Font(Font.FontFamily.HELVETICA, 8, Font.BOLD);
		Font normalFont = new Font(Font.FontFamily.HELVETICA, 8);
		PdfPTable table = new PdfPTable(3);

		table.setWidthPercentage(100);

		// table1
		PdfPCell HeaderCell;
		HeaderCell = new PdfPCell(new Phrase("PART AND VENDOR DETAILS", boldFont));
		HeaderCell.setColspan(8);
		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
		HeaderCell.setBackgroundColor(new BaseColor(192, 192, 192));
		table.addCell(HeaderCell);

		HeaderCell = new PdfPCell(new Phrase(""));
		HeaderCell.setColspan(3);
		HeaderCell.setMinimumHeight(15);
		HeaderCell.setUseAscender(true);
		HeaderCell.setBorder(0);
		table.addCell(HeaderCell);

		// table1 row2

		String Table2HeaddersArr[] = { "PART NUMBER", "PART DESCRIPTION", "VENDOR NAME" };
		for (int i = 0; i < Table2HeaddersArr.length; i++) {
			HeaderCell = new PdfPCell(new Phrase(Table2HeaddersArr[i], boldnormalFont));
			HeaderCell.setPadding(3);
			HeaderCell.setMinimumHeight(20);
			HeaderCell.setUseAscender(true);
			HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(HeaderCell);
		}

		// DynamicData

		String Table2HeaddersArr1[] = { "PROBABLE CAUSE TFOR", "WHY1 PROBABLON FOR", "WHY2", "WHY3", "WHY4", "WHY5",
				"ROOT CAUSE", "VALID", "VALID" };
		for (int i = 0; i < Table2HeaddersArr1.length; i++) {
			HeaderCell = new PdfPCell(new Phrase(Table2HeaddersArr1[i], normalFont));
			HeaderCell.setPadding(3);
			HeaderCell.setMinimumHeight(15);
			HeaderCell.setUseAscender(true);
			HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			HeaderCell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(HeaderCell);
		}

		document.add(table);

	}

	public static void generateKMRangeWiseInsidents(Document document) throws DocumentException {
		Font boldFont = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
		Font boldnormalFont = new Font(Font.FontFamily.HELVETICA, 8, Font.BOLD);
		Font normalFont = new Font(Font.FontFamily.HELVETICA, 8);
		PdfPTable table = new PdfPTable(2);

		table.setWidthPercentage(100);

		// table1
		PdfPCell HeaderCell;
		HeaderCell = new PdfPCell(new Phrase("KM RANGE WISE INCIDENTS", boldFont));
		HeaderCell.setColspan(2);
		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
		HeaderCell.setBackgroundColor(new BaseColor(192, 192, 192));
		table.addCell(HeaderCell);

		HeaderCell = new PdfPCell(new Phrase(""));
		HeaderCell.setColspan(2);
		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setBorder(0);
		table.addCell(HeaderCell);

		// table1 row2

		String Table2HeaddersArr[] = { "KMS RANGE (In Thousand)", "INCIDENTS" };
		for (int i = 0; i < Table2HeaddersArr.length; i++) {
			HeaderCell = new PdfPCell(new Phrase(Table2HeaddersArr[i], boldnormalFont));
			HeaderCell.setPadding(3);
			HeaderCell.setMinimumHeight(20);
			HeaderCell.setUseAscender(true);
			HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(HeaderCell);
		}

		// DynamicData

		String Table2HeaddersArr1[] = { "WHY1 PROBABLON FOR", "WHY2", "WHY3", "WHY4", "WHY5", "ROOT CAUSE", "VALID",
				"VALID" };
		for (int i = 0; i < Table2HeaddersArr1.length; i++) {
			HeaderCell = new PdfPCell(new Phrase(Table2HeaddersArr1[i], normalFont));
			HeaderCell.setPadding(3);
			HeaderCell.setMinimumHeight(20);
			HeaderCell.setUseAscender(true);
			HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			HeaderCell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(HeaderCell);
		}

		document.add(table);

	}

	public static void generateVisitNumbers(Document document) throws DocumentException {
		Font boldFont = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
		Font boldnormalFont = new Font(Font.FontFamily.HELVETICA, 8, Font.BOLD);
		Font normalFont = new Font(Font.FontFamily.HELVETICA, 8);
		PdfPTable table = new PdfPTable(2);

		table.setWidthPercentage(100);

		// table1
		PdfPCell HeaderCell;
		HeaderCell = new PdfPCell(new Phrase("Visit Numbers", boldFont));
		HeaderCell.setColspan(2);
		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
		HeaderCell.setBackgroundColor(new BaseColor(192, 192, 192));
		table.addCell(HeaderCell);

		HeaderCell = new PdfPCell(new Phrase(""));
		HeaderCell.setColspan(2);
		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setBorder(0);
		table.addCell(HeaderCell);

		// table1 row2

		String Table2HeaddersArr[] = { "SCHEDULE", "UNSCHEDULE" };
		for (int i = 0; i < Table2HeaddersArr.length; i++) {
			HeaderCell = new PdfPCell(new Phrase(Table2HeaddersArr[i], boldnormalFont));
			HeaderCell.setPadding(3);
			HeaderCell.setMinimumHeight(20);
			HeaderCell.setUseAscender(true);
			HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(HeaderCell);
		}

		// DynamicData

		String Table2HeaddersArr1[] = { "WHY1 PROBABLON FOR", "WHY2", "WHY3", "WHY4", "WHY5", "ROOT CAUSE", "VALID",
				"VALID" };
		for (int i = 0; i < Table2HeaddersArr1.length; i++) {
			HeaderCell = new PdfPCell(new Phrase(Table2HeaddersArr1[i], normalFont));
			HeaderCell.setPadding(3);
			HeaderCell.setMinimumHeight(20);
			HeaderCell.setUseAscender(true);
			HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			HeaderCell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(HeaderCell);
		}

		document.add(table);

	}

	public static void generateMisWiseDetails(Document document) throws DocumentException {
		Font boldFont = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
		Font boldnormalFont = new Font(Font.FontFamily.HELVETICA, 8, Font.BOLD);
		Font normalFont = new Font(Font.FontFamily.HELVETICA, 8);
		PdfPTable table = new PdfPTable(4);

		table.setWidthPercentage(100);

		// table1
		PdfPCell HeaderCell;
		HeaderCell = new PdfPCell(new Phrase("MIS Wise Details", boldFont));
		HeaderCell.setColspan(4);
		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
		HeaderCell.setBackgroundColor(new BaseColor(192, 192, 192));
		table.addCell(HeaderCell);

		HeaderCell = new PdfPCell(new Phrase(""));
		HeaderCell.setColspan(4);
		HeaderCell.setMinimumHeight(20);
		HeaderCell.setUseAscender(true);
		HeaderCell.setBorder(0);
		table.addCell(HeaderCell);

		// table1 row2

		String Table2HeaddersArr[] = { "MIS", "INCIDENTS", "RPT", "CPU" };
		for (int i = 0; i < Table2HeaddersArr.length; i++) {
			HeaderCell = new PdfPCell(new Phrase(Table2HeaddersArr[i], boldnormalFont));
			HeaderCell.setPadding(3);
			HeaderCell.setMinimumHeight(20);
			HeaderCell.setUseAscender(true);
			HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			HeaderCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(HeaderCell);
		}

		// DynamicData

		String Table2HeaddersArr1[] = { "WHY1 PROBABLON FOR", "WHY2", "WHY3", "WHY4", "WHY5", "ROOT CAUSE", "VALID",
				"VALID" };
		for (int i = 0; i < Table2HeaddersArr1.length; i++) {
			HeaderCell = new PdfPCell(new Phrase(Table2HeaddersArr1[i], normalFont));
			HeaderCell.setPadding(3);
			HeaderCell.setMinimumHeight(20);
			HeaderCell.setUseAscender(true);
			HeaderCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			HeaderCell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(HeaderCell);
		}

		document.add(table);

	}

	public static void generateG8DReport(Document document) throws DocumentException {

		Font normalbold = new Font(Font.FontFamily.HELVETICA, 8, Font.BOLD);
		Font bold = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
		Font normal = new Font(Font.FontFamily.HELVETICA, 8);

		PdfPCell Cell;

		PdfPTable table = new PdfPTable(4);
		table.setWidthPercentage(100);
		// row1
		Cell = new PdfPCell(new Phrase("G8D REPORT (SUMMARY)", bold));
		Cell.setColspan(4);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(Cell);

		// row2
		Cell = new PdfPCell(new Phrase("Title", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Title TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Model", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Model TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row3
		Cell = new PdfPCell(new Phrase("Date Opened", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Date Opened TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Last Updated", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Last Updated TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row 4
		Cell = new PdfPCell(new Phrase("Oraganization / Location", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Oraganization / Location  TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Product/Process Information", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Product/Process Information TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row 5
		Cell = new PdfPCell(new Phrase("D0", normalbold));
		Cell.setColspan(4);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row6
		Cell = new PdfPCell(new Phrase("Symptom (s)", normalbold));
		Cell.setColspan(1);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Symptom (s) TEXT", normal));
		Cell.setColspan(3);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		// row7
		Cell = new PdfPCell(new Phrase("Emergency Responsive Action", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Emergency Responsive Action TEXT", normal));
		Cell.setColspan(3);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		// row8
		Cell = new PdfPCell(new Phrase("Customer Protection Action", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Customer Protection Action TEXT", normal));
		Cell.setColspan(3);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		// row9

		Cell = new PdfPCell(new Phrase("Verification & Validation ", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Verification & Validation  TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("% Effectiveness", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("% Effectiveness TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		// row10
		Cell = new PdfPCell(new Phrase("Date Implemented ", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Date Implemented  TEXT", normal));
		Cell.setColspan(3);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row11
		Cell = new PdfPCell(new Phrase("D1", normalbold));
		Cell.setColspan(2);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("D2", normalbold));
		Cell.setColspan(2);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		// row12
		Cell = new PdfPCell(new Phrase("Champion", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Champion  TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Problem Statement", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Problem Statement TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row13 &14
		Cell = new PdfPCell(new Phrase("Leader", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Leader  TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Problem Statement", normalbold));
		Cell.setRowspan(2);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Problem Statemen", normal));
		Cell.setRowspan(2);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Team", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

//   		 row15

		Cell = new PdfPCell(new Phrase("D3", normalbold));
		Cell.setColspan(4);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row16

		Cell = new PdfPCell(new Phrase("Root Cause (s)", normalbold));
		Cell.setColspan(1);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase(" Root Cause (s) TEXT", normalbold));
		Cell.setColspan(3);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row17

		Cell = new PdfPCell(new Phrase("Verification & Validation", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Verification & Validation  TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("% Effectiveness", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("% Effectiveness  TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row18

		Cell = new PdfPCell(new Phrase("Date Implemented)", normalbold));
		Cell.setColspan(1);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Date Implemented TEXT", normalbold));
		Cell.setColspan(3);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row19

		Cell = new PdfPCell(new Phrase("D4", normalbold));
		Cell.setColspan(4);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row20
		Cell = new PdfPCell(new Phrase("Root Cause(s) Implemented)", normalbold));
		Cell.setColspan(1);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Root Cause(s) TEXT", normalbold));
		Cell.setColspan(3);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row21

		Cell = new PdfPCell(new Phrase("Verification & Validation", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Verification & Validation  TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("% Contribution", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("% Contribution  TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row22

		Cell = new PdfPCell(new Phrase("D5", normalbold));
		Cell.setColspan(4);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		// row23

		Cell = new PdfPCell(new Phrase("Chosen Permanent Corrective Action(s))", normalbold));
		Cell.setColspan(1);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Chosen Permanent Corrective Action(s)TXT", normalbold));
		Cell.setColspan(3);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row24

		Cell = new PdfPCell(new Phrase("Verification & Validation", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Verification & Validation  TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("% Effectiveness", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("% Effectiveness  TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		// row25
		Cell = new PdfPCell(new Phrase("D6", normalbold));
		Cell.setColspan(4);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		// row26

		Cell = new PdfPCell(new Phrase("Implemented Permanent  Corrective Action(s))", normalbold));
		Cell.setColspan(1);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Implemented Permanent Corrective Action(s)TXT", normalbold));
		Cell.setColspan(3);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row27

		Cell = new PdfPCell(new Phrase("Validation", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Validation  TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Cut Off No ", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Cut Off No  TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
//   		 row28
		Cell = new PdfPCell(new Phrase("D7", normalbold));
		Cell.setColspan(4);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		// row29

		Cell = new PdfPCell(new Phrase("Prevent Recurrence Action(s)", normalbold));
		Cell.setColspan(1);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase(
				"Prevent Recurrence Action(s)mnbmkjhkhgfffffffffffff fffffffffffffffffffffffffffffffffffffff ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff",
				normalbold));
		Cell.setColspan(3);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row30

		Cell = new PdfPCell(new Phrase("Verification & Validation", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Verification & Validation  TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Date Implemented  ", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Date Implemented   TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row31
		Cell = new PdfPCell(new Phrase("Prevent Recurrencet Recommendation(s) Systemic", normalbold));
		Cell.setColspan(1);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Prevent Recurrencet Recommendation(s) Systemi TEXT", normalbold));
		Cell.setColspan(3);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		//// row32
		Cell = new PdfPCell(new Phrase("Responsibility ", normalbold));
		Cell.setColspan(1);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase(
				"Responsibility mnbmkjhkhgffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff\r\n"
						+ "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff\r\n"
						+ "fffffffffffff, kjhkhgfffffffffffffffffffffffffffffffffffffffffffffffffffffffffff\r\n"
						+ "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff\r\n"
						+ "ffffffffffffffffffffffffkjhkhgffffffffffffffffffffffffffffffffffffffffffffffffff\r\n"
						+ "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff\r\n"
						+ "fffffffffffffffffffffffffffffffff",
				normalbold));
		Cell.setColspan(3);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		//// row33
		Cell = new PdfPCell(new Phrase("D8", normalbold));
		Cell.setColspan(4);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		// row34

		Cell = new PdfPCell(new Phrase(" Team & Individual Recognition  ", normalbold));
		Cell.setColspan(1);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase(" ", normalbold));
		Cell.setColspan(3);
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		// row35

		Cell = new PdfPCell(new Phrase("Reported By", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Reported By  TEXT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Date Closed ", normalbold));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(true);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		Cell = new PdfPCell(
				new Phrase("mnbmkjhkhgffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff\r\n"
						+ "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff\r\n"
						+ "fffffffffffff, kjhkhgfffffffffffffffffffffffffffffffffffffffffffffffffffffffffff\r\n"
						+ "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff\r\n"
						+ "ffffffffffffffffffffffffkjhkhgffffffffffffffffffffffffffffffffffffffffffffffffff\r\n"
						+ "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff\r\n"
						+ "fffffffffffffffffffffffffffffffffT", normal));
		Cell.setPadding(3);
		Cell.setMinimumHeight(20);
		Cell.setUseAscender(false);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(Cell);

		document.add(table);

	}

	public static void generateccrReport(Document document)
			throws DocumentException, MalformedURLException, IOException {

		Font bold = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
		Font normal = new Font(Font.FontFamily.HELVETICA, 6);
		Font normalbold = new Font(Font.FontFamily.HELVETICA, 6, Font.BOLD);
		PdfPCell Cell;
		Image image;
		PdfPTable table = new PdfPTable(10);

		float[] columnWidths = { 0.8f, 1.242f, 0.75f, 0.75f, 0.55f, 0.95f, 0.5f, 0.6f, 0.63f, 0.6f };
		table.setWidths(columnWidths);
		table.setWidthPercentage(100);
		image = Image.getInstance("C:\\Users\\NICHEBIT\\Desktop\\mahindraLogo.png");
//row1
		Cell = new PdfPCell();
		Cell.setRowspan(3);
		Cell.setColspan(2);
		Cell.addElement(image);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Concern Closure Report", bold));
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		Cell.setRowspan(3);
		Cell.setColspan(4);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Plant :", normalbold));
		Cell.setBorderWidthRight(0);
		Cell.setColspan(2);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Plagdffffffffffffnt", normal));
		Cell.setBorderWidthLeft(0);
		Cell.setColspan(2);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(2);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Department :", normalbold));
		Cell.setBorderWidthRight(0);
		Cell.setColspan(2);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Depargfdddddddddddddtment", normal));
		Cell.setBorderWidthLeft(0);
		Cell.setColspan(2);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(2);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Model :", normalbold));
		Cell.setBorderWidthRight(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(2);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Modbvcccccccccccxxxxxxxxxxxxxxel", normal));
		Cell.setBorderWidthLeft(0);
		Cell.setColspan(2);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(2);
		table.addCell(Cell);

		// row2

		Cell = new PdfPCell(new Phrase("Problem No :", normalbold));
		Cell.setBorderWidthRight(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("VERITO-BODY-05022024-2277", normal));
		Cell.setBorderWidthLeft(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);

		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Reported Date :", normalbold));
		Cell.setBorderWidthRight(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Reported Date", normal));
		Cell.setBorderWidthLeft(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Source :", normalbold));
		Cell.setBorderWidthRight(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Sourfdhhhhhhhhhhce", normal));
		Cell.setBorderWidthLeft(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);

		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Severity :", normalbold));
		Cell.setBorderWidthRight(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Severibvcvcvcvcvcvcty", normal));
		Cell.setBorderWidthLeft(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Closure Date :", normalbold));
		Cell.setBorderWidthRight(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Closure Date", normal));
		Cell.setBorderWidthLeft(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);

		// row3
		Cell = new PdfPCell(new Phrase("Concern Description :", normalbold));
		Cell.setBorderWidthRight(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(2);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Concern Description", normal));
		Cell.setBorderWidthLeft(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(4);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("CCR No :", normalbold));
		Cell.setBorderWidthRight(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Concern Dhfgfgfgfgfgfgfgescription", normal));
		Cell.setBorderWidthLeft(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(3);
		table.addCell(Cell);
		// row4
		Cell = new PdfPCell(new Phrase("OBSERVATION & ANALYSIS :", normalbold));
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthBottom(0);
		Cell.setRowspan(2);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(2);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("OBSERVATIvnbcnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnbcnON & ANALYSIS :", normal));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthBottom(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(2);
		Cell.setRowspan(2);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("CORRECTIVE ACTIONS :", normalbold));

		Cell.setColspan(6);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(10);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Customer Protect Action : ", normalbold));

		Cell.setBorderWidthRight(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(30);
		Cell.setColspan(2);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase(
				"CORRECTIVE ACTIONS nfdjgkn gfdngkn gdfngjknfkd gfdsnjgknfdklg gfdngkldnfkg dgfngklnd ", normal));

		Cell.setColspan(4);
		Cell.setBorderWidthLeft(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(30);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Root Cause :", normalbold));
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(2);
		Cell.setRowspan(2);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Root Cause vbbb  gfdngj gfdgmklgf gfd", normal));

		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthLeft(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(2);
		Cell.setRowspan(2);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Containment Action : ", normalbold));

		Cell.setBorderWidthRight(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(2);

		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase(
				"Permemnent Containment Action  Action Root Containment Action  Cause vbbb  gfdngj gfdgmklgf gfd",
				normal));

		Cell.setBorderWidthLeft(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(4);

		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Permemnent Action : ", normalbold));
		Cell.setBorderWidthRight(0);

		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(2);

		table.addCell(Cell);

		Cell = new PdfPCell(
				new Phrase("Permemnent Action Root Containment Action  Cause vbbb  gfdngj gfdgmklgf gfd", normal));

		Cell.setBorderWidthLeft(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(20);
		Cell.setColspan(4);

		table.addCell(Cell);

		// row5
		Cell = new PdfPCell(new Phrase("Photograph/Nature Of Change", normalbold));
		Cell.setColspan(10);
		Cell.setMinimumHeight(15);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(Cell);

		// row6
		Cell = new PdfPCell(new Phrase("Before", normalbold));
		Cell.setColspan(4);
		Cell.setMinimumHeight(15);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("After", normalbold));
		Cell.setColspan(6);
		Cell.setMinimumHeight(15);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(Cell);

		// row7 images
		image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\diagram (1).PNG");
		image.scaleAbsoluteWidth(200f);
		image.scaleAbsoluteHeight(150f);
		Cell = new PdfPCell();
		Cell.addElement(image);
		Cell.setFixedHeight(20);
		Cell.setColspan(4);

		Cell.setMinimumHeight(15);

		table.addCell(Cell);

		image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\QR-Lable.jpg");
		image.scaleAbsoluteWidth(200f);
		image.scaleAbsoluteHeight(150f);
		Cell = new PdfPCell();
		Cell.setColspan(6);
		Cell.setFixedHeight(20);
		Cell.setMinimumHeight(15);
		Cell.addElement(image);

		table.addCell(Cell);
		// row8 images
		Cell = new PdfPCell(new Phrase("DFMEA RPN : ", normalbold));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setBorderWidthRight(0);
		Cell.setMinimumHeight(15);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Photograph/Nature Of Change", normal));
		Cell.setBorderWidthLeft(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(15);
		Cell.setColspan(3);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("DFMEA RPN3 :", normalbold));
		Cell.setBorderWidthRight(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setColspan(2);
		Cell.setMinimumHeight(15);

		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase("DFMEA Photograph RPN3 Photograph", normal));
		Cell.setBorderWidthLeft(0);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setMinimumHeight(15);
		Cell.setColspan(4);
		table.addCell(Cell);

		// row9 images
		Cell = new PdfPCell(new Phrase("Cut Off No.s :", normalbold));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setColspan(4);
		Cell.setMinimumHeight(15);
		table.addCell(Cell);
		// Image Merged Cells
		image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\diagram (1).PNG");
		image.scaleAbsoluteWidth(150f);
		image.scaleAbsoluteHeight(50f);

		Cell = new PdfPCell();
		Cell.addElement(image);

		Cell.setColspan(6);
		Cell.setRowspan(5);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Containment Action : ", normalbold));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setBorderWidthRight(0);
		Cell.setColspan(2);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase(
				"mmjkmn, kjhkhgffffffffffffffffffffffffff mmjkmn, kjhkhgffffffffffffffffffffffffff ", normal));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setBorderWidthLeft(0);
		Cell.setColspan(2);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);

		// t1
		PdfPTable table2 = new PdfPTable(3);
		table2.setWidthPercentage(100);
		Cell = new PdfPCell(new Phrase("Sr.No ", normalbold));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		table2.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Cut Off No ", normalbold));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		table2.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Date", normalbold));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		table2.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Sr.No TEXT ", normal));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		table2.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Cut Off No TEXT ", normal));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		table2.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Date TEXT", normal));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		table2.addCell(Cell);

		Cell = new PdfPCell();
		Cell.addElement(table2);
		Cell.setColspan(4);
		Cell.setPadding(0);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Permenent Action :", normalbold));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setBorderWidthRight(0);
		Cell.setColspan(2);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase(
				"mmjkmn, kjhkhgffff ffffffffffffff ffffffff mmjkmn, kjhkhg fffffffffff fffffff ffffffff ", normal));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setBorderWidthLeft(0);
		Cell.setColspan(2);
		Cell.setMinimumHeight(20);
		table.addCell(Cell);

		PdfPTable table3 = new PdfPTable(3);
		table3.setWidthPercentage(100);
		Cell = new PdfPCell(new Phrase("Sr.No ", normalbold));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		table3.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Cut Off No ", normalbold));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		table3.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Date", normalbold));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		table3.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Sr.No TEXT ", normal));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		table3.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Cut Off No TEXT ", normal));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		table3.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Date TEXT", normal));
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		table3.addCell(Cell);

		Cell = new PdfPCell();
		Cell.addElement(table3);
		Cell.setColspan(4);
		Cell.setPadding(0);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Documents Updated :", normalbold));
		Cell.setMinimumHeight(15);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setColspan(4);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Sustenance Plan Updated :", normalbold));
		Cell.setMinimumHeight(15);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setColspan(6);
		table.addCell(Cell);
		PdfPTable table4;
		table4 = new PdfPTable(6);
		float[] arra = { 1f, 4f, 1f, 4f, 1f, 4f };
		table4.setWidths(arra);
		table4.setWidthPercentage(100);
		int a = 2;
		if (a == 2) {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		} else {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		}

		Cell = new PdfPCell();
		Cell.addElement(image);
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);

		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase("POS/Process Sheet", normalbold));
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		table4.addCell(Cell);

		if (a == 2) {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		} else {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		}
		Cell = new PdfPCell();
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.addElement(image);
		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase("SOS/SOP,DCP", normalbold));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table4.addCell(Cell);

		if (a == 3) {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		} else {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		}

		Cell = new PdfPCell();
		Cell.addElement(image);
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);

		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Monitoring Plan / Control Plan", normalbold));
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		table4.addCell(Cell);

		if (a == 2) {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		} else {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		}
		Cell = new PdfPCell();
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.addElement(image);
		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase("Checkman Checklist", normalbold));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table4.addCell(Cell);

		if (a == 3) {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		} else {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		}

		Cell = new PdfPCell();
		Cell.addElement(image);
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);

		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase("OTHERS", normalbold));
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase(""));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);

		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase(""));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table4.addCell(Cell);
		Cell = new PdfPCell(new Phrase(""));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);

		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase(""));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table4.addCell(Cell);
		Cell = new PdfPCell(new Phrase(""));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);

		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase(""));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table4.addCell(Cell);
		Cell = new PdfPCell(new Phrase(""));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);

		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase(""));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table4.addCell(Cell);

		Cell = new PdfPCell();
		Cell.setPadding(0);
		Cell.setBorderWidthRight(0);

		Cell.addElement(table4);
		Cell.setColspan(3);
		table.addCell(Cell);
		Cell = new PdfPCell(new Phrase(""));
		Cell.setBorderWidthLeft(0);

		Cell.setColspan(1);
		table.addCell(Cell);

		// for Sustenance Plan UpdatedcheckBox

		table4 = new PdfPTable(6);

		table4.setWidths(arra);
		table4.setWidthPercentage(100);

		if (a == 2) {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		} else {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		}

		Cell = new PdfPCell();
		Cell.addElement(image);
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);

		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase(" Self Check & Self Check Audit", normalbold));
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		table4.addCell(Cell);

		if (a == 2) {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		} else {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		}
		Cell = new PdfPCell();
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.addElement(image);
		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase(" Supervisor Checklist", normalbold));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table4.addCell(Cell);

		if (a == 3) {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		} else {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		}

		Cell = new PdfPCell();
		Cell.addElement(image);
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);

		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase(" Checkman Checklist(FIXED PART)", normalbold));
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		table4.addCell(Cell);

		if (a == 2) {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		} else {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		}
		Cell = new PdfPCell();
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.addElement(image);
		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase(" JH Checklist", normalbold));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table4.addCell(Cell);

		if (a == 3) {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		} else {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
			image.scaleAbsoluteWidth(10f);
			image.scaleAbsoluteHeight(5f);
		}

		Cell = new PdfPCell();
		Cell.addElement(image);
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);

		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase("PM Checklist", normalbold));
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		table4.addCell(Cell);

		Cell = new PdfPCell();
		Cell.addElement(image);
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);

		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase(" Process Audit", normalbold));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table4.addCell(Cell);

		Cell = new PdfPCell();
		Cell.addElement(image);
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);

		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase("OTHERS", normalbold));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table4.addCell(Cell);
		Cell = new PdfPCell(new Phrase(""));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);

		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase(""));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table4.addCell(Cell);
		Cell = new PdfPCell(new Phrase(""));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);

		table4.addCell(Cell);

		Cell = new PdfPCell(new Phrase(""));
		Cell.setBorderWidthLeft(0);
		Cell.setBorderWidthRight(0);
		Cell.setBorderWidthTop(0);
		Cell.setBorderWidthBottom(0);
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		table4.addCell(Cell);

		Cell = new PdfPCell();
		Cell.addElement(table4);
		Cell.setColspan(5);
		Cell.setPadding(0);
		Cell.setBorderWidthRight(0);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("", normalbold));
		Cell.setColspan(1);

		Cell.setBorderWidthLeft(0);
		table.addCell(Cell);

		// Remarks
		Cell = new PdfPCell(new Phrase("Remarks -:", normalbold));
		Cell.setColspan(4);
		Cell.setBorderWidthBottom(0);
		table.addCell(Cell);

		// Authorisation
		Cell = new PdfPCell(new Phrase("Authorisation -:", normalbold));
		Cell.setColspan(6);
		Cell.setBorderWidthBottom(0);
		table.addCell(Cell);

		Cell = new PdfPCell(new Phrase("", normalbold));
		Cell.setColspan(4);
		Cell.setBorderWidthTop(0);
		table.addCell(Cell);

		table4 = new PdfPTable(4);
		table4.setWidthPercentage(100);

		Cell = new PdfPCell(new Phrase("Concern Owner", normalbold));
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setMinimumHeight(15);
		table4.addCell(Cell);
		Cell = new PdfPCell(new Phrase("PVT Platform Lead", normalbold));
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setMinimumHeight(15);
		table4.addCell(Cell);
		Cell = new PdfPCell(new Phrase("PVT COE ", normalbold));
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setMinimumHeight(15);
		table4.addCell(Cell);
		Cell = new PdfPCell(new Phrase("PVT HEAD", normalbold));
		Cell.setHorizontalAlignment(Element.ALIGN_MIDDLE);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setMinimumHeight(15);
		table4.addCell(Cell);
		Cell = new PdfPCell(new Phrase("Concern Owner", normal));
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setMinimumHeight(15);
		table4.addCell(Cell);
		Cell = new PdfPCell(new Phrase("PVT Platform Lead", normal));
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setMinimumHeight(15);
		table4.addCell(Cell);
		Cell = new PdfPCell(new Phrase("PVT COE ", normal));
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setMinimumHeight(15);
		table4.addCell(Cell);
		Cell = new PdfPCell(new Phrase("PVT HEAD", normal));
		Cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		Cell.setVerticalAlignment(Element.ALIGN_CENTER);
		Cell.setMinimumHeight(15);
		table4.addCell(Cell);

		Cell = new PdfPCell();
		Cell.setColspan(6);
		Cell.addElement(table4);
		Cell.setPadding(0);
		table.addCell(Cell);

		document.add(table);

	}
	public static void generateReport(Document document) throws DocumentException, MalformedURLException, IOException {

		Font boldFont = new Font(Font.FontFamily.HELVETICA, 8, Font.BOLD);
		Font normalFont = new Font(Font.FontFamily.HELVETICA, 8);
		PdfPTable table = new PdfPTable(4);
		float[] columnWidths = {0.25f,0.25f,0.15f,0.35f};
		table.setWidths(columnWidths);
		table.setWidthPercentage(100);
		PdfPCell  cell;
		cell=new PdfPCell(new Phrase("Sign off for Delay in Concern Resolution",boldFont));
		cell.setRowspan(4);
		cell.setColspan(2);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
		table.addCell(cell);
		//row 1
		cell=new PdfPCell(new Phrase("Date",boldFont));
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
		cell.setMinimumHeight(20);
		table.addCell(cell);
		cell=new PdfPCell(new Phrase("Date Details",normalFont));
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
		cell.setMinimumHeight(20);
		table.addCell(cell);
		//row 2
				cell=new PdfPCell(new Phrase("Plant",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Plant Details",normalFont));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				//row 3
				cell=new PdfPCell(new Phrase("Dept",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Dept Details",normalFont));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				//row 4
				cell=new PdfPCell(new Phrase("Model",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Model Details",normalFont));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				
				//row 5
				cell=new PdfPCell(new Phrase("Concern DescriptionConcern Description",boldFont));
				cell.setColspan(1);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Concern Description Details",normalFont));
				cell.setColspan(3);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				
				//row 6
				cell=new PdfPCell(new Phrase("Concern No",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Concern No Details",normalFont));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Reported Date",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Reported Date Details",normalFont));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				
				//row 7
				cell=new PdfPCell(new Phrase("Reported From",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Reported From Details",normalFont));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Severity",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Severity Details",normalFont));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
		

				//row 8
				cell=new PdfPCell(new Phrase("Target Date as per Project Plan",boldFont));
				cell.setColspan(1);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Target Date as per Project Plan Details",normalFont));
				cell.setColspan(3);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				//row 9
				cell=new PdfPCell(new Phrase("Root cause",boldFont));
				cell.setColspan(1);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Root cause Details",normalFont));
				cell.setColspan(3);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				//row 10
				cell=new PdfPCell(new Phrase("Corrective Action",boldFont));
				cell.setColspan(1);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setMinimumHeight(20);	cell.setPadding(3);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Corrective Action Details",normalFont));
				cell.setColspan(3);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setMinimumHeight(20);	cell.setPadding(3);
				table.addCell(cell);
				//row 11
				cell=new PdfPCell(new Phrase("Current Status",boldFont));
				cell.setColspan(1);
				cell.setPadding(3);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Current Status Details",normalFont));
				cell.setColspan(3);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setMinimumHeight(20);	cell.setPadding(3);
				table.addCell(cell);
				//row 12
				cell=new PdfPCell(new Phrase("Delay Occured in phase",boldFont));
				cell.setColspan(4);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setMinimumHeight(20);	cell.setPadding(3);
				table.addCell(cell);
				
				Image image=null;
				// creating table for  Delay Ocurred In Phase
				
				PdfPTable tableForDIP =new PdfPTable(6);
				float[] columnWidthsForDIP = {0.05f,0.25f,0.05f,0.25f,0.05f,0.25f};
				tableForDIP.setWidths(columnWidthsForDIP);
				tableForDIP.setWidthPercentage(100);
				int a = 2;
				
				//row1
				if (a == 2) {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				} else {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				}
				cell=new PdfPCell();
				cell.addElement(image);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				tableForDIP.addCell(cell);
				
				cell=new PdfPCell(new Phrase("Failed Part Availability",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_JUSTIFIED);
				cell.setPadding(3);
				cell.setMinimumHeight(20);
				tableForDIP.addCell(cell);
				
				if (a == 2) {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				} else {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
				}
				cell=new PdfPCell();
				cell.addElement(image);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				tableForDIP.addCell(cell);
				cell.setPadding(3);
				cell=new PdfPCell(new Phrase("Data Collection",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_JUSTIFIED);
				cell.setMinimumHeight(20);
				tableForDIP.addCell(cell);
				if (a == 2) {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				} else {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				}
				cell=new PdfPCell();
				cell.setPadding(3);
				cell.addElement(image);
				cell.setMinimumHeight(20);
				tableForDIP.addCell(cell);
				cell=new PdfPCell(new Phrase("Analysis",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_JUSTIFIED);
				cell.setMinimumHeight(20);	cell.setPadding(3);
				tableForDIP.addCell(cell);
				
				//row2
				if (a == 2) {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				} else {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				}
				cell=new PdfPCell();
				cell.addElement(image);
				cell.setMinimumHeight(20);	cell.setPadding(3);
				tableForDIP.addCell(cell);
				
				cell=new PdfPCell(new Phrase("Proto Part Development",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_JUSTIFIED);
				cell.setPadding(3);
				cell.setMinimumHeight(20);
				tableForDIP.addCell(cell);
				
				if (a == 2) {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				} else {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
				}
				cell=new PdfPCell();
				cell.addElement(image);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				tableForDIP.addCell(cell);
				
				cell=new PdfPCell(new Phrase("Design Validation",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_JUSTIFIED);
				cell.setMinimumHeight(20);	cell.setPadding(3);
				tableForDIP.addCell(cell);
				if (a == 2) {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				} else {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				}
				cell=new PdfPCell();
				
				cell.addElement(image);
				cell.setMinimumHeight(20);	cell.setPadding(3);
				tableForDIP.addCell(cell);
				cell=new PdfPCell(new Phrase("Cost Impact Receipt/ Sanction /Settlement",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_JUSTIFIED);
				cell.setMinimumHeight(20);	cell.setPadding(3);
				tableForDIP.addCell(cell);
				
				//row3
				if (a == 2) {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				} else {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				}
				cell=new PdfPCell();
				cell.addElement(image);	cell.setPadding(3);
				cell.setMinimumHeight(20);
				tableForDIP.addCell(cell);
				
				cell=new PdfPCell(new Phrase("New Part Developlement",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_JUSTIFIED);
				cell.setPadding(3);
				cell.setMinimumHeight(20);
				tableForDIP.addCell(cell);
				
				if (a == 2) {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				} else {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
				}
				cell=new PdfPCell();
				cell.addElement(image);
				cell.setMinimumHeight(20);	cell.setPadding(3);
				tableForDIP.addCell(cell);
				
				cell=new PdfPCell(new Phrase("Old Stock Consumption",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_JUSTIFIED);
				cell.setMinimumHeight(20);	cell.setPadding(3);
				tableForDIP.addCell(cell);
				if (a == 2) {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Unchecked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				} else {
					image = Image.getInstance("C:\\Users\\NICHEBIT\\Downloads\\CheckBox_Checked.png");
					image.scaleAbsoluteWidth(10f);
					image.scaleAbsoluteHeight(1f);
					image.setAlignment(Element.ALIGN_CENTER);
				}
				cell=new PdfPCell();
				
				cell.addElement(image);
				cell.setMinimumHeight(20);	cell.setPadding(3);
				tableForDIP.addCell(cell);
				cell=new PdfPCell(new Phrase("Implementation",boldFont));
				cell.setVerticalAlignment(Element.ALIGN_JUSTIFIED);
				cell.setMinimumHeight(20);	cell.setPadding(3);
				tableForDIP.addCell(cell);
				
				cell=new PdfPCell();
				cell.setPadding(0);	
				cell.setColspan(4);
				cell.addElement(tableForDIP);
				table.addCell(cell);
				
				//row 13
				cell=new PdfPCell(new Phrase("Reason for Delay",boldFont));
				cell.setColspan(1);
				cell.setPadding(3);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Reason for Delay Details",normalFont));
				cell.setColspan(3);
				cell.setPadding(3);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				//row 13
				cell=new PdfPCell(new Phrase("Revised Target Date",boldFont));
				cell.setColspan(1);
				cell.setPadding(3);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				cell=new PdfPCell(new Phrase("Revised Target Date Details",normalFont));
				cell.setColspan(3);
				cell.setPadding(3);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setMinimumHeight(20);
				table.addCell(cell);
				
				
		document.add(table);
		
	}
}
