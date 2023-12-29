FROM openjdk:11-jdk-slim
COPY /var/jenkins_home/workspace/jenkins-helloworld/test/target/test-0.0.1-SNAPSHOT.jar test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "test-0.0.1-SNAPSHOT.jar"]
