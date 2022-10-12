package br.uemg.Funcionario;

import br.uemg.Conta.Titular;

public class Gerente extends Funcionario {
    public Gerente(Titular titular, int agencia, int numeroConta) {
        super(titular, "Gerente", 10000, agencia, numeroConta);
    }
}
