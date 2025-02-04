# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the target folder into the container
COPY target/collector-service-0.0.1-SNAPSHOT.jar collector-service.jar

EXPOSE 8082 5007
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5007", "-jar", "/app/collector-service.jar"]

