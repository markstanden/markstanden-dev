FROM openjdk:alpine AS build
RUN apk update
RUN apk add git

ADD https://api.github.com/repos/markstanden/markstanden-dev/git/refs/heads/main version.json
RUN git clone -b main https://github.com/markstanden/markstanden-dev.git /app

WORKDIR /app
RUN ./gradlew shadowJar --no-daemon

WORKDIR /app
COPY ./build/libs/*.jar /app/

#FROM openjdk:alpine AS prod
#COPY --from=build /app/build/libs/*.jar /app/

EXPOSE 8080:8080
ENTRYPOINT ["java","-jar","markstanden.dev-0.0.1-all.jar"]