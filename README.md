# Base_Spring_boot_arch
Basic spring boot, spring data microservice structure.

```
 501  docker ps
 502  docker run -P -d --name mongodb mongo
 503  ps aux | grep mongodb
 504  docker ps | grep mongodb
 505  mongo
 506  docker ps
 507  docker exec -it mongodb sh
 508  docker ps
 509  echo $DOCKER_HOST
 536  docker build -t microservicedemo/employee .
 537  docker os
 538  docker ps
 540  docker images
 541  docker  run -P -d --name employee --link mongodb microservicedemo/employee
 542  docker ps
 543  docker exec employee bash -c 'env | grep MONGODB'
```