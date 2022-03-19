FROM alpine AS build
RUN mkdir /usr/src/app/
WORKDIR /usr/src/app/
RUN git clone https://github.com/markstanden/markstanden-dev .
RUN ./gradlew :shadowJar

FROM openjdk
COPY --from=build /usr/src/app/build/libs/* /usr/app/

EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/app/markstanden.dev-0.0.1-all.jar"]