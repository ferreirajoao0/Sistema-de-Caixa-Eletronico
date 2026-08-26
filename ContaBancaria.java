package sistemacaixaeletronico;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
    public boolean depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }
    public boolean sacar(double valor) {
        if(valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
