FROM eclipse-temurin:17.0.9_9-jre-jammy

LABEL authors="jawahar"

WORKDIR /thymeleafcrud

COPY target/thymeleafcrud-0.0.1-SNAPSHOT.jar .

EXPOSE $PORT
ENV DB_URL dummy_url
ENV DB_USER dummy_user
ENV DB_PASSWORD dummy_password

ENTRYPOINT ["java", "-jar", "thymeleafcrud-0.0.1-SNAPSHOT.jar"]