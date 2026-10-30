[Português](README.md) | [English](README.en.md)

# Selenium Test Automation — SENAI

A collection of Java browser UI test automation exercises created during SENAI studies.

## Technologies

- Java
- Selenium WebDriver 3.141.59
- JUnit 4.12
- Apache Maven
- Google Chrome and ChromeDriver

## Included tests

- `src/test/java/testeEcommerce/Cadastro.java`: opens a local application at `http://localhost:4200/`, navigates through login and registration, and fills in username and password fields.
- `src/test/java/testsFront/PageHome.java`: visits `https://online.sp.senai.br/` and clicks selected page elements.

## Project structure

```text
pom.xml
src/
  test/
    java/
      testeEcommerce/Cadastro.java
      testsFront/PageHome.java
```

## Requirements and running

Java, Maven, Google Chrome, and a compatible ChromeDriver are required. The tests read the ChromeDriver executable path from the `Driver` environment variable. The registration test also requires the related application to be running at `http://localhost:4200/`.

With the environment configured, tests may be run using `mvn test`. **The tests were not executed or validated as part of this repository cleanup.** The older dependencies, external page selectors, and local application may require changes.

## Repository cleanup

The original Java source files and `pom.xml` were preserved unchanged. Compiled artifacts and local IDE configuration files were removed from the current repository tree, and a `.gitignore` was added.
