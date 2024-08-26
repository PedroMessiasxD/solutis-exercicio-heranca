package br.com.solutis.exercicio.cinco;

public class TesteOperario {
    public static void main(String[] args) {

        Operario operario1 = new Operario("Carlos", "Rua das Flores, 234", "987654321", 8, 3500.0, 0.08, 1200.0, 0.05);

        System.out.println("Operário 1:");
        System.out.println(operario1.toString());

        System.out.println("Salário líquido de Operário 1: " + operario1.calcularSalarioLiquido());

        System.out.println("Valor de Produção de Operário 1: " + operario1.getValorProducao());

        System.out.println("Comissão de Operário 1: " + operario1.getComissao());

        operario1.setValorProducao(1500.0);
        operario1.setComissao(0.07);

        System.out.println("\nOperário 1 Atualizado:");
        System.out.println(operario1.toString());

        System.out.println("Novo salário líquido de Operário 1: " + operario1.calcularSalarioLiquido());

        Operario operario2 = new Operario();

        operario2.setNome("Ana");
        operario2.setEndereco("Avenida Principal, 456");
        operario2.setTelefone("123456789");
        operario2.setCodigoSetor(3);
        operario2.setSalarioBase(4000.0);
        operario2.setImposto(0.10);
        operario2.setValorProducao(2000.0);
        operario2.setComissao(0.06);

        System.out.println("\nOperário 2:");
        System.out.println(operario2.toString());

        System.out.println("Salário líquido de Operário 2: " + operario2.calcularSalarioLiquido());
    }

}
