#FROM java:8
FROM meddream/jdk17
#Changed the working directory to /opt/app
WORKDIR /opt/app
ARG JAR_FILE=target/i18n-demo-0.0.1-SNAPSHOT.jar
#ADD  .
#COPY target/i18n-demo-0.0.1-SNAPSHOT.jar /myapp/i18n-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","i18n-demo-0.0.1-SNAPSHOT.jar"]