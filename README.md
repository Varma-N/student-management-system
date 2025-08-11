# Student Management System

A simple CRUD application built with Spring Boot, MySQL, and HTML/JavaScript.

## Features

- Add, update, delete, and list students
- Input validation
- RESTful APIs
- Clean frontend with HTML and CSS

## Technologies Used

- **Backend**: Spring Boot, JPA, MySQL
- **Frontend**: HTML, CSS, JavaScript
- **Database**: MySQL

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Varma-N/student-management-system.git

2. Start the spring Boot app:
   ```bash
   mvn spring-boot:run

3. Open browser:
   ```bash
   http://localhost:8080

## API endpoints
| METHOD  |      ENDPOINT       | DESCRIPTION      |
|   -        |    -             |     -            |
|   GET      | /api/students    |  Get all students|
|   POST     | /api/students    |  Add a student   |
|   DELETE   | /api/students{id}|  Delete a student|



## ✅ Deep Dive Understanding

Now let’s **understand each part in depth**.

### 🏢 1. Project Structure

#### 📁 `src/main/java/com/example/studentms/`

- **Model**: `Student.java` → Represents the `students` table.
- **Repository**: `StudentRepository.java` → Handles database operations.
- **Service**: `StudentService.java` → Business logic (CRUD operations).
- **Controller**: `StudentController.java` → Exposes REST APIs.

#### 📁 `src/main/resources/static/`

- **HTML**: `index.html` → Frontend for adding and listing students.

### 🧠 2. Key Concepts

#### 🌟 Spring Boot Basics

- **Auto-configuration**: Automatically configures Tomcat, JPA, etc.
- **REST APIs**: Expose endpoints for CRUD operations.
- **JPA/Hibernate**: ORM for interacting with MySQL.

#### 🌟 Frontend Integration

- **Static Files**: Served from `static/` directory.
- **AJAX Requests**: Use `fetch()` to communicate with backend APIs.

#### 🌟 Database Setup

- **MySQL**: Stores student data.
- **H2 vs. MySQL**: H2 is in-memory, MySQL is persistent[✅].
