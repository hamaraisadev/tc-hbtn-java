import exceptions.*;

public class ContaBancariaControlada extends ContaBancariaBasica {

    public double saldoMinimo;
    public double valorPenalidade;



    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        super.aplicarAtualizacaoMensal();
        if (saldo < saldoMinimo || saldo == 0 ){
            saldo = saldo - valorPenalidade;
        }

    }
}
