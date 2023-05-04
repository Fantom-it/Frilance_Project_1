package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RatingsController {

    @GetMapping("/rating_best")
    public String rating_best() {
        return "rating_best.html";
    }

    @GetMapping("/reliability_rating")
    public String reliability_rating() {
        return "reliability-rating.html";
    }

    @GetMapping("/peoples_rating")
    public String peoples_rating() {
        return "peoples-rating.html";
    }

    @GetMapping("/welcome_bonus")
    public String welcome_bonus() {
        return "welcome-bonus.html";
    }

    @GetMapping("/legal_bookmakers")
    public String legal_bookmakers() {
        return "legal-bookmakers.html";
    }

    @GetMapping("/rating_offshore")
    public String rating_offshore() {
        return "rating-offshore.html";
    }

    @GetMapping("/rating_foreign")
    public String rating_foreign() {
        return "rating-foreign.html";
    }


}
