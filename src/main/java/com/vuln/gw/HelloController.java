package com.vuln.gw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/admin")
    public String index() {

        return "hello admin";
    }
}