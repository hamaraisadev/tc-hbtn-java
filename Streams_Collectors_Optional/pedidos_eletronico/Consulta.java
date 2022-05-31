import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {



    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

        return pedido.getProdutos().stream().filter(t -> t.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

    }


    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream().sorted(Comparator.comparing(Produto::getPreco).reversed()).findFirst().orElse(null);

    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo) {

        return produtos.stream().filter(p -> p.getPreco() >= precoMinimo).collect(Collectors.toList());
    }


    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedido) {

        return pedido.stream().filter(
                        p -> p.getProdutos().stream().anyMatch(t -> t.getCategoria().equals(CategoriaProduto.ELETRONICO)))
                .collect(Collectors.toList());
    }

}