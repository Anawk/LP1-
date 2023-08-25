import java.util.ArrayList;
import java.util.List;

public class Corretora {

    List<Acao> ordemCompra = new ArrayList<>();
    List<Acao> ordemVenda = new ArrayList<>();

    public void adicionarOrdemCompra(Acao acao){
         ordemCompra.add(acao);
    }

    public void adicionarOrdemVena(Acao acao){
        ordemVenda.add(acao);
    }

    public void processarOrdens (){
        for (Acao acao : ordemCompra){
           //verificar condições e efetuar a compra
        }

        for (Acao acao : ordemVenda){
            //verificar condições e efetuar a venda
        }
        ordemCompra.clear();
        ordemVenda.clear();;
    }



}
