# 🎓 Student CRUD App

A simple REST API built with Spring Boot to manage student records using PostgreSQL.

---

## 🚀 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok

---

## 📌 Features

- Add a new student
- Get all students
- Get student by ID
- Delete student by ID
- Find students by branch

---

## 📂 REST API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| POST | `/students` | Create a new student |
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| DELETE | `/students/{id}` | Delete student by ID |
| GET | `/students/branch/{branch}` | Get students by branch |

---

## 📝 Sample Request Body

### POST `/students`

```json
{
  "name": "Rahul Sharma",
  "email": "rahul.sharma@example.com",
  "branch": "CSE",
  "cgpa": 8.7
}
```

---

## ▶️ Run the Application

```bash
mvn spring-boot:run
```

---

## 🌐 Application URL

```text
http://localhost:8080
```

---

## 🛠️ Database Configuration

Update your `application.properties` file with your PostgreSQL credentials:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/studentdb
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 📦 Clone the Repository

```bash
git clone https://github.com/your-username/student-crud-app.git
cd student-crud-app
```

---

## 📄 License

This project is open-source and available under the MIT License.
