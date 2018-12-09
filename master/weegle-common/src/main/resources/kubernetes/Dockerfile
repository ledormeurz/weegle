FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY *.jar .
EXPOSE ${server.port}:${server.port}

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/${project.name}-${project.version}.jar"]