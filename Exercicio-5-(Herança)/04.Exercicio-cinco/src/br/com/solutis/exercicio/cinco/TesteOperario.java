package br.com.solutis.exercicio.cinco;

public class TesteOperario {
    public static void main(String[] args) {
        Operario operario1 = new Operario("João Silva", "Rua das Flores, 789", "2222-3333", 2, 2500.0, 0.10, 5000.0, 0.05);

        // Testar os métodos getters
        System.out.println("Operário 1:");
        System.out.println("Nome: " + operario1.getNome());
        System.out.println("Endereço: " + operario1.getEndereco());
        System.out.println("Telefone: " + operario1.getTelefone());
        System.out.println("Código Setor: " + operario1.getCodigoSetor());
        System.out.println("Salário Base: " + operario1.getSalarioBase());
        System.out.println("Imposto: " + operario1.getImposto());
        System.out.println("Valor Produção: " + operario1.getValorProducao());
        System.out.println("Comissão: " + operario1.getComissao());


        System.out.println("Salário Líquido: " + operario1.calcularSalarioLiquido());

        System.out.println("Representação do Operário 1: " + operario1.toString());
    }

}
