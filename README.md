# 🧮 Calculator API – Spring Boot Project
## 📖 Description
This is a simple Calculator API built with Spring Boot as a learning project. The goal of this project is to practice and understand:

* ✅ Spring Boot basics

* ✅ Spring Beans & IoC (Inversion of Control)

* ✅ Dependency Injection

* ✅ Spring Data JPA with H2 Database

The application performs basic mathematical operations (add, subtract, multiply, divide) and stores calculation history using H2 in-memory database.

## ✨ Features

- ➕ Addition

- ➖ Subtraction

- ✖️ Multiplication

- ➗ Division

- 📜 View calculation history
  

## ⚙️ Installation / Setup
* Prerequisites

  * Java 17+

  * Maven

  * Git

* Steps

  Clone the repository:
  ```
  https://github.com/ishanstga/springboot-calculator-api.git
  cd calculator-api
  ```
  The application will start on:
  ```
  http://localhost:8082/api/calculator
  ```

## 🚀 Usage
Endpoints
| Method | Endpoint | Description |
| :---         |     :---:      |          ---: |
| GET | /api/calculate |	Perform a calculation |
| GET	| /api/history | Get all calculation logs |

Example Request (GET /api/calculate)
```json
{
  "valueOne": 25,
  "valueTwo": 5,
  "operation": "*"
}
```
Example Response
```json
{
  "id": 1,
  "valueOne": 25,
  "valueTwo": 5,
  "operation": "*",
  "result": 125
}
```

## 📂 Project Structure
    calculator-api/
     ├── src/main/java/com.ishan.calculator/
     │   ├── controller/   # REST controllers
     │   ├── service/      # Business logic (DI)
     │   ├── repository/   # JPA Repositories
     │   ├── model/        # Entity classes
     │   └── CalculatorApiApplication.java
     ├── src/main/resources/
     │   ├── application.properties
     │   └── application-dev.properties  # H2 DB config
     ├── pom.xml
     └── README.md

## 👤 Author
  * Ishan Sanjaya
  * E-mail: ishanstga@gmail.com
