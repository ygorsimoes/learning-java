package br.uemg;

import br.uemg.Conta.Titular;
import br.uemg.Funcionario.Gerente;
import br.uemg.Funcionario.Programador;

public class Main {
    public static void main(String[] args) {
        Gerente marcioGerente = new Gerente(new Titular("Marcio", "123.456.789-00"), 123, 12345);
        Programador gibsonProgramador = new Programador(new Titular("Gibson", "987.654.321-00"), 123, 12345);

        marcioGerente.setBonificacao(0.1);
        gibsonProgramador.setBonificacao(0.05);

        marcioGerente.receberSalario();
        gibsonProgramador.receberSalario();

        System.out.println(marcioGerente.FichaFuncionario());
        System.out.println(gibsonProgramador.FichaFuncionario());

        marcioGerente.transferir(100, gibsonProgramador);
        marcioGerente.transferir(100, gibsonProgramador);

        System.out.println(marcioGerente.FichaFuncionario());
        System.out.println(gibsonProgramador.FichaFuncionario());

    }
}
