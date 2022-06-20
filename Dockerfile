FROM openjdk:17-jdk-alpine

ENV APP_REFERENCE_JAR=target/products.jar
ENV APP_NAME=products.jar

COPY ${APP_REFERENCE_JAR} ${APP_NAME}
ENTRYPOINT java -jar ${APP_NAME}

EXPOSE 8080