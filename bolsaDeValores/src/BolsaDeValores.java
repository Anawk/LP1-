public class BolsaDeValores {
    public static void main(String[] args) {
        Investidor investidor1 = new Investidor("Ana Maria","44620198471",10000);
        Investidor investidor2 = new Investidor("Gabriel Luna","44620100471",20000);

        Acao acaoApple = new Acao("AAPL", 150, 155);

        FundoImobiliario fundoImobiliario = new FundoImobiliario("FI333", 50);

        investidor1.comprarAtivo(acaoApple);
        investidor2.comprarAtivo(fundoImobiliario);

        Corretora corretora = new Corretora();
        corretora.adicionarOrdemCompra(acaoApple);
           corretora.processarOrdens();
           

    }
}
