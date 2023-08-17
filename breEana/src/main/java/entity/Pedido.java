package entity;

import entity.Produtos;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "pedido")
@Table(name = "pedido")

public class Pedido {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int Id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoaId")
    @Column
    private Pessoa pessoa;

    @Column
    private List<Produtos> produtos= new ArrayList<>();



    public Pedido(String pessoa, List<Produtos> produtos) {
        Pessoa = pessoa;
        this.produtos = produtos;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPessoa() {
        return Pessoa;
    }

    public void setPessoa(String pessoa) {
        Pessoa = pessoa;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "entity.Pedido{" +
                "Id=" + Id +
                ", Pessoa='" + Pessoa + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
