package by.eftech.webapp.web;

import by.eftech.webapp.model.WheelArrangement;
import by.eftech.webapp.service.*;
import by.eftech.webapp.utils.FilterProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/dump-trucks-capacity")
public class DumpTrucksCrossCountryCapacityController {

    @Autowired
    private DumpTrucksCrossCountryCapacityService dumpTrucksCrossCountryCapacityService;

    @Autowired
    private WheelArrangementService wheelArrangementService;
    @Autowired
    private EngineService engineService;
    @Autowired
    private MachineLocationService machineLocationService;
    @Autowired
    private ManufacturerCountryService manufacturerCountryService;
    @Autowired
    private ManufacturerService manufacturerService;
    @Autowired
    private SeriesService seriesService;
    @Autowired
    private SuspensionService suspensionService;
    @Autowired
    private TransmissionService transmissionService;

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String getCategory(Model model) {
        model.addAttribute("list", dumpTrucksCrossCountryCapacityService.getAll());
        model.addAttribute("engines", engineService.getAll());
        model.addAttribute("machineLocations", machineLocationService.getAll());
        model.addAttribute("manufacturerCountries", manufacturerCountryService.getAll());
        model.addAttribute("manufacturers", manufacturerService.getAll());
        model.addAttribute("series", seriesService.getAll());
        model.addAttribute("wheelArrangements", wheelArrangementService.getAll());
        model.addAttribute("suspensions", suspensionService.getAll());
        model.addAttribute("transmissions", transmissionService.getAll());
        model.addAttribute("filter", new FilterProduct());
        return "category-grid-dump-truck-capacity";
    }
    @RequestMapping(value = "/category/filter", method = RequestMethod.GET)
    public String getFilteredCategory(
            @RequestParam(value = "manufacturer", required = false) List<Integer> manufacturer,
            @RequestParam(value = "manufacturerCountry", required = false) List<Integer> manufacturerCountry,
            @RequestParam(value = "machineLocation", required = false) List<Integer> machineLocation,
            @RequestParam(value = "series", required = false) List<Integer> series,
            @RequestParam(value = "engine", required = false) List<Integer> engine,
            @RequestParam(value = "suspension", required = false) List<Integer> suspension,
            @RequestParam(value = "wheelArrangement", required = false) List<Integer> wheelArrangement,
            @RequestParam(value = "transmission", required = false) List<Integer> transmission,
            @ModelAttribute FilterProduct filter,
            Model model) {

//        model.addAttribute("list", truckMiningService.findTruckMiningFilteredList(
//                manufacturer,
//                manufacturerCountry,
//                machineLocation,
//                series,
//                engine,
//                suspension,
//                transmission,
//                brakeType,
//                frontWheel,
//                rearWheels,
//                parkingBrake,
//                auxiliary));
        model.addAttribute("filter", "filter");
        model.addAttribute("engines", engineService.getAll());
        model.addAttribute("machineLocations", machineLocationService.getAll());
        model.addAttribute("manufacturerCountries", manufacturerCountryService.getAll());
        model.addAttribute("manufacturers", manufacturerService.getAll());
        model.addAttribute("series", seriesService.getAll());
        model.addAttribute("suspensions", suspensionService.getAll());
        model.addAttribute("wheelArrangements", wheelArrangementService.getAll());
        model.addAttribute("filter", filter);
        return "category-grid-dump-truck-capacity";
    }

    @RequestMapping(value = "/single-product/{id}", method = RequestMethod.GET)
    public ModelAndView getProduct(@PathVariable("id") int id) {
        return new ModelAndView("single-product-dump-truck-capacity", "item", dumpTrucksCrossCountryCapacityService.get(id));
    }


    @RequestMapping(value = "/pdf/{id}", method = RequestMethod.GET)
    public ModelAndView downloadPdf(@PathVariable("id") int id) {
        WheelArrangement truckMining = wheelArrangementService.get(id);
        return new ModelAndView("truckMiningPdfView", "truckMining", truckMining);
    }
}
