restfulusers
============

Simple project boilerplate for creating json rest service

This example holds all data in memory.

GET
---
http://localhost:8080/restfulusers/users

(some default data to get started):
[
    {
        "id": "3",
        "firstname": "Tom",
        "lastname": "Tom",
        "age": "65"
    },
    {
        "id": "2",
        "firstname": "Bear",
        "lastname": "Pappa",
        "age": "53"
    },
    {
        "id": "1",
        "firstname": "Mamma",
        "lastname": "Bear",
        "age": "56"
    },
    {
        "id": "0",
        "firstname": "Little",
        "lastname": "Bear",
        "age": "19"
    },
    {
        "id": "4",
        "firstname": "Peter",
        "lastname": "O'Hara",
        "age": "8"
    }
]

GET
---
http://localhost:8080/restfulusers/users/1

{
    "id": "1",
    "firstname": "Little",
    "lastname": "Bear",
    "age": "1"
}

POST
----
http://localhost:8080/restfulusers/users

(don't forget header Content-Type application/json; charset=UTF-8)
 
DELETE
------
http://localhost:8080/restfulusers/users/0

PUT
---
http://localhost:8080/restfulusers/users

(don't forget header Content-Type application/json; charset=UTF-8)