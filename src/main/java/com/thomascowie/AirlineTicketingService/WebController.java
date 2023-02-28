package com.thomascowie.AirlineTicketingService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/index")
    public String index() {
        return "HelloWorld";
    }
}
