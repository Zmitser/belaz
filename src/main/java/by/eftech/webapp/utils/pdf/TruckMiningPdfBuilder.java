package by.eftech.webapp.utils.pdf;

import by.eftech.webapp.model.TruckMining;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


public class TruckMiningPdfBuilder extends AbstractITextPdfView {
    public static final String FONT = "fonts/Times New Roman Cyr Regular.ttf";

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer, HttpServletRequest request, HttpServletResponse response) throws Exception {
        document.open();
        writer.setPageEvent(new PdfEventListener());
        TruckMining truckMining = (TruckMining) model.get("truckMining");
        String about = "OJSC \"BELAZ\" - Management Company of Holding \"BELAZ-HOLDING\"\n" +
                "Address: 40 let Octyabrya str. 4, 222161, Zhodino, Minsk region, Republic of Belarus";
        Image logo  = Image.getInstance("src/main/webapp/resources/assets/images/Belaz_logo.png");
        logo.setAlignment(Image.TEXTWRAP);
        logo.scaleAbsolute(230f, 60f);
        Paragraph aboutParagraph = new Paragraph(about);
        aboutParagraph.setIndentationLeft(30f);

        Paragraph coverTitle = new Paragraph(truckMining.getModel().getName(), FontFactory.getFont(
                FontFactory.HELVETICA, 40, Font.BOLD));

        coverTitle.setAlignment(Paragraph.ALIGN_CENTER);
        coverTitle.setSpacingBefore(170f);

        Paragraph businessOffer = new Paragraph("Business offer", FontFactory.getFont(
                FontFactory.HELVETICA, 20, Font.NORMAL));
        businessOffer.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(logo);
        document.add(aboutParagraph);
        document.add(coverTitle);
        document.add(businessOffer);
        Paragraph element = new Paragraph(truckMining.getModel().getName(), FontFactory.getFont(
                FontFactory.HELVETICA, 20, Font.BOLD));
        element.setSpacingAfter(10);
        Chapter chapter = new Chapter(element, 1);
        chapter.setNumberDepth(0);
        Paragraph title11 = new Paragraph("Application",
                FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD));
        Section section = chapter.addSection(title11);

        Paragraph sectionText = new Paragraph(truckMining.getApplication());
        sectionText.setSpacingAfter(10);
        sectionText.setSpacingBefore(10);
        section.add(sectionText);
        Image image1 = Image.getInstance("src/main/webapp/resources/assets/images/" + truckMining.getPhotos().get(0).getName());
        image1.scaleAbsolute(250f, 175f);
        image1.setAlignment(Element.ALIGN_CENTER);
        section.add(image1);
        Paragraph figcapture1 = new Paragraph("Figure 1",
                FontFactory.getFont(FontFactory.HELVETICA, 10, Font.ITALIC));
        figcapture1.setAlignment(Element.ALIGN_CENTER);
        section.add(figcapture1);
        Image image2 = Image.getInstance("src/main/webapp/resources/assets/images/" + truckMining.getPhotos().get(1).getName());
        image2.scaleAbsolute(250f, 175f);
        image2.setAlignment(Element.ALIGN_CENTER);
        section.add(image2);
        Paragraph figcapture2 = new Paragraph("Figure 2",
                FontFactory.getFont(FontFactory.HELVETICA, 10, Font.ITALIC));
        figcapture2.setAlignment(Element.ALIGN_CENTER);
        section.add(figcapture2);
        Image image3 = Image.getInstance("src/main/webapp/resources/assets/images/" + truckMining.getPhotos().get(2).getName());
        image3.scaleAbsolute(250f, 175f);
        image3.setAlignment(Element.ALIGN_CENTER);
        section.add(image3);
        Paragraph figcapture3 = new Paragraph("Figure 3",
                FontFactory.getFont(FontFactory.HELVETICA, 10, Font.ITALIC));
        figcapture3.setAlignment(Element.ALIGN_CENTER);
        section.add(figcapture3);


        Paragraph title12 = new Paragraph("Advantages",
                FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD));
        Section section2 = chapter.addSection(title12);
        Paragraph sectionText2 = new Paragraph(truckMining.getAdvantages());
        sectionText2.setSpacingBefore(10);
        section2.add(sectionText2);



        Paragraph title13 = new Paragraph("Equipment",
                FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD));
        Section section3 = chapter.addSection(title13);
        Paragraph sectionText3 = new Paragraph(truckMining.getCompleteSet());
        sectionText3.setSpacingBefore(10);
        section3.add(sectionText3);


        Paragraph title14 = new Paragraph("Characteristics",
                FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD));
        Section section4 = chapter.addSection(title14);
        PdfPTable table = new PdfPTable(6);
        table.setWidths(new float[]{4.0f, 6.0f, 6.0f, 5.0f, 5.0f, 4.0f});
        table.setSpacingBefore(20);
        BaseFont bf = BaseFont.createFont(FONT, BaseFont.IDENTITY_H, BaseFont.EMBEDDED); //подключаем файл шрифта, который поддерживает кириллицу
        Font font = new Font(bf);
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(BaseColor.ORANGE);
        cell.setPadding(5);
        cell.setPhrase(new Phrase("Model", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Manufacturer", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Manufacturer Country", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Machine Condition", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Machine Location", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Engine", font));
        table.addCell(cell);

        cell.setBackgroundColor(BaseColor.BLUE);
        cell.setPhrase(new Phrase(truckMining.getModel().getName(), font));
        table.addCell(cell);
        cell.setPhrase(new Phrase(truckMining.getManufacturer().getName(), font));
        table.addCell(cell);
        cell.setPhrase(new Phrase(truckMining.getManufacturerCountry().getName(), font));
        table.addCell(cell);
        cell.setPhrase(new Phrase(truckMining.getMachineCondition().getName(), font));
        table.addCell(cell);
        cell.setPhrase(new Phrase(truckMining.getMachineLocation().getName(), font));
        table.addCell(cell);
        cell.setPhrase(new Phrase(truckMining.getEngine().getName(), font));
        table.addCell(cell);
        table.setSpacingAfter(10);
        table.setSpacingAfter(10);
        section4.add(table);


        document.add(chapter);

    }

}

