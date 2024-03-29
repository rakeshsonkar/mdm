
# 1st stage, build the app
FROM maven:3.6-jdk-11 as build

WORKDIR /ifmsSmple

# Create a first layer to cache the "Maven World" in the local repository.
# Incremental docker builds will always resume after that, unless you update
# the pom
ADD pom.xml .
RUN mvn package

# Do the Maven build!
# Incremental docker builds will resume here when you change sources
ADD src src
RUN mvn package -DskipTests
RUN echo "done!"

# 2nd stage, build the runtime image
FROM openjdk:11.0.4-jre-slim
WORKDIR /ifmsSmple

# Copy the binary built in the 1st stage
COPY --from=build /ifmsSmple/target/sanction.jar ./
COPY --from=build /ifmsSmple/target/libs ./libs

CMD ["java", "-jar", "sanction.jar"]

EXPOSE 5003
