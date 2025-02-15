package com.example.junkyard.controllers;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController("/")
public class Listing {

    private static final Logger log = LoggerFactory.getLogger(Listing.class);

    @GetMapping("hello")
    public String hello() {
        log.info("Testing logging");
        return "Hello world";
    }
}
