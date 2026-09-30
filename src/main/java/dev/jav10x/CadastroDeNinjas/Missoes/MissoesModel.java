package dev.jav10x.CadastroDeNinjas.Missoes;

import dev.jav10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Table ( name = "tb_ missoes")
@Entity
public class MissoesModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    private NinjaModel ninja;
//   @OneToMany--uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas ;
}
