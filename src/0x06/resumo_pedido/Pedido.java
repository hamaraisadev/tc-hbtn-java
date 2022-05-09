import produtos.Livro;

public class Pedido {
    public double percentualDesconto;
    public ItemPedido[] itens;


    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double valorTotal = 0;

        for (int i = 0; i < itens.length; i++) {

            valorTotal = valorTotal + (itens[i].produto.obterPrecoLiquido() * itens[i].getQuantidade());


        }

        valorTotal = valorTotal - ((this.percentualDesconto / 100) * valorTotal);

        return valorTotal;


    }
    public void apresentarResumoPedido() {
        double total = 0;
        System.out.println("------- RESUMO PEDIDO -------");

        for (int i = 0; i < itens.length; i++) {
            if (itens[i].getProduto() instanceof Livro) {
                System.out.printf("Tipo: Livro  ");
            } else {
                System.out.printf("Tipo: Dvd  ");
            }
            System.out.printf("Titulo: "  + itens[i].getProduto().titulo + "  ");
            System.out.printf("Preco: %.2f"  , itens[i].getProduto().obterPrecoLiquido() );
            System.out.printf("  Quant: " + itens[i].getQuantidade() + "  ");
            System.out.printf("Total: %.2f" , itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade());
            System.out.println("");
            total = total + itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade();
        }
        System.out.println("----------------------------");

        System.out.printf("DESCONTO: %.2f" , total * percentualDesconto / 100);
        System.out.println("");
        System.out.printf("TOTAL PRODUTOS: %.2f" , total);
        System.out.println("");
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f", total - total * percentualDesconto / 100 );
        System.out.println("\n----------------------------");
    }
}


