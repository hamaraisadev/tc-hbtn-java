

public class Dvd extends Produto {
    public String diretor;
    public String genero;
    public int duracao;

    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
        super(titulo, ano, pais, precoBruto);
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }

    @Override
    public double obterPrecoLiquido() {
        double precoLiquido = getPrecoBruto() + (getPrecoBruto() * 0.20);
        return precoLiquido;
    }
}
