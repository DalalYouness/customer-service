# Customer Service

This is a microservice responsible for managing customer data. It uses **Spring Data REST** to automatically expose CRUD operations.

## 🚀 Features
- **Spring Data JPA**: Persistence layer using H2/MySQL.
- **Spring Data REST**: Automatic RESTful API generation.
- **Eureka Client**: Self-registration with the Discovery Server.

## 🛠️ Tech Stack
- Java 17+
- Spring Boot 3.x
- Spring Data JPA & Spring Data REST
- H2 Database (In-Memory)

## 📡 API Endpoints
Once running, the API is available via:
- `GET /customers`: List all customers.
- `GET /customers/{id}`: Get specific customer.
