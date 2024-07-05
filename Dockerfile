FROM eclipse-temurin:21-jre-alpine

COPY ./target/simpletask-*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
