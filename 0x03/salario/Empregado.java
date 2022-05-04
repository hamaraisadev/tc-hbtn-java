

public class Empregado {
    double salarioFixo;


    public double getSalarioFixo() {

        return salarioFixo;
    }
    public Empregado(double salarioFixo)
    {

        this.salarioFixo = salarioFixo;
    }
    public double calcularBonus(Departamento departamento)
    {
        if (departamento.alcancouMeta()) {
            return salarioFixo * 0.10;
        }else
            return 0;
    }

    public double calcularSalarioTotal(Departamento departamento){
        return this.salarioFixo + this.calcularBonus(departamento);
    }
}

