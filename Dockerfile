FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y

COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=maven_builder /app/target/*.jar up-user-service/target

ENTRYPOINT [ "java", "-jar", "app.jar"]
