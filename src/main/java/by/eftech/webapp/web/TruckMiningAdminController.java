package by.eftech.webapp.web;

import by.eftech.webapp.model.*;
import by.eftech.webapp.service.TruckMiningService;
import by.eftech.webapp.utils.exceptions.ImageUploadException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFPictureData;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class TruckMiningAdminController {

    @Autowired
    private TruckMiningService service;

    @RequestMapping(value = "/export-excel", method = RequestMethod.GET)
    public String getUploadFile() {
        return "export-excel";
    }

    @RequestMapping("/export")
    public void fileUploaded(
            @RequestParam("file") MultipartFile uploadedFile, SessionStatus status) throws IOException {
        status.setComplete();
        InputStream inputStream;
        OutputStream outputStream;
        inputStream = uploadedFile.getInputStream();
        HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
        HSSFSheet sheet = workbook.getSheetAt(0);
        List<HSSFPictureData> allPictures = workbook.getAllPictures();
        List<Photo> list = new ArrayList<>();
        System.out.println(allPictures.size());
        for (HSSFPictureData picture :
                allPictures) {
            byte[] data = picture.getData();
            String s = String.valueOf(picture.hashCode());
            String s1 = picture.suggestFileExtension();
            String path = saveImage(data, s, s1);
            Photo photo = new Photo(path);
            list.add(photo);
        }
        TruckMining truckMining = new TruckMining();
        truckMining.setPhoto(list);
        Series series = new Series(sheet.getRow(0).getCell(5).getStringCellValue());
        Model model = new Model(String.valueOf(sheet.getRow(1).getCell(5).getNumericCellValue()), series);
        int payloadCapacity = (int) sheet.getRow(2).getCell(5).getNumericCellValue();
        Engine engine = new Engine(sheet.getRow(3).getCell(5).getStringCellValue());
        String power = String.valueOf((int)sheet.getRow(4).getCell(5).getNumericCellValue());
        int fuelRate = (int) sheet.getRow(5).getCell(5).getNumericCellValue();
        Transmission transmission = new Transmission(sheet.getRow(6).getCell(5).getStringCellValue());
        String torque = String.valueOf(((int) sheet.getRow(7).getCell(5).getNumericCellValue()));
        Suspension suspension = new Suspension(sheet.getRow(8).getCell(5).getStringCellValue());
        Brakes brakes = new Brakes(sheet.getRow(9).getCell(5).getStringCellValue(),
                sheet.getRow(10).getCell(5).getStringCellValue(),
                sheet.getRow(11).getCell(5).getStringCellValue(),
                sheet.getRow(12).getCell(5).getStringCellValue(),
                sheet.getRow(13).getCell(5).getStringCellValue());
        String turningRadius = String.valueOf(((int) sheet.getRow(14).getCell(5).getNumericCellValue()));
        int length = (int) sheet.getRow(15).getCell(5).getNumericCellValue();
        int width = (int) sheet.getRow(16).getCell(5).getNumericCellValue();
        int height = (int) sheet.getRow(17).getCell(5).getNumericCellValue();
        int operationalWeight = ((int) sheet.getRow(18).getCell(5).getNumericCellValue());
        int grossWeight = ((int) sheet.getRow(19).getCell(5).getNumericCellValue());
        int maxSpeed = ((int) sheet.getRow(20).getCell(5).getNumericCellValue());
        String application = sheet.getRow(21).getCell(5).getStringCellValue();
        truckMining.setPower(power);
        truckMining.setPayloadCapacity(payloadCapacity);
        truckMining.setFuelRate(fuelRate);
        truckMining.setTorque(torque);
        truckMining.setTurningRadius(turningRadius);
        truckMining.setLength(length);
        truckMining.setWidth(width);
        truckMining.setHeight(height);
        truckMining.setOperationalWeight(operationalWeight);
        truckMining.setGrossWeight(grossWeight);
        truckMining.setMaxSpeed(maxSpeed);
        truckMining.setApplication(application);
        truckMining.setModel(model);
        truckMining.setTransmission(transmission);
        truckMining.setEngine(engine);
        truckMining.setSuspension(suspension);
        truckMining.setBrakes(brakes);
        service.save(truckMining);
    }
    private String saveImage(byte[] data, String filename, String extension) throws ImageUploadException {
        String absolutePath = "D:/Projects/belaz/src/main/webapp/resources/assets/images/" + filename + "." + extension;
        String relativePath = "/resources/assets/images/" + filename + "." + extension;
        File file = new File(absolutePath);
        try {
            FileUtils.writeByteArrayToFile(file, data);
        } catch (IOException e) {
            throw new ImageUploadException("Unable to save image", e);
        }

        return relativePath;
    }
}
