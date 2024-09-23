package com.cg.fronted.mvc;

import com.cg.fronted.entity.UserInformation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/stocks")
public class MVCController {
    @GetMapping("/")
    String index(){
        return "index";
    }

    @GetMapping("/signup")
    String signup(){
        return "signup";
    }

    @GetMapping("/dashboard")
    String dashboard(){
        return "dashboard";
    }

    @GetMapping("/apply")
    String applyIPO(){
        return "applyIPO";
    }

    @GetMapping("/profile")
    String profile(){
        return "profile";
    }

    @PostMapping("/create")
    public String submitForm(@ModelAttribute UserInformation user, Model model) {
        RestTemplate restTemplate = new RestTemplate();
        UserInformation response = restTemplate.postForObject("http://localhost:8080/stock/signup", user, UserInformation.class);

        model.addAttribute("response", response);
        return "redirect:/"; // Redirect or show another page after submission.
    }

}
