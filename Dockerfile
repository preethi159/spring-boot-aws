FROM openjdk:11
COPY target/springboot-with-docker-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","springboot-with-docker-0.0.1-SNAPSHOT.jar"]