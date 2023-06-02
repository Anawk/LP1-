 public class main {
        public static void main(String[] args) {
            CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

            Produto p1 = new Produto("Camiseta", 29.99);
            Produto p2 = new Produto("Calça jeans", 79.99);
            Produto p3 = new Produto("Tênis", 99.99);

            carrinho.adicionarItem(p1);
            carrinho.adicionarItem(p2);
            carrinho.adicionarItem(p3);

            carrinho.imprimirItens();

            System.out.println("Total: R$" + carrinho.calcularTotal());

            carrinho.removerItem(p2);

            carrinho.imprimirItens();


            System.out.println("Total: R$" + carrinho.calcularTotal());
        }
    }

