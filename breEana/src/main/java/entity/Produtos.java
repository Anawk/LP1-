package entity;

import jakarta.persistence.*;

@Entity(name = "produtos")
@Table(name = "produtos")

public class Produtos {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int Id;
    @Column
    private String nome;
    @Column
    private String preco;

    public Produtos(String nome, String preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "entity.Produtos{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }
}


