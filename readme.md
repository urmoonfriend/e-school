# e-School App using Java and Spring

> ### Spring boot + MyBatis codebase containing real world examples (CRUD, auth, etc).

This codebase was created to demonstrate a fully fledged full-stack application built with Spring boot + Mybatis including CRUD operations, authentication and more.

To get the code:
-------------------
Clone the repository:

    $ git clone git://github.com/urmoonfriend/e-school.git

# How it works

The application uses Spring Boot (Web, Mybatis).

* Use the idea of Domain Driven Design to separate the business term and infrastructure term.
* Use MyBatis to implement the [Data Mapper](https://martinfowler.com/eaaCatalog/dataMapper.html) pattern for persistence.

# Security

Integration with Spring Security.

The secret key is stored in `application.properties`.

When you enter the application, you will be asked for a username and password, which is "admin".

# Database

It uses a PostgreSQL database, can be changed easily in the application.properties for any other database.
You need to create table named 'pupils' in your database. </br>
(id bigint primary key auto_increment, </br>
first_name varchar(50), </br>
last_name varchar)

# Getting started

You'll need Java 11 installed.

To test that it works, open a browser tab at http://localhost:8092/pupils .  
Alternatively, you can run

    curl http://localhost:8092/pupils


# Help

Please fork and PR to improve the project.