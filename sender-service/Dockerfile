# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the target folder into the container
COPY target/sender-service-0.0.1-SNAPSHOT.jar sender-service.jar

EXPOSE 8080 5005
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005", "-jar", "/app/sender-service.jar"]

