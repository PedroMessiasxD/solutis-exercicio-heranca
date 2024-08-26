# Atividade de Herança em Java

Este documento descreve uma série de exercícios práticos sobre herança em Java, abordando o desenvolvimento e a implementação de várias classes e subclasses para entender e aplicar conceitos de programação orientada a objetos.

## Exercício 01: Classe `Pessoa`

### Descrição
Crie a classe `Pessoa` com os seguintes atributos:
- `nome` (String)
- `endereco` (String)
- `telefone` (String)

**Objetivo**: Implementar construtores, getters e setters para manipular os dados da pessoa.

### Requisitos
- Construtor padrão
- Construtor parametrizado
- Métodos de acesso (getters) e modificação (setters) para todos os atributos

---

## Exercício 02: Classe `Fornecedor`

### Descrição
Implemente a classe `Fornecedor`, que estende `Pessoa`, e adicione os seguintes atributos:
- `valorCredito` (double)
- `valorDivida` (double)

**Objetivo**: Adicionar um método para calcular o saldo do fornecedor com base nos valores de crédito e dívida.

### Requisitos
- Métodos de acesso e modificação para `valorCredito` e `valorDivida`
- Método `obterSaldo()` para calcular a diferença entre crédito e dívida

---

## Exercício 03: Classe `Empregado`

### Descrição
Crie a classe `Empregado`, que estende `Pessoa`, com os seguintes atributos:
- `codigoSetor` (int)
- `salarioBase` (double)
- `imposto` (double)

**Objetivo**: Implementar métodos para calcular o salário líquido do empregado, considerando a base salarial e o imposto.

### Requisitos
- Métodos de acesso e modificação para `codigoSetor`, `salarioBase` e `imposto`
- Método `calcularSalarioLiquido()` para calcular o salário após descontos de imposto

---

## Exercício 04: Classe `Administrador`

### Descrição
Implemente a classe `Administrador` como uma subclasse de `Empregado` e adicione o atributo:
- `ajudaDeCusto` (double)

**Objetivo**: Redefinir o método de cálculo de salário para incluir a ajuda de custo recebida pelo administrador.

### Requisitos
- Métodos de acesso e modificação para `ajudaDeCusto`
- Método `calcularSalarioLiquido()` ajustado para adicionar a ajuda de custo ao salário base

---

## Exercício 05: Classe `Operario`

### Descrição
Crie a classe `Operario` como uma subclasse de `Empregado`, adicionando os seguintes atributos:
- `valorProducao` (double)
- `comissao` (double)

**Objetivo**: Redefinir o cálculo do salário para incluir uma comissão baseada no valor da produção.

### Requisitos
- Métodos de acesso e modificação para `valorProducao` e `comissao`
- Método `calcularSalarioLiquido()` ajustado para considerar a comissão sobre a produção

---

## Exercício 06: Classe `Vendedor`

### Descrição
Implemente a classe `Vendedor` como uma subclasse de `Empregado` com os seguintes atributos:
- `valorVendas` (double)
- `comissao` (double)

**Objetivo**: Redefinir o cálculo do salário para incluir a comissão baseada no valor das vendas realizadas.

### Requisitos
- Métodos de acesso e modificação para `valorVendas` e `comissao`
- Método `calcularSalarioLiquido()` ajustado para considerar a comissão sobre as vendas

---

## Testes

Para cada classe, um programa de teste deve ser desenvolvido para verificar a correta implementação dos métodos e a funcionalidade geral das classes e subclasses. Assegure-se de que todos os métodos funcionem conforme o esperado e que o comportamento das classes esteja de acordo com os requisitos especificados.

---

## Conclusão

Esta atividade proporciona uma prática abrangente sobre herança e polimorfismo em Java, abordando desde a criação de classes base até a implementação de subclasses com funcionalidades especializadas.

Para mais informações, consulte a documentação do Java sobre herança e orientação a objetos.

---

**Autor**: [Pedro Messias de Lucena Maia]  
**Data**: [26/06/2024]

