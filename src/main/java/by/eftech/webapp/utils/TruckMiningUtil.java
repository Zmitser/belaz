package by.eftech.webapp.utils;

import by.eftech.webapp.model.*;
import by.eftech.webapp.utils.exceptions.ImageUploadException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class TruckMiningUtil {


    public static void saveImage(byte[] data, String filename) throws ImageUploadException, IOException {
        String absolutePath = "D:/Projects/belaz/src/main/webapp/resources/assets/images/" + filename;
        File file = new File(absolutePath);
        FileUtils.writeByteArrayToFile(file, data);

    }

    private static int getIntCellValueFromExcel(Cell cell) {
        int returnNumber = 0;
        if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
            returnNumber = Integer.parseInt(cell.getStringCellValue());
        }

        if (cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
            returnNumber = (int) cell.getNumericCellValue();
        }
        return returnNumber;
    }


    private static String getStringCellValueFromExcel(Cell cell) {
        String returnString = "";
        if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
            returnString = cell.getStringCellValue();
        }

        if (cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
            returnString = String.valueOf((int) cell.getNumericCellValue());
        }
        return returnString;
    }

    public static TruckMining createObjectFromExcel(MultipartFile uploadedFile) throws IOException {
        InputStream inputStream;
        inputStream = uploadedFile.getInputStream();
        HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
        HSSFSheet sheet = workbook.getSheetAt(0);
        String productId = getStringCellValueFromExcel(sheet.getRow(0).getCell(1));
        Manufacturer manufacturer = new Manufacturer(getStringCellValueFromExcel(sheet.getRow(1).getCell(1)));
        ManufacturerCountry manufacturerCountry = new ManufacturerCountry(getStringCellValueFromExcel(sheet.getRow(2).getCell(1)));
        String year = getStringCellValueFromExcel(sheet.getRow(3).getCell(1));
        MachineCondition machineCondition = MachineCondition.valueOf(sheet.getRow(4).getCell(1).getStringCellValue().toUpperCase());
        MachineLocation machineLocation = new MachineLocation(getStringCellValueFromExcel(sheet.getRow(5).getCell(1)));
        Series series = new Series(getStringCellValueFromExcel(sheet.getRow(6).getCell(1)));
        Model model = new Model(getStringCellValueFromExcel(sheet.getRow(7).getCell(1)), series);
        int payloadCapacity = getIntCellValueFromExcel(sheet.getRow(8).getCell(1));
        Engine engine = new Engine(getStringCellValueFromExcel(sheet.getRow(9).getCell(1)));
        String power = getStringCellValueFromExcel(sheet.getRow(10).getCell(1));
        int fuelRate = getIntCellValueFromExcel(sheet.getRow(11).getCell(1));
        Transmission transmission = new Transmission(getStringCellValueFromExcel(sheet.getRow(12).getCell(1)));
        String torque = getStringCellValueFromExcel(sheet.getRow(13).getCell(1));
        Suspension suspension = new Suspension(getStringCellValueFromExcel(sheet.getRow(14).getCell(1)));
        BrakeType brakeType = new BrakeType(getStringCellValueFromExcel(sheet.getRow(15).getCell(1)));
        FrontWheels frontWheels = new FrontWheels(getStringCellValueFromExcel(sheet.getRow(16).getCell(1)));
        RearWheels rearWheels = new RearWheels(getStringCellValueFromExcel(sheet.getRow(17).getCell(1)));
        ParkingBrake parkingBrake = new ParkingBrake(getStringCellValueFromExcel(sheet.getRow(18).getCell(1)));
        Auxiliary auxiliary = new Auxiliary(getStringCellValueFromExcel(sheet.getRow(19).getCell(1)));
        String turningRadius = getStringCellValueFromExcel(sheet.getRow(20).getCell(1));
        int length = getIntCellValueFromExcel(sheet.getRow(21).getCell(1));
        int width = getIntCellValueFromExcel(sheet.getRow(22).getCell(1));
        int height = getIntCellValueFromExcel(sheet.getRow(23).getCell(1));
        int operationalWeight = getIntCellValueFromExcel(sheet.getRow(24).getCell(1));
        int grossWeight = getIntCellValueFromExcel(sheet.getRow(25).getCell(1));
        int maxSpeed = getIntCellValueFromExcel(sheet.getRow(26).getCell(1));
        int price = getIntCellValueFromExcel(sheet.getRow(27).getCell(1));
        Photo photo1 = new Photo(getStringCellValueFromExcel(sheet.getRow(28).getCell(1)));
        Photo photo2 = new Photo(getStringCellValueFromExcel(sheet.getRow(29).getCell(1)));
        Photo photo3 = new Photo(getStringCellValueFromExcel(sheet.getRow(30).getCell(1)));
        Photo photo4 = new Photo(getStringCellValueFromExcel(sheet.getRow(31).getCell(1)));
        Photo photo5 = new Photo(getStringCellValueFromExcel(sheet.getRow(32).getCell(1)));
        Photo photo6 = new Photo(getStringCellValueFromExcel(sheet.getRow(33).getCell(1)));
        Photo photo7 = new Photo(getStringCellValueFromExcel(sheet.getRow(34).getCell(1)));
        Photo photo8 = new Photo(getStringCellValueFromExcel(sheet.getRow(35).getCell(1)));
        Photo photo9 = new Photo(getStringCellValueFromExcel(sheet.getRow(36).getCell(1)));
        Photo photo10 = new Photo(getStringCellValueFromExcel(sheet.getRow(37).getCell(1)));
        String application = getStringCellValueFromExcel(sheet.getRow(38).getCell(1));
        String advantages = getStringCellValueFromExcel(sheet.getRow(39).getCell(1));
        String completeSet = getStringCellValueFromExcel(sheet.getRow(40).getCell(1));
        Video video1 = new Video(getStringCellValueFromExcel(sheet.getRow(41).getCell(1)));
        Video video2 = new Video(getStringCellValueFromExcel(sheet.getRow(42).getCell(1)));
        Video video3 = new Video(getStringCellValueFromExcel(sheet.getRow(43).getCell(1)));
        boolean sold = Boolean.parseBoolean(getStringCellValueFromExcel(sheet.getRow(44).getCell(1)));
        List<Photo> photos = new ArrayList<>();
        photos.add(photo1);
        photos.add(photo2);
        photos.add(photo3);
        photos.add(photo4);
        photos.add(photo5);
        photos.add(photo6);
        photos.add(photo7);
        photos.add(photo8);
        photos.add(photo9);
        photos.add(photo10);
        List<Video> videos = new ArrayList<>();
        videos.add(video1);
        videos.add(video2);
        videos.add(video3);
        return new TruckMining(productId,
                manufacturer,
                manufacturerCountry,
                year,
                machineCondition,
                machineLocation,
                model,
                payloadCapacity,
                engine,
                power,
                fuelRate,
                transmission,
                torque,
                suspension,
                brakeType,
                frontWheels,
                rearWheels,
                parkingBrake,
                auxiliary,
                turningRadius,
                length,
                width,
                height,
                operationalWeight,
                grossWeight,
                maxSpeed,
                price,
                application,
                advantages,
                completeSet,
                sold,
                photos,
                videos);

    }


}
