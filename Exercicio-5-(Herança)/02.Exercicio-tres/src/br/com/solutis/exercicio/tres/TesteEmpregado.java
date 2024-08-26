package br.com.solutis.exercicio.tres;

public class TesteEmpregado {
    public static void main(String[] args) {
        // Criação de um objeto Empregado usando o construtor com parâmetros
        Empregado empregado1 = new Empregado("Ana", "Rua das Palmeiras, 789", "456789123", 10, 3000.0, 0.15);


        System.out.println("Empregado 1:");
        System.out.println(empregado1.toString());


        System.out.println("Salário líquido de Empregado 1: " + empregado1.calcularSalarioLiquido());


        System.out.println("Código do setor de Empregado 1: " + empregado1.getCodigoSetor());


        System.out.println("Salário base de Empregado 1: " + empregado1.getSalarioBase());


        System.out.println("Imposto de Empregado 1: " + empregado1.getImposto());


        empregado1.setCodigoSetor(20);
        empregado1.setSalarioBase(3500.0);
        empregado1.setImposto(0.20);


        System.out.println("\nEmpregado 1 Atualizado:");
        System.out.println(empregado1.toString());


        System.out.println("Novo salário líquido de Empregado 1: " + empregado1.calcularSalarioLiquido());


        Empregado empregado2 = new Empregado();


        empregado2.setNome("Carlos");
        empregado2.setEndereco("Avenida dos Trabalhadores, 321");
        empregado2.setTelefone("987654321");
        empregado2.setCodigoSetor(30);
        empregado2.setSalarioBase(4000.0);
        empregado2.setImposto(0.10);


        System.out.println("\nEmpregado 2:");
        System.out.println(empregado2.toString());


        System.out.println("Salário líquido de Empregado 2: " + empregado2.calcularSalarioLiquido());
    }
}
