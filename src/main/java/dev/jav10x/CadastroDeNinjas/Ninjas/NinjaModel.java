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
@Column ( name = "id")
     private long ID;
@Column ( name = "nome" )
     private String nome;
@Column(unique = true)
      private String email;
@Column ( name = "idade")
     private int idade;
@Column ( name= "img_url")
    private  String imgUrl;

     // @manytooone---um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // foreing key ou chave estrangeira
    private MissoesModel missoes;

    }

