package com.zxc.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class HelloController {
    @RequestMapping("/")
    public Map<String, String> index() {
        return Collections.singletonMap("name", "zxc");
    }
}
