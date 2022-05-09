package resumo_pedido;


import resumo_pedido.produtos.Produto;

public class ItemPedido {

    public int quantidade;
    public Produto produto;


    public ItemPedido(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto() {
        this.produto = produto;
    }

}
