package br.com.solutis.exercicio.dois;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor("João da Silva", "Rua A, 123", "1234-5678", 1000.0, 200.0);

        System.out.println("Fornecedor 1:");
        System.out.println("Nome: " + fornecedor1.getNome());
        System.out.println("Endereço: " + fornecedor1.getEndereco());
        System.out.println("Telefone: " + fornecedor1.getTelefone());
        System.out.println("Valor Crédito: " + fornecedor1.getValorCredito());
        System.out.println("Valor Dívida: " + fornecedor1.getValorDivida());


        System.out.println("Saldo: " + fornecedor1.obterSaldo());


        System.out.println("Representação do Fornecedor 1: " + fornecedor1.toString());

    }
}
