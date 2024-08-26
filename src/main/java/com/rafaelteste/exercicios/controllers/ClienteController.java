package com.rafaelteste.exercicios.controllers;

import com.rafaelteste.exercicios.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente retornaCliente1(){
        return new Cliente(1,"rafael","111.222.333-44");
    }

    @GetMapping("/{id}")
    public Cliente obterClienteId(@PathVariable int id){
        return new Cliente(id,"rafael","111.222.333-44");
    }

    @GetMapping
    public Cliente obterClienteId2(
            @RequestParam(name = "id", defaultValue = "1") int id){
        return new Cliente(id,"rafael","111.222.333-44");
    }
}
