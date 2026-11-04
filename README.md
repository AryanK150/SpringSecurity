# Spring Security – Role-Based Student Management System

A Spring Boot application demonstrating authentication and role-based authorization using Spring Security, HTTP Basic Authentication, Spring Data JPA, and MySQL.

## Features

- HTTP Basic Authentication
- Role-Based Access Control (RBAC)
- BCrypt password encoding
- Custom UserDetailsService
- Student CRUD REST APIs
- MySQL database integration
- Spring Data JPA and Hibernate

## Technology Stack

- Java 21
- Spring Boot 4.1.2
- Spring Security
- Spring Data JPA
- MySQL
- Maven

## User Roles and Permissions

| Operation | ADMIN | TEACHER | STUDENT |
|---|---|---|---|
| View Students | Yes | Yes | Yes |
| Add Students | Yes | Yes | No |
| Update Students | Yes | Yes | No |
| Delete Students | Yes | No | No |

## REST API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/students` | Add Student |
| GET | `/students` | Get All Students |
| GET | `/students/{id}` | Get Student by ID |
| PUT | `/students/{id}` | Update Student |
| DELETE | `/students/{id}` | Delete Student |

## Database Configuration

Configure MySQL credentials using environment variables.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/SpringBoot_Project?createDatabaseIfNotExist=true
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
spring.jpa.hibernate.ddl-auto=update
```

## Run the Application

Clone the repository:

```bash
git clone https://github.com/AryanK150/SpringSecurity.git
```

Navigate to the project directory and run:

```bash
./mvnw spring-boot:run
```

On Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

Configure the required database environment variables before starting the application.

## Author

**Aryan Khanzode**

GitHub: [AryanK150](https://github.com/AryanK150)