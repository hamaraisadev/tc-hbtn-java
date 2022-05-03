

public class Quadrado {
    public static double area(double lado1) {
        if (lado1 < 0) {
            IllegalArgumentException erro = new IllegalArgumentException("Lado deve possuir valor positivo");
            throw erro;
        }
        return lado1*lado1;
    }
}