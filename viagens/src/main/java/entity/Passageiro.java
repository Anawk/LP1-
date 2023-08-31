package entity;

import jakarta.persistence.*;


@Entity(name = "passageiro")
@Table(name = "passageiro_tb")
public class Passageiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column
    private String nome;

    @Column
    private String CPF;

    public Passageiro(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public Passageiro(Long id, String nome, String CPF) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
    }
}
