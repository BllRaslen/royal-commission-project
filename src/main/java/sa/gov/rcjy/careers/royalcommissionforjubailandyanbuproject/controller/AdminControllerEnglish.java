/*

package sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.OfficeArabic;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.OfficeEnglish;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.service.OfficeServiceEnglish;


@Controller
@RequestMapping("/admin/en")
public class AdminControllerEnglish {

    private final OfficeServiceEnglish officeService;

    @Autowired
    public AdminControllerEnglish(OfficeServiceEnglish officeService) {
        this.officeService = officeService;
    }

    @GetMapping("/offices")
    public String getAllOffices(Model model) {
        model.addAttribute("offices", officeService.getAllOffices());
        return "offices-en";
    }

    @GetMapping("/offices/add")
    public String showAddOfficeForm(Model model) {
        model.addAttribute("office", new OfficeArabic());
        return "add-office-en";
    }

    @PostMapping("/offices/add")
    public String addOffice(@ModelAttribute("office") OfficeEnglish office, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-office-en";
        }
        officeService.saveOffice(office);
        return "redirect:/admin/offices";
    }

    @GetMapping("/offices/edit/{id}")
    public String showEditOfficeForm(@PathVariable("id") Long id, Model model) {
        OfficeEnglish office = officeService.getOfficeById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid office id: " + id));
        model.addAttribute("office", office);
        return "edit-office-en";
    }

    @PostMapping("/offices/edit/{id}")
    public String updateOffice(@PathVariable("id") Long id, @ModelAttribute("office") OfficeEnglish office,
                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit-office-en";
        }
        office.setId(id);
        officeService.saveOffice(office);
        return "redirect:/admin/offices";
    }

    @GetMapping("/offices/delete/{id}")
    public String deleteOffice(@PathVariable("id") Long id) {
        officeService.deleteOffice(id);
        return "redirect:/admin/offices";
    }

    @GetMapping("/offices/search")
    public String searchOffices(@RequestParam("query") String query, Model model) {
        model.addAttribute("offices", officeService.searchOffices(query));
        return "offices-en";
    }


}

*/

package sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.OfficeArabic;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.OfficeEnglish;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.service.OfficeServiceArabic;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.service.OfficeServiceEnglish;


@Controller
@RequestMapping("/admin/en")
public class AdminControllerEnglish {

    private final OfficeServiceEnglish officeService;

    @Autowired
    public AdminControllerEnglish(OfficeServiceEnglish officeService) {
        this.officeService = officeService;
    }

    @GetMapping("/offices")
    public String getAllOffices(Model model) {
        model.addAttribute("offices", officeService.getAllOffices());
        return "offices-en";
    }

    @GetMapping("/offices/add")
    public String showAddOfficeForm(Model model) {
        model.addAttribute("office", new OfficeArabic());
        return "add-office-en";
    }

    @PostMapping("/offices/add")
    public String addOffice(@ModelAttribute("office") OfficeEnglish office, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-office-en";
        }
        officeService.saveOffice(office);
        return "redirect:/admin/en/offices";
    }

    @GetMapping("/offices/edit/{id}")
    public String showEditOfficeForm(@PathVariable("id") Long id, Model model) {
        OfficeEnglish office = officeService.getOfficeById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid office id: " + id));
        model.addAttribute("office", office);
        return "edit-office-en";
    }

    @PostMapping("/offices/edit/{id}")
    public String updateOffice(@PathVariable("id") Long id, @ModelAttribute("office") OfficeEnglish office,
                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit-office-en";
        }
        office.setId(id);
        officeService.saveOffice(office);
        return "redirect:/admin/en/offices";
    }

    @GetMapping("/offices/delete/{id}")
    public String deleteOffice(@PathVariable("id") Long id) {
        officeService.deleteOffice(id);
        return "redirect:/admin/en/offices";
    }

    @GetMapping("/offices/search")
    public String searchOffices(@RequestParam("query") String query, Model model) {
        model.addAttribute("offices", officeService.searchOffices(query));
        return "offices-en";
    }
}
