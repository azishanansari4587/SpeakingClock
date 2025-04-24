# Speaking Clock API

## Description
This API converts 24-hour time format to spoken English time phrases.

![image](https://github.com/user-attachments/assets/9471c4d0-627b-46ce-8b8b-b14299982481)


## Endpoint
- `GET /api/time/convert?time=08:34` → `It's eight thirty four`
- Handles `00:00` as "It's Midnight" and `12:00` as "It's Midday"

## Run Locally
```bash
mvn clean install
mvn spring-boot:run
```

Access Swagger UI at `http://localhost:9090/swagger-ui/swagger-ui/index.html`

## Tech Stack
- Java 8
- Spring Boot
- Swagger
- Maven
