package com.bukagalo.cadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")

public class MissoesController {
    @PostMapping("/criar")// POST  MANDA UMA REQUISIÇÃO PARA CRIAR  UMA NOVA MISSÃO
    public String criarMissao(){
        return "Missao Criada";
    }

@PutMapping("/editar")// PUT MANDA UMA REQUISIÇÃO PARA ALTERAR / EDITAR  AS MISSÕES EXISTENTES
public String editarMissao(){
    return "Missao Editada";
}
    @DeleteMapping("/delete") // DELETE MANDA UMA REQUISIÇÃO PARA DELETAR AS MISSÕES EXISTENTES
    public String deleteMissao(){
        return "Missao Editada";
    }
    @GetMapping("/listar")  // GET MANDA UMA REQUISIÇÃO PARA RETORNAR AS MISSÕES EXISTENTES
    public String listarMissao(){
        return "Listando Missões";
    }

}
