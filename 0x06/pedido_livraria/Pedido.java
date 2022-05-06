package pedido_livraria;

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
}




