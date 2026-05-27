```markdown
# Student CRUD App

A basic Spring Boot REST API for managing students using PostgreSQL.

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok

## APIs

| Method | URL |
|---|---|
| POST | `/students` |
| GET | `/students` |
| GET | `/students/{id}` |
| DELETE | `/students/{id}` |
| GET | `/students/branch/{branch}` |

## Sample POST Body

```json
{
  "name": "Rahul Sharma",
  "email": "rahul.sharma@example.com",
  "branch": "CSE",
  "cgpa": 8.7
}
```

## Run

```bash
mvn spring-boot:run
```

App runs on:

```text
http://localhost:8080
```
```
