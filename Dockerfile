FROM gradle AS build

ADD https://api.github.com/repos/markstanden/markstanden-dev/git/refs/heads/main version.json
RUN git clone -b main https://github.com/markstanden/markstanden-dev.git /app

WORKDIR /app
RUN ./gradlew build --no-daemon

FROM openjdk AS prod
COPY --from=build /app/build/libs/*.jar /app/
COPY --from=build /app/static /app/

EXPOSE 8080:8080
ENTRYPOINT ["java","-jar","markstanden.dev-0.0.1-all.jar"]