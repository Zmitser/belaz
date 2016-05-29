package by.eftech.webapp.web;

import by.eftech.webapp.model.TruckMining;
import by.eftech.webapp.service.*;
import by.eftech.webapp.utils.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TruckMiningController {

    @Autowired
    private TruckMiningService truckMiningService;
    @Autowired
    private EngineService engineService;
    @Autowired
    private AuxiliaryService auxiliaryService;
    @Autowired
    private BrakeTypeService brakeTypeService;
    @Autowired
    private FrontWheelsService frontWheelsService;
    @Autowired
    private MachineLocationService machineLocationService;
    @Autowired
    private ManufacturerCountryService manufacturerCountryService;
    @Autowired
    private ManufacturerService manufacturerService;
    @Autowired
    private ParkingBrakeService parkingBrakeService;
    @Autowired
    private RearWheelsService rearWheelsService;
    @Autowired
    private SeriesService seriesService;
    @Autowired
    private SuspensionService suspensionService;
    @Autowired
    private TransmissionService transmissionService;

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String getCategory(Model model) {
        model.addAttribute("list", truckMiningService.getAll());
        model.addAttribute("engines", engineService.getAll());
        model.addAttribute("auxiliaries", auxiliaryService.getAll());
        model.addAttribute("brakeTypes", brakeTypeService.getAll());
        model.addAttribute("frontWheels", frontWheelsService.getAll());
        model.addAttribute("machineLocations", machineLocationService.getAll());
        model.addAttribute("manufacturerCountries", manufacturerCountryService.getAll());
        model.addAttribute("manufacturers", manufacturerService.getAll());
        model.addAttribute("series", seriesService.getAll());
        model.addAttribute("parkingBrakes", parkingBrakeService.getAll());
        model.addAttribute("rearWheels", rearWheelsService.getAll());
        model.addAttribute("suspensions", suspensionService.getAll());
        model.addAttribute("transmissions", transmissionService.getAll());
        model.addAttribute("filter", new Filter());
        return "category-grid";
    }
    @RequestMapping(value = "/category/filter", method = RequestMethod.GET)
    public String getFilteredCategory(
            @RequestParam(value = "manufacturer", required = false) List<Integer> manufacturer,
            @RequestParam(value = "manufacturerCountry", required = false) List<Integer> manufacturerCountry,
            @RequestParam(value = "machineLocation", required = false) List<Integer> machineLocation,
            @RequestParam(value = "series", required = false) List<Integer> series,
            @RequestParam(value = "engine", required = false) List<Integer> engine,
            @RequestParam(value = "suspension", required = false) List<Integer> suspension,
            @RequestParam(value = "transmission", required = false) List<Integer> transmission,
            @RequestParam(value = "brakeType", required = false) List<Integer> brakeType,
            @RequestParam(value = "frontWheel", required = false) List<Integer> frontWheel,
            @RequestParam(value = "rearWheel", required = false) List<Integer> rearWheels,
            @RequestParam(value = "parkingBrake", required = false) List<Integer> parkingBrake,
            @RequestParam(value = "auxiliary", required = false) List<Integer> auxiliary,
            @ModelAttribute Filter filter,
            Model model) {

        model.addAttribute("list", truckMiningService.findTruckMiningFilteredList(
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
                auxiliary));
        model.addAttribute("filter", "filter");
        model.addAttribute("engines", engineService.getAll());
        model.addAttribute("auxiliaries", auxiliaryService.getAll());
        model.addAttribute("brakeTypes", brakeTypeService.getAll());
        model.addAttribute("frontWheels", frontWheelsService.getAll());
        model.addAttribute("machineLocations", machineLocationService.getAll());
        model.addAttribute("manufacturerCountries", manufacturerCountryService.getAll());
        model.addAttribute("manufacturers", manufacturerService.getAll());
        model.addAttribute("series", seriesService.getAll());
        model.addAttribute("parkingBrakes", parkingBrakeService.getAll());
        model.addAttribute("rearWheels", rearWheelsService.getAll());
        model.addAttribute("suspensions", suspensionService.getAll());
        model.addAttribute("filter", filter);
        return "category-grid";
    }

    @RequestMapping(value = "/single-product/{id}", method = RequestMethod.GET)
    public ModelAndView getProduct(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        return new ModelAndView("single-product", "item", truckMiningService.get(id));
    }


    @RequestMapping(value = "/pdf/{id}", method = RequestMethod.GET)
    public ModelAndView downloadPdf(@PathVariable("id") int id) {
        TruckMining truckMining = truckMiningService.get(id);
        return new ModelAndView("truckMiningPdfView", "truckMining", truckMining);
    }

}
