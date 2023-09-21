FROM openjdk:19-jdk-alpine
VOLUME /tmp
ADD ./target/sprint-boot-servicio-gateway-server-0.0.1-SNAPSHOT.jar  servicio-getway-server.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar","/servicio-getway-server.jar"]