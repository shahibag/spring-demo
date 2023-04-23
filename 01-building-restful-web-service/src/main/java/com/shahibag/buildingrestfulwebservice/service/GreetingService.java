package com.shahibag.buildingrestfulwebservice.service;

import com.shahibag.buildingrestfulwebservice.model.Visitor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * Description: greeting service
 *
 * @author : King
 * @version : v1.0
 * @since : 2023-04-24
 */

@RestController
public class GreetingService {
    private final AtomicInteger visitorCount = new AtomicInteger();

    @GetMapping("/hello")
    public Visitor greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        String saying = "Hello, %s!";
        return new Visitor(String.valueOf(visitorCount.incrementAndGet()) , String.format(saying, name));
    }
}
