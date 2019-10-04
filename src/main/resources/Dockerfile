FROM alpine:latest
RUN apk --update add openjdk11-jre
ADD demo-docker.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]