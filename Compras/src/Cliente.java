import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<CarrinhoDeCompras> carrinhos = new ArrayList<>();

    public Cliente(String nome, ArrayList<CarrinhoDeCompras> carrinhos) {
        this.nome=nome;
        this.carrinhos= carrinhos;
    }



}
