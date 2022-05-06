

public class Livro extends Produto {
    public int paginas;
    public String autor;
    public int edicao;

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        super(titulo, ano, pais, precoBruto);
    }


    @Override
    public double obterPrecoLiquido() {
        double precoLiquido = getPrecoBruto() + (getPrecoBruto() * 0.15);
        return precoLiquido;


    }


}
