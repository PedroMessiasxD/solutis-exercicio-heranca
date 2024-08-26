package br.com.solutis.exercicio.dois;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor("João", "Rua das Flores, 123", "123456789", 5000.0, 2000.0);


        System.out.println("Fornecedor 1:");
        System.out.println(fornecedor1);

        System.out.println("Valor do crédito de Fornecedor 1: " + fornecedor1.getValorCredito());

        System.out.println("Valor da dívida de Fornecedor 1: " + fornecedor1.getValorDivida());

        System.out.println("Saldo de Fornecedor 1: " + fornecedor1.obterSaldo());

        fornecedor1.setValorCredito(6000.0);
        fornecedor1.setValorDivida(2500.0);


        System.out.println("\nFornecedor 1 Atualizado:");
        System.out.println(fornecedor1);

        Fornecedor fornecedor2 = new Fornecedor();

        fornecedor2.setNome("Maria");
        fornecedor2.setEndereco("Avenida Central, 456");
        fornecedor2.setTelefone("987654321");
        fornecedor2.setValorCredito(3000.0);
        fornecedor2.setValorDivida(1500.0);

        System.out.println("\nFornecedor 2:");
        System.out.println(fornecedor2);

        System.out.println("Valor do crédito de Fornecedor 2: " + fornecedor2.getValorCredito());
        System.out.println("Valor da dívida de Fornecedor 2: " + fornecedor2.getValorDivida());
        System.out.println("Saldo de Fornecedor 2: " + fornecedor2.obterSaldo());
    }

}
