package br.uemg.Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Titular titular, int agencia, int numeroConta) {
        super(titular, agencia, numeroConta, "CP", 0.01);
    }

    public ContaPoupanca() {
        super("CP", 0.01);
    }
}
