import exceptions.*;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    public int quantidadeTransacoes;

        public ContaBancariaTarifada(String numeracao, double taxaJurosAnual){
            super(numeracao, taxaJurosAnual);
            this.quantidadeTransacoes = quantidadeTransacoes;
        }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        if(valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        }
        if (saldo < valor) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        saldo = (saldo - valor) - 0.10;


    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    @Override
    public int depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        } else {
            saldo = (saldo + valor) - 0.10;
        }
        return 0;
    }
}






