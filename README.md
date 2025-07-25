﻿# Calculadora com Testes Unitários - JUnit

**Aluno:** Igor Anjos  
**Faculdade:** PUC Goiás  
**Matéria:** Projeto Integrador IV-A  
**Professor:** Alisson Alves

---

## 📋 Sobre o Projeto

Este projeto consiste em uma calculadora simples desenvolvida em Java com foco na implementação de **testes unitários**
utilizando o framework **JUnit 5**. O projeto foi desenvolvido no **IntelliJ IDEA** e demonstra boas práticas de
desenvolvimento orientado a testes (TDD).

## 🎯 Objetivos

- Implementar uma calculadora com operações básicas
- Desenvolver testes unitários abrangentes
- Garantir cobertura de cenários positivos, negativos e casos extremos

## 🛠️ Tecnologias Utilizadas

- **Java** - Linguagem de programação
- **JUnit 5** - Framework de testes unitários
- **IntelliJ IDEA** - IDE de desenvolvimento
- **Maven** - Gerenciamento de dependências

## 📁 Estrutura do Projeto

```text
src/
├── main/java/Calculadora/
│   └── Calculadora.java
└── test/java/Calculadora/
    └── CalculadoraTest.java
```

## 🧮 Funcionalidades da Calculadora

A classe `Calculadora` implementa quatro operações básicas:

### Métodos Disponíveis

| Método                            | Descrição                                               | Tratamento de Exceções                       |
|-----------------------------------|---------------------------------------------------------|----------------------------------------------|
| `somar(double a, double b)`       | Realiza soma de dois números                            | -                                            |
| `subtrair(double a, double b)`    | Realiza subtração de dois números                       | -                                            |
| `multiplicar(double a, double b)` | Realiza multiplicação com tratamento especial para zero | Retorna 0 se algum operando for 0            |
| `dividir(double a, double b)`     | Realiza divisão com validação                           | Lança `ArithmeticException` se divisor for 0 |

## 🧪 Estratégia de Testes
![image](https://github.com/user-attachments/assets/47f73879-9400-4c0e-8213-3e8d8fea9829)

### Cobertura de Cenários

Os testes foram desenvolvidos seguindo uma abordagem sistemática para garantir cobertura completa:

#### 1. **Testes de Soma**

- ✅ Números positivos
- ✅ Números negativos
- ✅ Combinação positivo/negativo

#### 2. **Testes de Subtração**

- ✅ Números positivos
- ✅ Números negativos
- ✅ Combinação positivo/negativo

#### 3. **Testes de Multiplicação**

- ✅ Números positivos
- ✅ Números negativos
- ✅ Combinação positivo/negativo
- ✅ Casos especiais com zero

#### 4. **Testes de Divisão**

- ✅ Números positivos
- ✅ Números negativos
- ✅ Combinação positivo/negativo
- ✅ **Teste de exceção** - Divisão por zero

### Metodologia de Teste

```java

@Test
public void deveSomarDoisNumerosPositivos() {
    // Arrange & Act & Assert
    Assertions.assertEquals(5, new Calculadora().somar(0, 5));
    Assertions.assertEquals(7, new Calculadora().somar(1, 6));
    // ... mais casos de teste
}
```

### Tratamento de Exceções

```java

@Test
public void deveLancarErroAoDividirPorZero() {
    Assertions.assertThrows(ArithmeticException.class, () -> {
        new Calculadora().dividir(1, 0);
    });
}
```

## 📊 Detalhes Técnicos dos Testes

### Padrão AAA (Arrange-Act-Assert)

- **Arrange:** Preparação dos dados de teste
- **Act:** Execução do método testado
- **Assert:** Verificação do resultado esperado

### Casos de Teste por Operação

| Operação      | Cenários Testados                     | Total de Assertions |
|---------------|---------------------------------------|---------------------|
| Soma          | Positivos, Negativos, Mistos          | 18                  |
| Subtração     | Positivos, Negativos, Mistos          | 18                  |
| Multiplicação | Positivos, Negativos, Mistos, Zero    | 18                  |
| Divisão       | Positivos, Negativos, Mistos, Exceção | 19                  |

### Observações Importantes

1. **Multiplicação por Zero:** Implementada lógica especial que retorna 0 quando qualquer operando é zero
2. **Divisão por Zero:** Tratamento adequado com lançamento de `ArithmeticException`
3. **Cobertura Abrangente:** Cada operação testada com múltiplos cenários
4. **Nomenclatura Descritiva:** Métodos de teste com nomes que explicam o comportamento esperado

## 🚀 Como Executar os Testes

### Via IntelliJ IDEA

1. Abra o projeto no IntelliJ
2. Navegue até `CalculadoraTest.java`
3. Clique com botão direito → "Run 'CalculadoraTest'"

### Via Maven (linha de comando)

```bash
mvn test
```

## 📈 Resultados Esperados

Todos os **14 métodos de teste** devem passar, validando:

- ✅ 73 assertions individuais
- ✅ Cobertura completa das operações básicas
- ✅ Tratamento adequado de casos extremos
- ✅ Validação de exceções

## 🎓 Aprendizados

Este projeto demonstra:

- Implementação de testes unitários eficazes
- Uso correto do framework JUnit 5
- Tratamento de exceções em Java
- Boas práticas de nomenclatura de testes
- Cobertura sistemática de cenários de teste

---

*Projeto desenvolvido como parte da disciplina de Projeto Integrador IV-A*
