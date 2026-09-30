package dev.jav10x.CadastroDeNinjas.Ninjas;

import dev.jav10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity ele transforma uma classe em uma entidade do BD
// JPA = java persistence API
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel extends MissoesModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
     private long ID;

     private String nome;

      private String email;

     private int idade;
     // @manytooone---um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // foreing key ou chave estrangeira
    private MissoesModel missoes;

    }

