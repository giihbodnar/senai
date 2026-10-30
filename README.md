[Português](README.md) | [English](README.en.md)

# Automação de testes com Selenium — SENAI

Repositório de exercícios de automação de testes de interface desenvolvidos em Java durante estudos no SENAI.

## Tecnologias

- Java
- Selenium WebDriver 3.141.59
- JUnit 4.12
- Apache Maven
- Google Chrome e ChromeDriver

## Testes presentes

- `src/test/java/testeEcommerce/Cadastro.java`: navega por uma aplicação local em `http://localhost:4200/`, abre login e cadastro e preenche campos de usuário e senha.
- `src/test/java/testsFront/PageHome.java`: navega pelo site `https://online.sp.senai.br/` e realiza cliques em elementos da página.

## Estrutura

```text
pom.xml
src/
  test/
    java/
      testeEcommerce/Cadastro.java
      testsFront/PageHome.java
```

## Pré-requisitos e execução

É necessário ter Java, Maven, Google Chrome e um ChromeDriver compatível. Os testes usam a variável de ambiente `Driver` como caminho para o executável do ChromeDriver. O teste de cadastro também exige que a aplicação correspondente esteja disponível em `http://localhost:4200/`.

Com o ambiente configurado, os testes podem ser executados por meio de `mvn test`. **A execução não foi validada nesta reorganização.** Como os testes dependem de versões antigas de bibliotecas, seletores de páginas externas e uma aplicação local, ajustes podem ser necessários.

## Sobre a organização

Os códigos Java e o `pom.xml` originais foram preservados. Arquivos compilados e configurações locais de IDE foram retirados da versão atual do repositório; o `.gitignore` evita novos envios acidentais desses arquivos.
