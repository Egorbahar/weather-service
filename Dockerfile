FROM adoptopenjdk/openjdk11:alpine-jre
VOLUME /tmp
ARG JAR_FILE=target/weather-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} weather-service.jar
ENTRYPOINT ["java","-jar","/weather-service.jar"]