FROM openjdk:8
EXPOSE 4042
ADD target/SpringAPP.jar SpringAPP.jar
ENTRYPOINT ["java","-jar","SpringAPP.jar"]