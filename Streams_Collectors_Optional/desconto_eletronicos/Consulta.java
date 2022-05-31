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

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos.stream().map(produto -> {
            if (produto.getCategoria().equals(CategoriaProduto.ELETRONICO))
                produto.setPreco(produto.getPreco() - produto.getPreco() * 0.15);
            return produto;
        }).collect(Collectors.toList());
    }


}
