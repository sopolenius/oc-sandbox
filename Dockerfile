FROM frolvlad/alpine-oraclejdk8
ADD target/*.jar /app/
WORKDIR /app
EXPOSE 8080

ENTRYPOINT ["java","-jar","newapp-0.0.1-SNAPSHOT.jar"]
LABEL version="1.0"
