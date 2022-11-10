#cmd : docker build -t associate-service .
FROM eclipse-temurin:8-jdk-alpine
EXPOSE 9092
VOLUME /tmp
COPY target/*.jar associate-service.jar
ENTRYPOINT ["java","-jar","/associate-service.jar"]