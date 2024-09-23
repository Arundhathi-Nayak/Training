package com.cg.backend.controller;

import com.cg.backend.entity.IPOApplication;
//import com.cg.backend.entity.UserInformation;
import com.cg.backend.entity.UserInformation;
import com.cg.backend.repository.IPOInterface;
//import com.cg.backend.repository.UserRemote;
import com.cg.backend.repository.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
public class IPOController {

    @Autowired
    IPOInterface ipoInterface;

    @Autowired
    UserRemote userRemote;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/signup")
    void signUp(@RequestBody UserInformation userInformation) {
        userInformation.setPassword(passwordEncoder.encode(userInformation.getPassword()));
        userRemote.save(userInformation);
    }

    @PostMapping("/apply")
    void apply(@RequestBody IPOApplication ipoApplication) {
        ipoInterface.applyIPO(ipoApplication);
    }

    @GetMapping("/viewstatus/{id}")
    String status(@PathVariable Long id) {
        return ipoInterface.statusIPO(id).toString();
    }

    @PostMapping("/allocate")
    void allocate(@RequestBody Double price) {
        ipoInterface.allocation(price);
    }

}
