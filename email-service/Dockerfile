FROM eclipse-temurin:23-jdk-alpine
WORKDIR /app
COPY target/email-service.jar email-service.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "email-service.jar"]