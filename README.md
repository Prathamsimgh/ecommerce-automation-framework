# Ecommerce Automation Framework

This repository contains an automated testing framework for ecommerce platform testing, built with Java, TestNG, and Maven.

## Project Structure

- `src/test/java/com/ecommerce/tests/smoke/SanityCheckTest.java`: Smoke tests for sanity checks
- `src/test/resources/test_suites/regression_tests.xml`: TestNG suite configuration for regression tests
- `pom.xml`: Maven project configuration
- `.gitignore`: Git ignore rules for Maven and IDE files

## Prerequisites

- Java 8 or higher
- Maven 3.x

## How to Run

1. Clone the repository
2. Navigate to the project directory
3. Run the tests:

```bash
mvn clean test
```

## Test Suites

- **Smoke Tests**: Quick sanity checks using `SanityCheckTest.java`
- **Regression Tests**: Comprehensive test suite via `regression_tests.xml`

## Configuration

Tests are organized using TestNG XML configurations in `src/test/resources/test_suites/`.

## Reporting

Test reports are generated automatically after test execution, integrating with frameworks like Allure for enhanced reporting.
