package by.eftech.webapp.web;

import by.eftech.webapp.model.TruckMining;
import by.eftech.webapp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
