package br.com.solutis.exercicio.dois;

import br.com.solutis.exercicio.um.Pessoa;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(){
    }
    public double obterSaldo(){
        return valorCredito - valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", saldo=" + obterSaldo() +
                ", valorCredito=" + valorCredito +
                ", valorDivida=" + valorDivida +
                '}';
    }
}

