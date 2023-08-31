package entity;

import jakarta.persistence.*;

//tipo do generation type sempre identity se ele não especificar.
@Entity(name = "piloto")
@Table(name = "piloto_tb")

public class Piloto {


    //redundante dizer q o id é colum, n precisa
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column
    private String nome;

    @Column
    private String codAutorizacao;

    public Piloto(String nome, String codAutorizacao) {
        this.nome = nome;
        this.codAutorizacao = codAutorizacao;
    }

    public Piloto(Long id, String nome, String codAutorizacao) {
        this.id = id;
        this.nome = nome;
        this.codAutorizacao = codAutorizacao;
    }
}
