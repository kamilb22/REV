package com.example.rev;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/{value}")
    public String reverse(@PathVariable String value) {
        return new StringBuilder(value).reverse().toString();
    }
}
