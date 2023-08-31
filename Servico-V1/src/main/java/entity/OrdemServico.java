package entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ordemservico")

public class OrdemServico {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prestadorid")
    private Prestador prestador;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Servico_OrdemServico", joinColumns = @JoinColumn(name = "ordemServicoid"), inverseJoinColumns = @JoinColumn(name = "servicoid"))
    private List<Servico> servicos;

    @Column
    private String data;

    @Column
    private String empresa;

    @Column
    private Double valor;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clienteid")
    private Cliente cliente;


    public OrdemServico(String data, String empresa) {
        this.data = data;
        this.empresa = empresa;
        this.servicos = new ArrayList<>();
        this.valor = 0.0;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void adicionarServico(Servico servico){
        servicos.add(servico);
    }

    public double calcularvalortotal(){
        double valor = 0.0;
        for (Servico servico : servicos){
            valor += servico.getPreco();

        }
        return valor;
    }

    public void exibirServicos(){
        System.out.println("------ORDEM DE SERVIÇO------");
        for(Servico servico : servicos){
            System.out.println("Id do serviço:" + servico.getId());
            System.out.println("Tipo do serviço: " + servico.getTipo());
            System.out.println("Preço do serviço: " + servico.getPreco());
            System.out.println("Prestador do servico: " + prestador);
            System.out.println("--------------------------------------------------------------------------------------------");
        }

        System.out.println("valor da ordem de serviço: " + calcularvalortotal());
    }

    @Override
    public String toString() {
        return "OrdemServico{" +
                "id=" + id +
                ", prestador=" + prestador +
                ", servicos=" + servicos +
                ", data='" + data + '\'' +
                ", empresa='" + empresa + '\'' +
                ", valor=" + valor +
                ", cliente=" + cliente +
                '}';
    }
}
