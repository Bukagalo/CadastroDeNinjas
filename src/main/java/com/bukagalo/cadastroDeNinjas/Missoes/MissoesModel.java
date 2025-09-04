package com.bukagalo.cadastroDeNinjas.Missoes;

import com.bukagalo.cadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "tb_missoes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MissoesModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nome;
    private String dificuldade;

    // Cada missão pode estar vinculado a MUITOS NINJAS
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas ;


}



