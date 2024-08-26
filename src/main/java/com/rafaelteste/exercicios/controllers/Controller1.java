package com.rafaelteste.exercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @GetMapping (path = {"/ola", "/salve"})
    public String ola(){
        return "teste";
    }
}
