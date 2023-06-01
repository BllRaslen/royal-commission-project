package sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.controller;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.OfficeArabic;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.service.OfficeServiceArabic;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.service.VisitorCountService;


@Controller
public class OfficeControllerArabic {

    private final OfficeServiceArabic officeService;

    private final VisitorCountService visitorCountService;

    public OfficeControllerArabic(OfficeServiceArabic officeService, VisitorCountService visitorCountService) {
        this.officeService = officeService;
        this.visitorCountService = visitorCountService;
    }

    @GetMapping("/depts")
    public String getAllOffices(Model model) {
        model.addAttribute("offices", officeService.getAllOffices());
        return "index-ar";
    }

    @GetMapping("/adminCheck")
    public String adminCheck(Model model) {
        //model.addAttribute("offices", officeService.getAllOffices());
        return "admin";
    }
    @GetMapping("/lang")
    public String lang(Model model) {
        //model.addAttribute("offices", officeService.getAllOffices());
        return "language";
    }

    @GetMapping("/office/{id}")
    public String getOfficeById(@PathVariable("id") Long id, Model model) {
        OfficeArabic office = officeService.getOfficeById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid office id: " + id));
        model.addAttribute("office", office);
        return "office-details-ar";
    }

    @GetMapping("home-page")
    public String maina(/*@RequestParam("query") String query,*/ Model model) {
        visitorCountService.incrementVisitorCount();

        //model.addAttribute("offices", officeService.searchOffices(query));
        return "home";
    }

    @GetMapping("support")
    public String support(/*@RequestParam("query") String query,*/ Model model) {
        //model.addAttribute("offices", officeService.searchOffices(query));
        return "support";
    }


    @GetMapping("test")
    public String test(/*@RequestParam("query") String query,*/ Model model) {
        //model.addAttribute("offices", officeService.searchOffices(query));
        return "test";
    }




}
