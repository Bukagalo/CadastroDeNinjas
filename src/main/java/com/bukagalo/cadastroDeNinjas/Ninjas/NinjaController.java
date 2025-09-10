package com.bukagalo.cadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

// Adicionar ninja (CREATE)
@PostMapping("/criar")

public String criarNinja() {
    return "Ninja Criado";
}



    // Mostrar todos os  ninjas (READ)
    @GetMapping("/Listartodos")
    public String mostrarNijas(){
        return "Todos os Ninjas";
    }


    // Mostrar Ninjas por ID (READ)


    @GetMapping("/todos")
    public String mostrarNijasPorId(){
        return "Mostrando  Ninjas por ID " ;
    }



    // Alterar dados dos ninjas (UPDATE)
@PutMapping("/editarID")
public String editarNijasPorId(){
    return "Mostrando  Ninjas por ID " ;
}


    // Deletar ninja (DELETE)
@DeleteMapping("/deletarPorId")
    public String deletarPorId(){
        return "Ninja deletado por ID";
}

}
