

public class Departamento {

    double valorMeta;
    double valorAtingidoMeta;

    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    public Departamento(double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;

    }

    public boolean alcancouMeta(){
                if (valorMeta - valorAtingidoMeta > 0){
                    return false;
                }else
                    return true;
    }
}


