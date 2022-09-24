# Course Seller Project Microservices

![drwaio2](https://user-images.githubusercontent.com/17224549/192118369-4790d517-6329-4178-8144-75c487ee4297.png)

## Tech Stack

- Java 8
- Spring Boot
- Spring Data
- Spring Security ( JWT - Basic Authentication - Authorization )
- Lombok
- Angular
- Eureka Discovery Client
- Server
- Hibernate
- MySQL
- Docker


## Postman API Collections
- https://documenter.getpostman.com/view/22927966/VUqpscfr
- https://www.getpostman.com/collections/678062dc9ed3bda4a3e0

# Postman API Tests

Local Tests

![Course Seller Project](https://user-images.githubusercontent.com/17224549/186480510-681a8b31-009d-4658-821d-59f7684d5124.gif)
![Course Seller Project Front End Angular](https://user-images.githubusercontent.com/17224549/186480522-8d23f81e-b661-4c5f-bf47-68d9dff6c881.gif)


## DOCKER
![docker](https://user-images.githubusercontent.com/17224549/192116292-1b075512-2b58-4ba8-9b89-8e97cfbaa1e2.png)


- docker build . -t necatiisahin/course
- docker build . -t necatiisahin/purchase
- docker build . -t necatiisahin/api-gateway
- docker build . -t necatiisahin/eureka


- docker run -d -p 3333:3333 --name course necatiisahin/course
- docker run -d -p 4444:4444 --name purchase necatiisahin/purchase
- docker run -d -p 5555:5555 --name apigateway necatiisahin/api-gateway
- docker run -d -p 6666:6666 --name eureka necatiisahin/eureka




```
