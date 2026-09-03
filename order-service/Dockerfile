FROM eclipse-temurin:23-jdk-alpine
WORKDIR /app
COPY target/order-service.jar order-service.jar
EXPOSE 8087
ENTRYPOINT ["java", "-jar", "order-service.jar"]