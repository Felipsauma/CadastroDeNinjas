package dev.jav10x.CadastroDeNinjas.Ninjas;

import dev.jav10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

// Entity ele transforma uma classe em uma entidade do BD
// JPA = java persistence API
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

    public String getNome() {
        return nome;
    }
    public NinjaModel setNome(String nome) {
        this.nome = nome;
        return this;
    }
    public String getEmail() {
        return email;
    }
    public NinjaModel setEmail(String email) {
        this.email = email;
        return this;
    }
    public int getIdade() {
        return idade;
    }
    public NinjaModel setIdade(int idade) {
        this.idade = idade;
        return this;
    }
    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    public NinjaModel() {
    }
}
