package provedores;

public class Frete {

    public double valor;
    public TipoProvedorFrete tipoProvedorFrete;

    public Frete(TipoProvedorFrete tipoProvedorFrete, double valor) {
        this.valor = valor;
        this.tipoProvedorFrete = tipoProvedorFrete;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTipoProvedorFrete(TipoProvedorFrete tipoProvedorFrete) {
        this.tipoProvedorFrete = tipoProvedorFrete;
    }

    public double getValor() {
        return valor;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }
}
