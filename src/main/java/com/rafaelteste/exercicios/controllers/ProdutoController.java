package com.rafaelteste.exercicios.controllers;

import com.rafaelteste.exercicios.model.entities.Produto;
import com.rafaelteste.exercicios.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

// Iserir normal
//    @PostMapping
//    public @ResponseBody Produto novoProduto(@Valid Produto produto){
//        produtoRepository.save(produto);
//        return produto;
//    }

    @RequestMapping (method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto novoProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProduto(){
        return  produtoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id){
        return produtoRepository.findById(id);
    }

//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto){
//        produtoRepository.save(produto);
//        return  produto;
//        }
    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }

}
