package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {

    @GetMapping("/test")
    String test2() {
        return "test2";
    }
}
