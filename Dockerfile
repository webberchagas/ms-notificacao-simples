FROM eclipse-temurin:21-alpine AS build
WORKDIR /app
COPY . .
RUN gradle build --no-daemon


FROM eclipse-temurin:21-alpine
WORKDIR /app
COPY --from=build /app/build/libs/*.jar /app/app.jar
EXPOSE 8082
CMD ["java", "-jar", "/app/app.jar"]