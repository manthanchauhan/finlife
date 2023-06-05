FROM amazoncorretto:18.0.2-al2
EXPOSE 8081
ADD target/finlife.jar finlife.jar
ENTRYPOINT ["java", "-jar", "/finlife.jar"]