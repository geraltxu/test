FROM java:8-jdk-alpine

COPY ./target/test-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch test-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","test-0.0.1-SNAPSHOT.jar"]