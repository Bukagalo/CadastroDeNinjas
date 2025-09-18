package com.bukagalo.cadastroDeNinjas.Ninjas;

import com.bukagalo.cadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data


public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id ;
  private String nome;

    //  Coluna da FK visível para o JSON
    @Column(name = "missoes_id")
    private Long missoesId;

    @Column(unique = true)
  private String email;
  private int idade;

 // @ManyToOne um ninja só pode estar vinculado a uma única missão;
 // Relacionamento com a entidade Missao (não serializa no JSON)
 @ManyToOne
 @JoinColumn(name = "missoes_id", insertable = false, updatable = false)
 private MissoesModel missoes;

}
