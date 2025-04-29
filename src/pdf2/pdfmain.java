package pdf2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

import pdft.footer;

public class pdfmain {
	public static void main(String args[]) throws DocumentException, IOException {
		String dest = "C:\\Users\\NICHEBIT\\Downloads\\sampleCSSR.pdf";
		Document document = new Document();
		document.setMargins(30, 30, 65, 50);

		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(dest));

		PdfWriter writer = PdfWriter.getInstance(document, bufferedOutputStream);
		HeaderFooterPageEvent event = new HeaderFooterPageEvent();

		writer.setPageEvent(event);
		document.open();
		generateReport(document);

		document.close();
		bufferedOutputStream.close();
	}
	
	public static void generateReport(Document document) throws DocumentException {
		
		Font boldnormalFont = new Font(Font.FontFamily.HELVETICA, 9);
		Font normalFont = new Font(Font.FontFamily.HELVETICA, 9,Font.BOLD);
		Font BoldFont = new Font(Font.FontFamily.HELVETICA, 10,Font.BOLD);
		PdfPTable table = new PdfPTable(4);
		PdfPCell cell=null;
		float[] columnWidths = { 1f, 1.5f, 1f, 1.5f,};
		table.setWidths(columnWidths);
		table.setWidthPercentage(100);
		cell=new PdfPCell(new Phrase("Slip Number  ",boldnormalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setBorder(0);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		cell=new PdfPCell(new Phrase(": Slip Number  ",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setBorder(0);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		
		cell=new PdfPCell(new Phrase("Date ",boldnormalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setBorder(0);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		
		cell=new PdfPCell(new Phrase(": Slip Number",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setBorder(0);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		
		cell=new PdfPCell(new Phrase("Department  ",boldnormalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setBorder(0);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		cell=new PdfPCell(new Phrase(": Department",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setBorder(0);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		
		cell=new PdfPCell(new Phrase("WBS Element ",boldnormalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setBorder(0);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		
		cell=new PdfPCell(new Phrase(": WBS Element",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setBorder(0);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		cell=new PdfPCell(new Phrase("Cost Center ",boldnormalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setBorder(0);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		
		cell=new PdfPCell(new Phrase(": Cost Center",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setBorder(0);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		cell=new PdfPCell(new Phrase("",boldnormalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setBorder(0);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		
		cell=new PdfPCell(new Phrase("",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setBorder(0);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		
		cell=new PdfPCell(new Phrase("Request Details",BoldFont));
		cell.setColspan(4);
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setBorder(0);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		
		
		PdfPTable tableforRD = new PdfPTable(7);
		
		float[] columnWidthsforRD = {0.5f,1f,2.5f,0.5f,0.8f,0.8f,2.5f};
		tableforRD.setWidths(columnWidthsforRD);
		tableforRD.setWidthPercentage(100);
		cell=new PdfPCell(new Phrase("S.No",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforRD.addCell(cell);
		cell=new PdfPCell(new Phrase("Part No",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforRD.addCell(cell);
		cell=new PdfPCell(new Phrase("Part Description",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
	
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforRD.addCell(cell);
		cell=new PdfPCell(new Phrase("UOM",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforRD.addCell(cell);
		cell=new PdfPCell(new Phrase("request Qty",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforRD.addCell(cell);
		cell=new PdfPCell(new Phrase("Approved Qty",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforRD.addCell(cell);
		cell=new PdfPCell(new Phrase("Remarks",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforRD.addCell(cell);
		
		
		

		for(int i=1;i<=0;i++) {
			cell=new PdfPCell(new Phrase("1",boldnormalFont));
			cell.setMinimumHeight(25);
			cell.setUseAscender(true);
			
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			tableforRD.addCell(cell);
			cell=new PdfPCell(new Phrase("Part No 1",boldnormalFont));
			cell.setMinimumHeight(25);
			cell.setUseAscender(true);
			
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			tableforRD.addCell(cell);
			cell=new PdfPCell(new Phrase("Part Description 1",boldnormalFont));
			cell.setMinimumHeight(25);
			cell.setUseAscender(true);
		
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			tableforRD.addCell(cell);
			cell=new PdfPCell(new Phrase("UOM 1",boldnormalFont));
			cell.setMinimumHeight(25);
			cell.setUseAscender(true);
			
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			tableforRD.addCell(cell);
			cell=new PdfPCell(new Phrase("22",boldnormalFont));
			cell.setMinimumHeight(25);
			cell.setUseAscender(true);
			
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			tableforRD.addCell(cell);
			cell=new PdfPCell(new Phrase("21",boldnormalFont));
			cell.setMinimumHeight(25);
			cell.setUseAscender(true);
			
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			tableforRD.addCell(cell);
			cell=new PdfPCell(new Phrase("na",boldnormalFont));
			cell.setMinimumHeight(25);
			cell.setUseAscender(true);
			
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			tableforRD.addCell(cell);
	
		}
		
		cell=new PdfPCell(new Phrase("Total",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setColspan(4);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforRD.addCell(cell);
		cell=new PdfPCell(new Phrase("RQ T",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforRD.addCell(cell);
		cell=new PdfPCell(new Phrase("AQ T",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
	
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforRD.addCell(cell);
		cell=new PdfPCell(new Phrase("remarks ",boldnormalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforRD.addCell(cell);
		
		
		cell=new PdfPCell();
		cell.addElement(tableforRD);
		cell.setColspan(4);
		cell.setPadding(0);
		table.addCell(cell);
		
	
		cell=new PdfPCell(new Phrase("Approval History",BoldFont));
		cell.setColspan(4);
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		cell.setBorder(0);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell(cell);
		
		
PdfPTable tableforAH = new PdfPTable(6);
		
		float[] columnWidthsforAH = {2f,1f,2f,2f,1f,2f};
		tableforAH.setWidths(columnWidthsforAH);
		tableforAH.setWidthPercentage(100);
		cell=new PdfPCell(new Phrase("Token ID/Name",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforAH.addCell(cell);
		cell=new PdfPCell(new Phrase("Role",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforAH.addCell(cell);
		cell=new PdfPCell(new Phrase("Recived Date",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
	
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforAH.addCell(cell);
		cell=new PdfPCell(new Phrase("Completion Date",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforAH.addCell(cell);
		cell=new PdfPCell(new Phrase("Status",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforAH.addCell(cell);
		cell=new PdfPCell(new Phrase("Remarks",normalFont));
		cell.setMinimumHeight(25);
		cell.setUseAscender(true);
		
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		tableforAH.addCell(cell);
	
		
		
		

		for(int i=1;i<=0;i++) {
			cell=new PdfPCell(new Phrase("1",boldnormalFont));
			cell.setMinimumHeight(25);
			cell.setUseAscender(true);
			
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			tableforAH.addCell(cell);
			cell=new PdfPCell(new Phrase("Part No 1",boldnormalFont));
			cell.setMinimumHeight(25);
			cell.setUseAscender(true);
			
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			tableforAH.addCell(cell);
			cell=new PdfPCell(new Phrase("Part Description 1",boldnormalFont));
			cell.setMinimumHeight(25);
			cell.setUseAscender(true);
		
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			tableforAH.addCell(cell);
			cell=new PdfPCell(new Phrase("UOM 1",boldnormalFont));
			cell.setMinimumHeight(25);
			cell.setUseAscender(true);
			
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			tableforAH.addCell(cell);
			cell=new PdfPCell(new Phrase("22",boldnormalFont));
			cell.setMinimumHeight(25);
			cell.setUseAscender(true);
			
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			tableforAH.addCell(cell);
			cell=new PdfPCell(new Phrase("21",boldnormalFont));
			cell.setMinimumHeight(25);
			cell.setUseAscender(true);
			
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			tableforAH.addCell(cell);
			
	
		}
		
		
		
		
		cell=new PdfPCell();
		cell.addElement(tableforAH);
		cell.setColspan(4);
		cell.setPadding(0);
		table.addCell(cell);
		
		
		
		
		
		
		document.add(table);
		
	}
	
}



 class HeaderFooterPageEvent extends PdfPageEventHelper {

    Font headerFont = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
    Font normalFont = new Font(Font.FontFamily.HELVETICA, 10);

   
    public void onEndPage(PdfWriter writer, Document document) {
        PdfContentByte cb = writer.getDirectContent();
       PdfPCell cell=null;
        Image image = null;
        PdfPTable table = new PdfPTable(2);
        table.setTotalWidth(document.right() - document.left());
        table.setLockedWidth(true);
        float[] columnWidthsforHeadder = {0.7f, 2.3f};
        try {
            table.setWidths(columnWidthsforHeadder);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        try {
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Desktop\\LogoForExcel.png");
		} catch (BadElementException | IOException e) {
			e.printStackTrace();
		}
        cell=new PdfPCell();
        cell.setRowspan(2);
        cell.addElement(image);
        image.scaleAbsoluteWidth(80f);
		image.scaleAbsoluteHeight(100f);
		table.addCell(cell);

		cell=new PdfPCell(new Phrase("MAHINDRA & MAHINDRA LIMITED",headerFont));
		cell.setMinimumHeight(20);
		cell.setBorderColor(BaseColor.LIGHT_GRAY);
		cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
		cell.setBorderWidthBottom(0);
		cell.setUseAscender(true);
		cell.setVerticalAlignment(Element.ALIGN_BOTTOM);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell);
		cell=new PdfPCell(new Phrase("Mahindra Reaserch Valley Chengalpattu -603004",normalFont));
		cell.setMinimumHeight(20);
		cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
		cell.setBorderColor(BaseColor.LIGHT_GRAY);
		cell.setBorderWidthTop(0);
		cell.setUseAscender(true);
		cell.setVerticalAlignment(Element.ALIGN_TOP);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell);
		cell=new PdfPCell(new Phrase("Consumable WithDraw Slip",headerFont));
		cell.setMinimumHeight(20);
		cell.setBorderColor(BaseColor.LIGHT_GRAY);
		cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
		cell.setColspan(2);
		cell.setBorderWidthTop(0);
		cell.setUseAscender(true);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(cell);
		
        table.writeSelectedRows(0, -1, document.left(), document.top() + 60, cb);
        
        
        PdfPTable table1 = new PdfPTable(1);
        table1.setTotalWidth(PageSize.A4.getWidth() - document.leftMargin() - document.rightMargin());
        table1.setLockedWidth(true);
        float[] columnWidthsforFooter = { 1f};
        try {
            table.setWidths(columnWidthsforFooter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
			
			image = Image.getInstance("C:\\Users\\NICHEBIT\\Desktop\\M_logo_Beam.png");;

			image.setAlignment(Element.ALIGN_CENTER);

		} catch (Exception e) {
			e.printStackTrace();
		}
        cell = new PdfPCell();
        cell.setPadding(0);
		cell.addElement(image);
		cell.setMinimumHeight(40);
		cell.setBorderColor(cell.getBackgroundColor());
        table1.addCell(cell);

        table1.writeSelectedRows(0, -1, 30, table1.getTotalHeight() + 10, cb);
    }
}
