import exceptions.*;



public class ContaBancariaBasica {

    public String numeracao;
    public double saldo;
    public double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException{
        if(valor < 0){
            throw new OperacaoInvalidaException("Valor para depositar deve ser maior que 0");
        }else {
            saldo = saldo + valor;
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if(valor <= 0) {
            throw new OperacaoInvalidaException("valor de saque deve ser menor que 0");
        }
        if (saldo < valor) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        saldo = saldo - valor;
    }

    public double calcularTarifaMensal(){
        double tarifaFixa = 10.00;
        double resultCalculoPorcentagem = (saldo * 0.10);
        double tarifaMensal = 0;
        if(tarifaFixa < resultCalculoPorcentagem){
            tarifaMensal = tarifaFixa;
        }else {
            tarifaMensal = resultCalculoPorcentagem;
        }
        return tarifaMensal;
    }

    public double calcularJurosMensal(){
        double jurosMensal = 0;

        if(getSaldo() > 0){
            jurosMensal = getSaldo() * ((getTaxaJurosAnual() / 12) / 100);
        }
        return jurosMensal;
    }

    public void aplicarAtualizacaoMensal(){
        double juros = calcularJurosMensal();
        double tarifa = calcularTarifaMensal();

        saldo = saldo - tarifa;
        saldo = saldo + juros;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}
