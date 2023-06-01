package sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.controller;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.CountData;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.OfficeEnglish;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.service.OfficeServiceEnglish;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.service.VisitorCountService;

import java.util.List;


@Controller
@RequestMapping("/en")
public class OfficeControllerEnglish {

    private final OfficeServiceEnglish officeService;
    private final VisitorCountService visitorCountService;



    public OfficeControllerEnglish(OfficeServiceEnglish officeService, VisitorCountService visitorCountService) {
        this.officeService = officeService;
        this.visitorCountService = visitorCountService;
    }

    @GetMapping("/depts")
    public String getAllOffices(Model model) {
        model.addAttribute("offices", officeService.getAllOffices());
        return "index-en";
    }

    @GetMapping("/count")
    public String count(Model model) {
        // Retrieve the visitor count data for the last 7 days
        List<CountData> counts = visitorCountService.getVisitorCountsLast7Days();
        model.addAttribute("counts", counts);
        return "count";
    }

    @GetMapping("/office/{id}")
    public String getOfficeById(@PathVariable("id") Long id, Model model) {
        OfficeEnglish office = officeService.getOfficeById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid office id: " + id));
        model.addAttribute("office", office);
        return "office-details-en";
    }
}
