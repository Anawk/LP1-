

public class Lazer extends Gastos{

    private boolean importancia;

    public Lazer(String nome, double valor, boolean importancia) {
        super(nome, valor);
        this.importancia = importancia;
    }

    @Override
    public void mudarValor(double valor){

    }
}

