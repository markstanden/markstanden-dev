FROM openjdk:alpine AS build
RUN apk update
RUN apk add git
RUN mkdir /app
WORKDIR /app
RUN git clone https://github.com/markstanden/markstanden-dev .
RUN ./gradlew :shadowJar

FROM openjdk:alpine
COPY --from=build /app/build/libs/* /app/

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/markstanden.dev-0.0.1-all.jar"]