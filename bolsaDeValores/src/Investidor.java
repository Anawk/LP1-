import java.util.ArrayList;
import java.util.List;
import java.lang.String;


public class Investidor {
    private String nome;
    private String CPF;
    private double dinheiroInvestido;
    private List<Ativo> ativos = new ArrayList<>();

    public Investidor(String nome, String CPF, double dinheiroInvestido) {
        this.nome = nome;
        this.CPF = CPF;
        this.dinheiroInvestido = dinheiroInvestido;
    }

    public void comprarAtivo(Ativo ativo){
        ativos.add(ativo);
        dinheiroInvestido -= ativo.valorAtual;
    }

    public void venderAtivo(Ativo ativo){
        ativos.remove(ativo);
        dinheiroInvestido += ativo.valorAtual;
    }
}
