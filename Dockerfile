FROM java:8
ADD target/email-service.jar email-service.jar
ENTRYPOINT ["java","-jar","email-service.jar"]
