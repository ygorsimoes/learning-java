package br.uemg.Funcionario;

import br.uemg.Conta.ContaCorrente;
import br.uemg.Conta.Titular;

public abstract class Funcionario extends ContaCorrente {
    private final String cargo;
    private final double salario;
    private double bonificacao;


    public Funcionario(Titular titular, String cargo, double salario,  int agencia, int numeroConta) {
        super(titular, agencia, numeroConta);
        this.salario = salario;
        this.cargo = cargo;
    }

    public String FichaFuncionario() {
        return exibirExtrato() +
                "\nCargo: " + cargo +
                "\nSalário: " + salario +
                "\nBonificação: " + bonificacao * 100 + "%";
    }

    public void receberSalario() {
        // Recebe o salário com a bonificação
        this.depositar(this.salario + (this.salario * this.bonificacao));
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
