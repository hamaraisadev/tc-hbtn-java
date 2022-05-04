

public class Gerente extends Empregado {


    public Gerente(double salarioFIxo) {
        super(salarioFIxo);
    }
    @Override
    public double calcularBonus(Departamento departamento) {
        if(departamento.alcancouMeta()){
            return (salarioFixo * 0.20) + ((departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01);
        }else
            return 0;

    }
}
