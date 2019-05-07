FROM openjdk:8
VOLUME /tmp
ADD build/libs/ifsp-demo-0.0.1-SNAPSHOT.jar ifsp-demo.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","ifsp-demo.jar"]
