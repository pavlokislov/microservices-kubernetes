# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the target folder into the container
COPY target/recipient-service-0.0.1-SNAPSHOT.jar recipient-service.jar

# Expose the application port (if your Spring Boot app runs on port 8080)
EXPOSE 8080 5006
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5006", "-jar", "/app/recipient-service.jar"]
