FROM openjdk:17
WORKDIR /app
VOLUME /tmp
COPY build/libs/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]
