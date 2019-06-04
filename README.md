# example-selenium-java
Design with simple automated test structure e2e

# Pré-condições:
- Java instalado e configurado;
- Maven instalado e configurado;
- Chromedriver instaladoe  configurado.

# Começando projeto do zero.
- Criar estrutura do projeto maven:
```
mvn archetype:generate
```

- Procurar dependencias necessaŕios para o seus testes em https://mvnrepository.com/ e inserir no `pom.xml`.

- Instalar a dependencias:
```
mvn install
```

- Rodar testes:
```
mvn clean test
```

# Utilizando projeto como exemplo.
- Primeiro clonar projeto:
```
https://github.com/marciovrl/example-selenium-java.git
```

- Segundo instalar a dependencias:
```
mvn install
```

- Rodar testes:
```
mvn clean -Dtest=CucumberRunner test
```

# Estrutura do projeto:

```
|
| - src
    | - test
        | - java
        | - resources
| - .gitignore
| - pom.xml
| - README.md 
```