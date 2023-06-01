package sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.CountData;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.service.VisitorCountService;

import java.util.List;

@RestController
public class VisitorCountController {
    private final VisitorCountService visitorCountService;

    @Autowired
    public VisitorCountController(VisitorCountService visitorCountService) {
        this.visitorCountService = visitorCountService;
    }

    @GetMapping("/increment-count")
    public void incrementVisitorCount() {
        visitorCountService.incrementVisitorCount();
    }









}