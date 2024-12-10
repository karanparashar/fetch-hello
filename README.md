
---

This file provides an overview, prerequisites, steps to run the services, and technical details. Let me know if you need changes or additional information!


# FetchHello

The **FetchHello Service** provides a simple greeting string to the orchestrator.

---

## **Features**
- A lightweight service returning a greeting message.
- Accessible via a single endpoint.

---

## **Endpoints**

### `GET /fetchString`
- **Description**: Returns a static greeting string.
- **Response**: `"Hello"`

---

## **Swagger Documentation**
Access the Swagger UI: [FetchHello Swagger UI](http://fetchhello.ap-south-1.elasticbeanstalk.com/swagger-ui/index.html#/)

---

## **How to Run**

### Prerequisites
- Java 17 or higher
- Maven 3.8.6 or higher

### Steps
1. Navigate to the `fetchHello` directory.
2. Build the service:
   ```bash
   mvn clean install

### Start the service:
   ```bash
   mvn spring-boot:run