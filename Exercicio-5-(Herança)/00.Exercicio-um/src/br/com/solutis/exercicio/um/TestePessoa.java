package br.com.solutis.exercicio.um;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João",  "Rua 1, 123", "85999999999");
        System.out.println(pessoa.toString());
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("José");
        pessoa1.setEndereco("Rua 2, 456");
        pessoa1.setTelefone("91999999999");
        System.out.println("\nAtualizado:");
        Pessoa pessoa2 = new Pessoa("Pedro","Bairro de nao sei aonde");
        System.out.println(pessoa2);
    }
}
