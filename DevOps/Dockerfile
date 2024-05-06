FROM openjdk:17-alpine
EXPOSE 8080
ADD target/devops-spring.jar devops-spring.jar
ENTRYPOINT [ "java", "-jar", "devops-spring.jar" ]