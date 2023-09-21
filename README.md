# sprint-boot-servicio-gateway-server

# http://localhost:8090/api/items/listar
# http://localhost:8090/api/items/ver/1/cantidad/3

# -- probando config server
   --- http://localhost:8090/api/items/obtener-config

   # DOCKER
## generar .jar: .\mvnw clean package -DskipTests
## generar imagen: docker build -t servicio-getway-server:v1 .
## creando red: docker network create sprintcloud
## levantando servicio: docker run -d -p 8090:8090 --name servicio-getway-server --network sprintcloud servicio-getway-server:v1
   