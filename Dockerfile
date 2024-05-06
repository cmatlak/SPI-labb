FROM eclipse-temurin:21-jammy

WORKDIR /usr/src/app


COPY consumer/target/consumer-1.0-SNAPSHOT.jar ./consumer.jar

COPY service/target/service-1.0-SNAPSHOT.jar ./service.jar


COPY provider/target/provider-1.0-SNAPSHOT.jar ./provider.jar

ENTRYPOINT ["java", "--module-path","/usr/src/app", "--module","se.iths.consumer/se.iths.consumer.Main"]