package br.com.solutis.exercicio.quatro;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador admin1 = new Administrador("Ana Souza", "Avenida Central, 123", "1111-2222", 5, 5000.0, 0.12, 800.0);


        System.out.println("Administrador 1:");
        System.out.println("Nome: " + admin1.getNome());
        System.out.println("Endereço: " + admin1.getEndereco());
        System.out.println("Telefone: " + admin1.getTelefone());
        System.out.println("Código Setor: " + admin1.getCodigoSetor());
        System.out.println("Salário Base: " + admin1.getSalarioBase());
        System.out.println("Imposto: " + admin1.getImposto());
        System.out.println("Ajuda de Custo: " + admin1.getAjudaDeCusto());


        System.out.println("Salário Líquido: " + admin1.calcularSalarioLiquido());

        // Testar o método toString
        System.out.println("Representação do Administrador 1: " + admin1.toString());
    }



}
