FROM openjdk:8u212-jdk-slim

# Maintainer Info
LABEL maintainer="varunmanchanda67@gmail.com"

VOLUME /tmp

# The application's jar file (when packaged)
ARG JAR_FILE=target/userdetails-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} userdetails-0.0.1-SNAPSHOT.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/userdetails-0.0.1-SNAPSHOT.jar"]

EXPOSE 8005