# CRUD2MongoDBYSprint

## Crear Persona
Para crear una persona desde la ruta `http://localhost:8080/api/person` agrege los siguientes objetos JSON uno por uno en el Body de la petición `GET`.

```json
[
    {
        "id": "6736444720003f5763061751",
        "dni": "8428shas",
        "firstName": "hector",
        "lastName": "vanegas",
        "age": "40",
        "address": "ahsjdaskj",
        "emailAddress": "asdjsadj",
        "cellNumber": "3044278239",
        "createAt": null
    },
    {
        "id": "661c2e18f474b976ad17ba1f",
        "dni": "12345678",
        "firstName": "Juan",
        "lastName": "Pérez",
        "age": 30,
        "address": "Calle Falsa 123",
        "emailAddress": "juan.perez@example.com",
        "cellNumber": 3012345678,
        "createAt": null
    },
    {
        "id": "661c2e18f474b976ad17ba20",
        "dni": "87654321",
        "firstName": "María",
        "lastName": "Gómez",
        "age": 25,
        "address": "Av. Siempre Viva 742",
        "emailAddress": "maria.gomez@example.com",
        "cellNumber": 3029876543,
        "createAt": null
    },
    {
        "id": "661c2e18f474b976ad17ba21",
        "dni": "56781234",
        "firstName": "Carlos",
        "lastName": "López",
        "age": 40,
        "address": "Calle 45 #10-20",
        "emailAddress": "carlos.lopez@example.com",
        "cellNumber": 3008765432,
        "createAt": null
    },
    {
        "id": "661c2e18f474b976ad17ba22",
        "dni": "34567812",
        "firstName": "Ana",
        "lastName": "Martínez",
        "age": 35,
        "address": "Carrera 15 #32-12",
        "emailAddress": "ana.martinez@example.com",
        "cellNumber": 3112345678,
        "createAt": null
    },
    {
        "id": "661c2e18f474b976ad17ba23",
        "dni": "23456781",
        "firstName": "Luis",
        "lastName": "Ramírez",
        "age": 28,
        "address": "Diagonal 30 #16-34",
        "emailAddress": "luis.ramirez@example.com",
        "cellNumber": 3123456789,
        "createAt": null
    }
]
```
## Eliminar Persona
Para eliminar una persona desde la ruta `http://localhost:8080/api/person` agrege el siguiente objeto JSON  en el Body de la petición `DEL`, indicando el id de la persona a borrar.

```json
{
    "id": "661c2e18f474b976ad17ba23",
    "dni": "",
    "firstName": "",
    "lastName": "",
    "age": "",
    "address": "",
    "emailAddress": "",
    "cellNumber": "",
    "createAt": null
}
```
## Actualizar Numero
Para actualizar el numero de una persona desde la ruta `http://localhost:8080/api/person` agrege el siguiente objeto JSON en el Body de la petición `PUT`, indicando el id de la persona a la que se hara la modificación y el nuevo numero.

```json
{
    "id": "661c2e18f474b976ad17ba23",
    "dni": "",
    "firstName": "",
    "lastName": "",
    "age": "",
    "address": "",
    "emailAddress": "",
    "cellNumber": 3134567854,
    "createAt": null
}
```
## Actualizar Dirección
Para actualizar la dirección de una persona desde la ruta `http://localhost:8080/api/person/update-address` agrege el siguiente objeto JSON en el Body de la petición `PUT`, indicando el id de la persona a la que se hara la modificación y la nueva dirección.

```json
{
    "id": "661c2e18f474b976ad17ba23",
    "dni": "",
    "firstName": "",
    "lastName": "",
    "age": "",
    "address":"calle 1 #23",
    "emailAddress": "",
    "cellNumber": "",
    "createAt": null
}
```
## Actualizar Email
Para actualizar el email de una persona desde la ruta `http://localhost:8080/api/person/update-email` agrege el siguiente objeto JSON en el Body de la petición `PUT`, indicando el id de la persona a la que se hara la modificación y el nuevo correo.

```json
{
    "id": "661c2e18f474b976ad17ba23",
    "dni": "",
    "firstName": "",
    "lastName": "",
    "age": "",
    "address": "",
    "emailAddress": "ramirez123445@gmail.com",
    "cellNumber": "",
    "createAt": null
}
```
## Encontrar por ID
Para encontrar una persona por su id, en la ruta `http://localhost:8080/api/person/`, al final debe agregar el id de la persona que busca para hacer la petición `GET` y obtener la información buscada.

## Encontrar Todos
Para obtener todas las personas, debe hacer la petición `GET` desde la ruta `http://localhost:8080/api/person/all` y así obtener la información buscada.

## Encontrar Todos Upper Case
Para obtener todas las personas con nombre en mayúsculas, debe hacer la petición `GET` desde la ruta `http://localhost:8080/api/person/all-upper-case` y así obtener la información buscada.


