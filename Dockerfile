# Use an official OpenJDK runtime as a parent image
FROM adoptopenjdk:17-jre

# Set the working directory in the container
WORKDIR /app

# Copy the Uber JAR into the container (assuming the output JAR file name is hello-world-counter-0.0.1-SNAPSHOT.jar)
COPY target/hello-world-counter-0.0.1.jar app.jar

# Expose the port your application will run on
EXPOSE 9090

# Command to run your application
CMD ["java", "-jar", "app.jar"]
