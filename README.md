# Demo Spring Boot Project

## Requirements

- Java 17
- Maven 3.6+
- MySQL 5.7+
- An IDE (e.g., IntelliJ IDEA, Eclipse)

## Configuration

### Maven

Ensure you have Maven installed. You can download it from [Maven's official website](https://maven.apache.org/download.cgi).

### MySQL Database

Create a MySQL database named `affectation` and configure the username and password in the `application.properties` file.

### `application.properties`

Configure your database connection in `src/main/resources/application.properties`:

```properties
spring.application.name=demo
server.port=8080

# Database
spring.datasource.url=jdbc:mysql://localhost:3306/affectation
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=create-drop
```

### `pom.xml`

Ensure your `pom.xml` includes the necessary dependencies:

```xml
<dependencies>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-rest</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
  </dependency>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
  </dependency>
  <dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
  </dependency>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
  </dependency>
  <dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.8.5</version>
  </dependency>
</dependencies>
```

## How to Run the Project

1. **Clone the repository:**

   ```sh
   git clone <repository-url>
   cd demo
   ```

2. **Build the project:**

   ```sh
   mvn clean install
   ```

3. **Run the project:**

   ```sh
   ./mvnw spring-boot:run
   ```

4. **Access the application:**

   Open your browser and navigate to `http://localhost:8080`.

## Additional Information

- **Swagger UI:** Access the API documentation at `http://localhost:8080/swagger-ui.html`.
- **Actuator Endpoints:** Access the actuator endpoints at `http://localhost:8080/actuator`.
