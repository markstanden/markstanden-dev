FROM gradle AS build

ADD https://api.github.com/repos/markstanden/markstanden-dev/git/refs/heads/main version.json
RUN git clone -b main https://github.com/markstanden/markstanden-dev.git /app

WORKDIR /app
RUN ./gradlew --no-daemon

#FROM openjdk:alpine AS prod
#COPY --from=build /app/build/libs/*.jar /app/

EXPOSE 8080:8080
ENTRYPOINT ["java","-jar","./build/libs/markstanden.dev-0.0.1-all.jar"]