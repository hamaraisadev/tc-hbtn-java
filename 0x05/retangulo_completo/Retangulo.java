package retangulo_completo;

import retangulo.FormaGeometrica;

public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;


    public double getLargura()
    {
        return largura;
    }

    public void setLargura(double largura) {

        if(this.largura < 0){

            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }else
            this.largura = largura;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura) {
        if(this.altura < 0){
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }else
            this.altura = altura;
    }
    @Override
    public double area (){
        return this.altura * this.largura;

    }

    public String toString(){
        return "[Retangulo] " + this.largura + "0" + " / " + this.altura + "0";
    }

}


