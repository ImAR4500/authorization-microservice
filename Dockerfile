FROM openjdk:8
ADD target/authorizationapp.jar authorizationapp.jar
ENTRYPOINT ["java", "-jar","authorizationapp.jar"]
EXPOSE 9090