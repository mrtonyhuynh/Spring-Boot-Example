package trihuynh.minisocial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
    @GetMapping("/quickstart")
    public String quickstart(){
        return "Hello";
    };

    @GetMapping("/")
    public String homePage(){
        return "This is home page";
    }
}
