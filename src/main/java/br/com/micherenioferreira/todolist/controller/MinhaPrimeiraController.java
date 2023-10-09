package br.com.micherenioferreira.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/primeiraRota
public class MinhaPrimeiraController {

    /* 
     * Método de acesso do HTTP
     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT -  Alterar um dado/informação
     * DELETE - Remover um dado
     * PATCH -  Alterar somente uma parte da informação/dado
     */

    // Método (Funcionalidade) de uma classe
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funfou!";
    }
}
