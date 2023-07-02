package com.restapi.simplerestapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping
public class Example {
    @GetMapping
    public UUID getRandomUUID () {
        return UUID.randomUUID();
    }
}