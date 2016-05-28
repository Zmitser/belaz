package by.eftech.webapp.web;

import by.eftech.webapp.model.TruckMining;
import by.eftech.webapp.service.TruckMiningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/ajax/truck-mining")
public class TruckMiningAjaxController {

    @Autowired
    private TruckMiningService truckMiningService;


    @RequestMapping(value = "/filter", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<TruckMining> getFilteredCategory(
            @RequestParam(value = "manufacturer", required = false) Integer[] manufacturer,
            @RequestParam(value = "manufacturerCountry", required = false) Integer[] manufacturerCountry,
            @RequestParam(value = "machineLocation", required = false) Integer[] machineLocation,
            @RequestParam(value = "series", required = false) Integer[] series,
            @RequestParam(value = "engine", required = false) Integer[] engine,
            @RequestParam(value = "suspension", required = false) Integer[] suspension,
            @RequestParam(value = "transmission", required = false) Integer[] transmission,
            @RequestParam(value = "brakeType", required = false) Integer[] brakeType,
            @RequestParam(value = "frontWheel", required = false) Integer[] frontWheel,
            @RequestParam(value = "rearWheel", required = false) Integer[] rearWheels,
            @RequestParam(value = "parkingBrake", required = false) Integer[] parkingBrake,
            @RequestParam(value = "auxiliary", required = false) Integer[] auxiliary
            ){


        return truckMiningService.findTruckMiningFilteredList(
                manufacturer,
                manufacturerCountry,
                machineLocation,
                series,
                engine,
                suspension,
                transmission,
                brakeType,
                frontWheel,
                rearWheels,
                parkingBrake,
                auxiliary);
    }
}
