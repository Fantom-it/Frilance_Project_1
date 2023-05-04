package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/main")
    public String main() {
        return "main.html";
    }

    @PostMapping("/main")
    public String mainp(@RequestParam String value) {
        String value_p = value;
        System.out.println(value_p);
        return "rating_best.html";
    }

  //  @PostMapping("/main")
  //  public String search(@RequestParam String value) {
  //      System.out.println(value);
  //      return "main.html";
  //  }

    @GetMapping("/agency")
    public String agency() {
        return "agency.html";
    }

    @GetMapping("/applications")
    public String applications() {
        return "applications.html";
    }

    @GetMapping("/bonuses")
    public String bonuses() {
        return "bonuses.html";
    }

    @GetMapping("/forecasts")
    public String forecasts() {
        return "forecasts.html";
    }

    @GetMapping("/knowledge_base")
    public String knowledge_base() {
        return "knowledge_base.html";
    }

    @GetMapping("/ratings")
    public String ratings() {
        return "ratings.html";
    }

}
