package com.rafaelteste.exercicios.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraCotroller {
    @GetMapping("/somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b){
        return a + b;

    }
    @GetMapping("/subtrair")
    public int subtrair(
            @RequestParam(name = "n1") int num1, @RequestParam(name = "n2") int num2){
    return num1 - num2;
    }
}
