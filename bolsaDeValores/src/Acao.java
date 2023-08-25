public class Acao extends Ativo{
    private double valorAbertura;
    private double valorFechameto;

    public Acao(String ticker, double valorAtual, double valorAbertura) {
        super(ticker, valorAtual);
        this.valorAbertura = valorAbertura;
    }

//    public Acao(String ticker, double valorAtual) {
//        super(ticker, valorAtual);
//    }


}
