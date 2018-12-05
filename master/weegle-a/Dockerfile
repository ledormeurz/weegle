FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/*.jar .
EXPOSE 80:80
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/weegle-a-1.0-SNAPSHOT.jar"]