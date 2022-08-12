FROM gradle:7.2-jdk8 as gradle
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle clean build --no-daemon

FROM openjdk:8-jdk
COPY --from=gradle /home/gradle/src/build/libs/gitHub.jar /home/application/gitHub.jar
ENTRYPOINT ["java", "-jar", "/home/application/gitHub.jar"]
