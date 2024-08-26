package br.com.solutis.exercicio.tres;

public class TesteEmpregado {
    public static void main(String[] args) {
        // Criar um objeto Empregado
        Empregado empregado1 = new Empregado("Pedro Messias", "Rua B, 456", "9876-5432", 10, 3000.0, 0.15);

        System.out.println("Empregado 1:");
        System.out.println("Nome: " + empregado1.getNome());
        System.out.println("Endereço: " + empregado1.getEndereco());
        System.out.println("Telefone: " + empregado1.getTelefone());
        System.out.println("Código Setor: " + empregado1.getCodigoSetor());
        System.out.println("Salário Base: " + empregado1.getSalarioBase());
        System.out.println("Imposto: " + empregado1.getImposto());

        System.out.println("Salário Líquido: " + empregado1.calcularSalarioLiquido());


        System.out.println("Representação do Empregado 1: " + empregado1.toString());
    }
}
