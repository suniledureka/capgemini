# start with a base image containing Java runtime
FROM openjdk:17-jdk-slim   

# information around who maintains the image
MAINTAINER capgemini.com

# add the application's jar to the image
COPY target/sb-aws-docker.jar sb-aws-docker.jar

# informs Docker runtime about the port that the container listens at runtime
EXPOSE 8080

# execute the application
ENTRYPOINT ["java", "-jar", "sb-aws-docker.jar"]