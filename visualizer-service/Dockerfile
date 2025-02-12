FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/visualizer-service-0.0.1-SNAPSHOT.jar visualizer-service.jar

EXPOSE 8083 5008
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5008", "-jar", "/app/visualizer-service.jar"]

