FROM openjdk:8
EXPOSE 8082
ADD target/spring-boot-starter-parent.jar spring-boot-starter-parent.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-starter-parent.jar"]