
FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/CustomerService-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8081
