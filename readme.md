# Spring OAuth Login Application
This is a sample Spring OAuth project that demonstrates how to implement OAuth authentication using GitHub and Google as identity providers. The project provides a REST API with two endpoints: '/' and '/secured'. The '/' endpoint is accessible to all users, while the '/secured endpoint' requires authentication.

## Endpoints
- GET /: Returns a welcome message for public users.
- GET /secured: Returns a greeting message for authenticated (private) users.

## Configuration
The project is configured to use OAuth authentication with GitHub and Google. You need to provide your own client credentials (client ID and client secret) for these providers. Update the following properties in the application.properties file:

### Github Login
    spring.security.oauth2.client.registration.github.client-id="your-id"
    spring.security.oauth2.client.registration.github.client-secret="your-secret"

### Google Login
    spring.security.oauth2.client.registration.google.client-id="your-id"
    spring.security.oauth2.client.registration.google.client-secret="your-secret"

## Running the Application
To run the Spring OAuth application, follow these steps:
1. Ensure you have Java and Maven installed on your system.
2. Clone the repository or download the source code.
3. Open a terminal or command prompt and navigate to the project's root directory.
4. Build the application by running the following command:
    ```bash
    mvn clean package

5. Run the application using the following command:
    ```bash
    java -jar target/spring-oauth.jar
    #The application will start running on http://localhost:8080.

## Testing Endpoints
You can use a tool like cURL, Postman, or any web browser to test the endpoints. Here are some example requests:
- GET http://localhost:8080/: Returns a welcome message for public users.
- GET http://localhost:8080/secured: Requires authentication. If not authenticated, you will be redirected to the login page of the selected identity provider (GitHub or Google). After successful authentication, you will see a greeting message for private users.

## Security Configuration
The security configuration is defined in the SecurityConfig class. It uses Spring Security to secure the endpoints. The / endpoint is configured to be accessible to all users, while the /secured endpoint requires authentication.

## Dependencies
The project uses the following dependencies:
- Spring Boot Starter Web: Provides the necessary dependencies to build a web application.
- Spring Security OAuth2 Client: Adds support for OAuth2 authentication with external identity providers. 



## Additional Information
For more information about Spring OAuth and integrating with different identity providers, refer to the official Spring documentation: https://spring.io/guides/tutorials/spring-boot-oauth2/

For troubleshooting or debugging purposes, the logging level of the org.springframework.security package has been set to TRACE.

Note: The project excludes the DataSourceAutoConfiguration to simplify the setup and focus on OAuth functionality. If you need to connect to a database, you may need to modify the configuration accordingly.
