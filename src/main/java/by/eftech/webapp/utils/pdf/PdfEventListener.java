package by.eftech.webapp.utils.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;




public class PdfEventListener extends PdfPageEventHelper {


    @Override

    public void onEndPage(PdfWriter writer, Document document) {

        PdfContentByte canvas = writer.getDirectContentUnder();

        Phrase watermark = new Phrase("BELAZ", new Font(Font.FontFamily.TIMES_ROMAN, 190, Font.NORMAL, BaseColor.LIGHT_GRAY));

        ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, watermark, 337, 500, 45);

    }

}
