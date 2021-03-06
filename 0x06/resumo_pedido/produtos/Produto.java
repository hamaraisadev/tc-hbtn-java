package produtos;

public abstract class Produto {

    public String titulo;
    public int ano;
    public String pais;
    public double precoBruto;


    public abstract double obterPrecoLiquido();

    public Produto(String titulo, int ano, String pais, double precoBruto) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruto = precoBruto;
    }

    public double getPrecoBruto() {
        return precoBruto;
    }
}

