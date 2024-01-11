FROM openjdk:11-jdk-slim
LABEL maintainer="helloworld"
LABEL version="0.0.1"
COPY target/test-0.0.2-SNAPSHOT.jar test-0.0.2-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "test-0.0.2-SNAPSHOT.jar"]
