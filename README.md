

# Library Management System
Spring mvc boot jpa rest library management project

## Functionality
Completed the CRUD operation using Spring boot,REST,JPA.

RESTful endpoints working using id.
GET books
GET books/{id}
POST books
PUT books
DELETE books/{id}

## Technology Stack

1.  Java
2.  Maven
3.  Spring
4.  Spring-Boot
5.  JUnit
6.  MockMvc


### Code Setup

** 1. Get the code repo **

** 2. Build and run the backend app using maven**

Alternatively, you can run the app without packaging it using

```bash
cd folder
mvn spring-boot:run
```

The backend localhost service will start at <http://localhost:8080>.


Endpoints:

GET Request
````
localhost
http://localhost:8080/books
http://localhost:8080/books/1234

````

Try below on postman:

POST request on --> http://localhost:8080/books

````
{
//use below JSON data object

        "name": Java,
        "Author": "Kathy Sieera",
        "isbn": "1234"
    }
````


PUT request on ---> http://localhost:8080/books
````
{
    //use below JSON data object

        "name": CTCI,
        "Author": "Gayle Laakmann McDowell",
        "isbn": "1235"
}
````

DELETE request on --> http://localhost:8080/books/1235

