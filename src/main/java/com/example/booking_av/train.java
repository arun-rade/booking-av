package com.example.booking_av;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class train {
    @GetMapping("/train")
    public String getData() {return  "Please  book flights indigo ticket with 50% discount" ; }
}
