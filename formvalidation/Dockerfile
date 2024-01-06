FROM eclipse-temurin:17.0.9_9-jre-jammy

MAINTAINER "Jawahar"

WORKDIR /formvalidation

COPY target/formvalidation-0.0.1-SNAPSHOT.jar .

EXPOSE $PORT

ENTRYPOINT ["java", "-jar", "formvalidation-0.0.1-SNAPSHOT.jar"]