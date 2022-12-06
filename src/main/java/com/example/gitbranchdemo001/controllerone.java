package com.example.gitbranchdemo001;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerone {

    private String name = "Hans";
    private String nam2e = "not sure how this works.";
    private String nawm2e = "not sure AGAIN how this works.";

    @GetMapping("/")
    public String myfunc(){
        return name;
    }
}
