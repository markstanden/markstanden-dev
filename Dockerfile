FROM openjdk:alpine AS build
RUN apk update
RUN apk add git

ADD https://api.github.com/repos/markstanden/markstanden-dev/git/refs/heads/main version.json
RUN git clone -b main https://github.com/markstanden/markstanden-dev.git /app

WORKDIR /app
# RUN ./gradlew shadowJar
RUN ./gradlew
COPY /build/libs/* /app/

#FROM openjdk:alpine

#COPY --from=build /app/build/libs/* /app/
#COPY --from=build /app/src/main/resources/files/css* /static/css/
#COPY --from=build /app/src/main/resources/files/images* /static/images/

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/markstanden.dev-0.0.1-all.jar"]