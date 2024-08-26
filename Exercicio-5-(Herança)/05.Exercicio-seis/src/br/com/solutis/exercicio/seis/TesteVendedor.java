package br.com.solutis.exercicio.seis;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Ana Costa", "Rua das Palmeiras, 101", "3333-4444", 5, 3000.0, 0.12, 8000.0, 0.07);


        System.out.println("Vendedor 1:");
        System.out.println("Nome: " + vendedor1.getNome());
        System.out.println("Endereço: " + vendedor1.getEndereco());
        System.out.println("Telefone: " + vendedor1.getTelefone());
        System.out.println("Código Setor: " + vendedor1.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor1.getSalarioBase());
        System.out.println("Imposto: " + vendedor1.getImposto());
        System.out.println("Valor Vendas: " + vendedor1.getValorVendas());
        System.out.println("Comissão: " + vendedor1.getComissao());


        System.out.println("Salário Líquido: " + vendedor1.calcularSalarioLiquido());


        System.out.println("Representação do Vendedor 1: " + vendedor1.toString());


    }
}
