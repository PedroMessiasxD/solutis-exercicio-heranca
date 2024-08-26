package br.com.solutis.exercicio.quatro;

public class TesteAdministrador {

    public static void main(String[] args) {
        Administrador administrador1 = new Administrador("Lucas", "Rua das Árvores, 567", "321654987", 5, 4000.0, 0.12, 800.0);

        System.out.println("Administrador 1:");
        System.out.println(administrador1.toString());

        System.out.println("Salário líquido de Administrador 1: " + administrador1.calcularSalarioLiquido());

        System.out.println("Ajuda de custo de Administrador 1: " + administrador1.getAjudaDeCusto());

        administrador1.setAjudaDeCusto(1000.0);

        System.out.println("\nAdministrador 1 Atualizado:");
        System.out.println(administrador1.toString());

        System.out.println("Novo salário líquido de Administrador 1: " + administrador1.calcularSalarioLiquido());

        Administrador administrador2 = new Administrador();

        administrador2.setNome("Fernanda");
        administrador2.setEndereco("Avenida das Nações, 890");
        administrador2.setTelefone("654321987");
        administrador2.setCodigoSetor(10);
        administrador2.setSalarioBase(4500.0);
        administrador2.setImposto(0.10);
        administrador2.setAjudaDeCusto(500.0);

        System.out.println("\nAdministrador 2:");
        System.out.println(administrador2.toString());

        System.out.println("Salário líquido de Administrador 2: " + administrador2.calcularSalarioLiquido());


        Administrador administrador3 = new Administrador(300.0);


        administrador3.setNome("Carlos");
        administrador3.setEndereco("Rua Central, 123");
        administrador3.setTelefone("987654321");
        administrador3.setCodigoSetor(7);
        administrador3.setSalarioBase(5000.0);
        administrador3.setImposto(0.15);

        System.out.println("\nAdministrador 3:");
        System.out.println(administrador3.toString());

        System.out.println("Salário líquido de Administrador 3: " + administrador3.calcularSalarioLiquido());
    }



}
