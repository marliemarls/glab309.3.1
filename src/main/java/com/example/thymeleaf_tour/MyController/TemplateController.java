package com.example.thymeleaf_tour.MyController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class TemplateController {

    @GetMapping("/ExampleTwo")
    public String template(Model model){
        String message = "Top 5 CLoud Service Providers";
        List<String> list = new ArrayList<>();
        list.add("Amazon Web Services");
        list.add("Microsoft Azure");
        list.add("Google Cloud");
        list.add("Alibab Cloud");
        list.add("IBM Cloud");
        model.addAttribute("message", message);
        model.addAttribute("cloudProvider", list);
        return "DemoPage";
    }

}
