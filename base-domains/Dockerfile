FROM eclipse-temurin:23-jdk-alpine
WORKDIR /app
COPY target/base-domains.jar base-domains.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "base-domains.jar"]