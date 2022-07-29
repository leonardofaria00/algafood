package com.algaworks.algafood.application.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("algafood/v1/algafood")
public class HomeController {

    @Autowired
    private Logger logger;

    @GetMapping
    public ResponseEntity<String> index() {
        logger.info("Test Property");
        return ResponseEntity.ok("Test Property");
    }
}
