package br.uemg.Conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(Titular titular, int agencia, int numeroConta) {
        super(titular, agencia, numeroConta, "CC", 0.05);
    }

    public ContaCorrente() {
        super("CC", 0.05);
    }
}