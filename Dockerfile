FROM openjdk:8
ARG JAR_FILE="/target/springboot-blog-application.jar"
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]