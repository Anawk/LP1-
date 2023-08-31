package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "servico")

public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column
    private Double preco;

    @Column
    private String tipo;

    public Servico(Double preco, String tipo) {
        this.preco = preco;
        this.tipo = tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "id=" + id +
                ", preco=" + preco +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
