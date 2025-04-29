package pdft;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import com.itextpdf.text.Document;

import com.itextpdf.text.Element;
import com.itextpdf.text.Font;

import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

public class footer extends PdfPageEventHelper {
	Font boldnormalFont = new Font(Font.FontFamily.HELVETICA, 8, Font.BOLD);
	LocalDateTime currentDateTime = LocalDateTime.now();

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy hh:mm a", java.util.Locale.ENGLISH);

	String formattedDate = currentDateTime.format(formatter);

	public void onEndPage(PdfWriter writer, Document document) {

		PdfPTable tblfooter = new PdfPTable(1);
		tblfooter.setTotalWidth(100);

		PdfPCell a = new PdfPCell();
		a.addElement(new Phrase(formattedDate, boldnormalFont));
		a.setBorder(0);
		a.setHorizontalAlignment(Element.ALIGN_LEFT);
		tblfooter.addCell(a);

		tblfooter.writeSelectedRows(0, -1, 30, tblfooter.getTotalHeight() + 10, writer.getDirectContent());
	}

}
