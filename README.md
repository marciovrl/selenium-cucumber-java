# example-selenium-java

Selenium e2e test example in Java.

# Preconditions:

- Java installed and configured;
- Maven installed and configured;
- Chromedriver installed and configured.

# Starting project from scratch.

- Create maven project structure:

```
mvn archetype:generate
```

- Search for required dependencies for your tests at [mvnrepository](https://mvnrepository.com/) and insert them into `pom.xml`.

- Install dependencies:

```
mvn install
```

- Run tests:

```
mvn clean test
```

# Using project as an example.

- First clone project:

```
https://github.com/marciovrl/example-selenium-java.git
```

- Second install dependencies:

```
mvn install
```

- Run tests:

```
mvn clean -Dtest=CucumberRunner test
```

- allure serve

```
allure serve allure-results/
```
