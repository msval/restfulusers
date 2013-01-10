## restfulusers

This project is a backend to https://github.com/msval/backbonebasics

Also, I use this project as a boilerplate in scaffolding my json rest services.

To keep the things as simple as possible all data are stored in memory without persistence.

### Service usage examples

#### GET http://localhost:8080/restfulusers/users
```json
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
```

#### GET http://localhost:8080/restfulusers/users/1
```json
{
    "id": "1",
    "firstname": "Little",
    "lastname": "Bear",
    "age": "1"
}
```

#### POST http://localhost:8080/restfulusers/users
(don't forget header Content-Type application/json; charset=UTF-8)
 
#### DELETE http://localhost:8080/restfulusers/users/0

#### PUT http://localhost:8080/restfulusers/users
(don't forget header Content-Type application/json; charset=UTF-8)