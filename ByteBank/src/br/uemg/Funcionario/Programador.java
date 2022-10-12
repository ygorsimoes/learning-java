package br.uemg.Funcionario;

import br.uemg.Conta.Titular;

public class Programador extends Funcionario {
    public Programador(Titular titular, int agencia, int numeroConta) {
        super(titular, "Programador", 5000, agencia, numeroConta);
    }
}
