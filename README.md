
# 📘 Blog Management REST API (Spring Boot)

A complete **Spring Boot 3.x RESTful API** for managing blog posts, categories, and comments with CRUD operations, validation, and proper architecture.

---

## 🚀 Project Description

This project is a backend application built using Spring Boot that allows users to:

* Create, read, update, and delete blog posts
* Organize posts into categories
* Add and manage comments
* Handle validation and errors properly

It follows a clean **layered architecture**:

Controller → Service → Repository → Model

---

## 🎯 Features

* ✔ RESTful API design
* ✔ CRUD operations (Posts, Categories, Comments)
* ✔ Spring Data JPA + Hibernate
* ✔ Validation using `@Valid`
* ✔ Global exception handling
* ✔ H2 in-memory database
* ✔ Swagger API documentation
* ✔ Clean and structured code

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot 3.x
* Spring Data JPA
* Hibernate ORM
* H2 Database
* Maven
* Swagger (OpenAPI)

---

## 📂 Project Structure

```
week6-spring-blog-api/
│── src/main/java/com/blogapi/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── model/
│   │   ├── entity/
│   │   └── dto/
│   ├── exception/
│   └── BlogApiApplication.java
│
│── src/main/resources/
│   ├── application.properties
│
│── pom.xml
│── README.md
```

---

## ⚙️ Setup & Installation

### 1️⃣ Clone Repository

```bash
git clone https://github.com/Bhoomikakt-123/week6-spring-blog-api.git
cd week6-spring-blog-api
```

---

### 2️⃣ Run Application

```bash
mvn spring-boot:run
```

---

### 3️⃣ Access Application

* 🌐 API Base URL: http://localhost:8080
* 📚 Swagger UI: http://localhost:8080/swagger-ui.html
* 🗄️ H2 Console: http://localhost:8080/h2-console

---

## 🔗 API Endpoints

### 📝 Posts

| Method | Endpoint        | Description     |
| ------ | --------------- | --------------- |
| GET    | /api/posts      | Get all posts   |
| GET    | /api/posts/{id} | Get post by ID  |
| POST   | /api/posts      | Create new post |
| PUT    | /api/posts/{id} | Update post     |
| DELETE | /api/posts/{id} | Delete post     |

---

### 📂 Categories

| Method | Endpoint        |
| ------ | --------------- |
| GET    | /api/categories |
| POST   | /api/categories |

---

### 💬 Comments

| Method | Endpoint                     |
| ------ | ---------------------------- |
| GET    | /api/posts/{postId}/comments |
| POST   | /api/posts/{postId}/comments |

---

## 🧪 Sample API Request

### Create Post

```bash
curl -X POST http://localhost:8080/api/posts \
-H "Content-Type: application/json" \
-d '{
"title": "My First Blog",
"content": "Spring Boot is awesome!",
"author": "Bhoomika",
"categoryId": 1
}'
```

---

## ⚠️ Important Note

👉 Before creating posts, make sure a **category exists** in the database.

---

## 📊 Database Configuration

Default database: **H2 (In-Memory)**

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
```

---

## ❗ Exception Handling

* Custom Exception: `ResourceNotFoundException`
* Global handler using `@RestControllerAdvice`

---

## 🔐 Validation

* `@NotNull`
* `@Valid`

Ensures correct API input.

---

## 📈 Logging

* Implemented using **SLF4J + Logback**
* Logs API activity and errors

---

## 🚀 Future Enhancements

* JWT Authentication
* Role-based access control
* Frontend integration (React)
* Cloud deployment (AWS)

---

## 👩‍💻 Author

**Bhoomika**
GitHub: https://github.com/Bhoomikakt-123

---

## 📜 License

This project is created for academic purposes.

---


Run:
mvn spring-boot:run

Swagger:
http://localhost:8080/swagger-ui.html
H2 Console:
http://localhost:8080/h2-console
