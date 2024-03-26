package com.aula06.olaMundo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class olaController {
    
    @GetMapping("/")
    public String getOlamundo(){
        return "Olá mundo";
    }
}
