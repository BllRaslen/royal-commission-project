package sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.OfficeArabic;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.service.OfficeServiceArabic;


@Controller
@RequestMapping("/admin")
public class AdminControllerArabic {

    private final OfficeServiceArabic officeService;

    @Autowired
    public AdminControllerArabic(OfficeServiceArabic officeService) {
        this.officeService = officeService;
    }

    @GetMapping("/offices-ar")
    public String getAllOffices(Model model) {
        model.addAttribute("offices", officeService.getAllOffices());
        return "offices-ar";
    }

    @GetMapping("/offices/add-ar")
    public String showAddOfficeForm(Model model) {
        model.addAttribute("office", new OfficeArabic());
        return "add-office-ar";
    }

    @PostMapping("/offices/add-ar")
    public String addOffice(@ModelAttribute("office") OfficeArabic office, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-office-ar";
        }
        officeService.saveOffice(office);
        return "redirect:/admin/offices-ar";
    }

    @GetMapping("/offices/edit/{id}-ar")
    public String showEditOfficeForm(@PathVariable("id") Long id, Model model) {
        OfficeArabic office = officeService.getOfficeById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid office id: " + id));
        model.addAttribute("office", office);
        return "edit-office-ar";
    }

    @PostMapping("/offices/edit/{id}-ar")
    public String updateOffice(@PathVariable("id") Long id, @ModelAttribute("office") OfficeArabic office,
                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit-office-ar";
        }
        office.setId(id);
        officeService.saveOffice(office);
        return "redirect:/admin/offices-ar";
    }

    @GetMapping("/offices/delete/{id}-ar")
    public String deleteOffice(@PathVariable("id") Long id) {
        officeService.deleteOffice(id);
        return "redirect:/admin/offices-ar";
    }

    @GetMapping("/offices/search-ar")
    public String searchOffices(@RequestParam("query") String query, Model model) {
        model.addAttribute("offices", officeService.searchOffices(query));
        return "offices-ar";
    }



}
