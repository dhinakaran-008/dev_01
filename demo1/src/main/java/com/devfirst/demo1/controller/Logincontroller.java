package com.devfirst.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class Logincontroller {
@GetMapping("/")
public String homepage() {
    return "home.html";
}

}
