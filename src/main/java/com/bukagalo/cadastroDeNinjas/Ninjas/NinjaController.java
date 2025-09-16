package com.bukagalo.cadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    @GetMapping("/Listar")
    public List<NinjaModel> ListarNijas(){

                    return ninjaService.listarNinjas();


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
