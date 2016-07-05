package by.eftech.webapp.web;

import by.eftech.webapp.model.DumpTrucksCrossCountryCapacity;
import by.eftech.webapp.service.DumpTrucksCrossCountryCapacityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.security.Principal;

import static by.eftech.webapp.utils.DumpTrucksCrossCountryCapacityUtil.createObjectFromExcel;
import static by.eftech.webapp.utils.DumpTrucksCrossCountryCapacityUtil.saveImage;

@RestController
@Secured("ROLE_ADMIN")
@RequestMapping("/dump-trucks/admin/rest")
public class DumpTrucksCrossCountryCapacityAdminAjaxController {

    @Autowired
    private DumpTrucksCrossCountryCapacityService service;

    @RequestMapping("/upload-photo")
    public ResponseEntity<String> photoUploaded(
            @RequestParam(value = "file", required = false) MultipartFile uploadedFile,
            SessionStatus status,
            HttpServletRequest request,
            Principal principal) throws IOException {
        status.setComplete();
        String name = uploadedFile.getOriginalFilename();
        saveImage(uploadedFile.getBytes(), name, request);
        return new ResponseEntity<>(name, HttpStatus.OK);
    }

    @RequestMapping("/export")
    public ResponseEntity<String> fileUploaded(
            @RequestParam(value = "file", required = false) MultipartFile uploadedFile,
            SessionStatus status,
            Principal principal) throws IOException {
        status.setComplete();
        DumpTrucksCrossCountryCapacity truckMining = createObjectFromExcel(uploadedFile);
        service.save(truckMining);
        return new ResponseEntity<>(uploadedFile.getName(), HttpStatus.OK);
    }
}
