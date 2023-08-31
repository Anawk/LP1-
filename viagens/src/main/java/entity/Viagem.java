package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//entity.Viagem já cria o pacote e a classe
//relacionamento nessa tabela
//nao marcar os relacionamentos como coluna (piloto e list)
//muitas viagens para um unico piloro
//mapear no hibernate.cfg.xml
//criar to string

@Entity(name = "viagem")
@Table(name = "viagem_tb")
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @Column
    private Integer vagas;
    @Column
    private String destino;

    @ManyToOne(cascade = CascadeType.ALL)
    //junta viagens com pilotos, //coluna armazena o id da tabela piloto
    @JoinColumn(name = "pilotoid")
    private Piloto piloto;

    //relação mtos pra muitos precisa criar uma tabela propria com chave primaria das duas tabelas
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "viagem-passageiro", joinColumns = @JoinColumn(name = "viagemid"), inverseJoinColumns = @JoinColumn(name = "passageiroid"))
    private List<Passageiro> passageiros;

    //inicializar lista!!!

    public Viagem(Integer vagas, String destino) {
        this.vagas = vagas;
        this.destino = destino;
        this.passageiros = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        if (passageiros.size() > vagas)
            System.out.println("Essa viagem só pode receber" + this.vagas + "vagas!");
        else
        this.passageiros = passageiros;
        //se for mais q o limite ele nao salva, se for menos ele salva
    }

    public Viagem(Long id, Integer vagas, String destino, Piloto piloto, List<Passageiro> passageiros) {
        this.id = id;
        this.vagas = vagas;
        this.destino = destino;
        this.piloto = piloto;
        this.passageiros = passageiros;
    }

    public void addPassageiro(Passageiro passageiro){
        //adiciona um por vez e verifica
        //se for menor q o numero de vagas pode add

        if(this.passageiros.size() < vagas){
            this.passageiros.add(passageiro);
    }
        else{
            System.out.println("Limite de vagas excedido!");
        }
}
}
