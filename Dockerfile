FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/todo-list-0.0.1-SNAPSHOT.jar /app/todo-list.jar

ENV PORT=8080

EXPOSE 8080

CMD ["sh", "-c", "java -Dserver.port=$PORT -jar todo-list.jar"]