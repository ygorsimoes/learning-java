package br.uemg.Conta;

public abstract class Conta {
    private Titular titular;
    private double saldo;
    private int agencia;
    private int numeroConta;
    private final String tipoConta;
    private double taxaDeOperacao;

    public Conta(Titular titular, int agencia, int numeroConta, String tipoConta, double taxaDeOperacao) {
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.setTaxaDeOperacao(taxaDeOperacao);
        this.tipoConta = tipoConta;
    }

    public Conta(String tipoConta, double taxaDeOperacao) {
        this.tipoConta = tipoConta;
        this.setTaxaDeOperacao(taxaDeOperacao);
    }

    public String exibirExtrato() {
        return "\nTitular: " + this.titular.getNome() +
                "\nCPF: " + this.titular.getCpf() +
                "\nSaldo: R$" + this.saldo +
                "\nAgencia: " + this.agencia +
                "\nNumero da Conta: " + this.numeroConta +
                "\nTipo da Conta: " + getTipoConta(this.tipoConta) +
                "\nTaxa de Operação: " + this.taxaDeOperacao;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo && valor > 0) {
            // Subtrai o valor do saldo com a porcentagem da taxa de operação
            this.saldo -= valor - (valor * this.taxaDeOperacao);
        } else {
            throw new IllegalArgumentException("Valor de saque inválido.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            // Adiciona o valor do saldo subtraindo com a porcentagem da taxa de operação
            this.saldo += valor - (valor * this.taxaDeOperacao);
        } else {
            throw new IllegalArgumentException("Valor de depósito inválido.");
        }
    }

    public void transferir(int valor, Conta contaDestino) {
        if (valor <= this.saldo && valor > 0) {
            // Subtrai o valor do saldo com a porcentagem da taxa de operação
            this.saldo -= valor - (valor * this.taxaDeOperacao);
            // Adiciona o valor do saldo na conta destino subtraindo com a porcentagem da taxa de operação
            contaDestino.saldo += valor - (valor * contaDestino.taxaDeOperacao);
        } else {
            throw new IllegalArgumentException("Valor de transferência inválido.");
        }
    }

    private String getTipoConta(String tipoContaInformada) {
        if (tipoContaInformada.equals("CC")) {
            return "Conta Corrente";
        } else if (tipoContaInformada.equals("CP")) {
            return "Conta Poupança";
        } else {
            throw new IllegalArgumentException("Tipo de conta inválido.");
        }
    }

    private void setTaxaDeOperacao(double taxa) {
        if (taxa > 0) {
            this.taxaDeOperacao = taxa;
        } else {
            throw new IllegalArgumentException("Taxa de operação inválida.");
        }
    }
}