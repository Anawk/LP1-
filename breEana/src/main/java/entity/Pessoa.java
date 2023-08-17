package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="pessoa")

public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int Id;
    @Column
    private String nome;
    
    @Column
    private String sobrenome;
    
    @Column
    private String email;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "enderecoID")
    private Endereco endereco;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoa")
    private List<Pedido> pedidos;
    

    public Pessoa(String nome, String sobrenome, String email, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
