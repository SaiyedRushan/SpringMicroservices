# Spring Microservices
![Screenshot 2021-11-30 at 12 32 51](https://user-images.githubusercontent.com/40702606/144061535-7a42e85b-59d6-4f7f-9c35-18a48b49e6de.png)

Developed a scalable, cloud-based microservices architecture using Spring Boot, Spring Cloud, and supporting technologies like Eureka, RabbitMQ, and Zipkin. Implemented features including customer interactions, fraud detection, and real-time notifications to deliver a robust and secure user experience.
* **Core Framework:** Spring Boot, Spring Data JPA
* **Microservice focus:** Spring Cloud, OpenFeign
* **Database:** PostgreSQL
* **Additional technologies:** Eureka, Kafka, Zipkin
* **Project Scope:** Customer-facing functions, security, and notifications


* **Customer:** This service interacts with customers, potentially through a web or mobile app.
* **Fraud:** This service detects and prevents fraudulent activity.
* **Load Balancer:** This service distributes incoming traffic among the different microservices.
* **Message Queue:** This RabbitMQ service allows messages to be asynchronously exchanged between microservices.
* **Notification:** This service sends notifications to customers, such as order confirmations or fraud alerts.
* **Eureka Server:** This service helps register and discover microservices.
* **Config Server:** This service stores and centrally manages configuration information for the microservices.
* **Sleuth and Zipkin:** These services provide distributed tracing, which allows developers to track the flow of requests across multiple microservices. 
