# Start with a base image containing Java runtime
FROM openjdk:11.0.10-slim
#ARGS
ARG JAR_FILE=./target/demo-0.0.1-SNAPSHOT.jar
ARG APP_PORT=8080
ARG JAVA_OPTS=

# Make port 8080 available to the world outside this container
EXPOSE ${APP_PORT}

# The application's jar file

RUN echo "$JAR_FILE"
# Add the application's jar to the container
ADD ${JAR_FILE} /demo.jar
# Run the jar file
ENTRYPOINT exec java ${JAVA_OPTS} -jar /demo.jar