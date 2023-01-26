# REST API app

> Build of a REST API app With Spring Boot and MySQL

# Tests
```
curl -X POST -H 'Content-Type: application/json' localhost:8000/tasks --data '{"name":"Menu Segunda","description":"As descrições devem ser calorosas e transmitir a alma do restaurante. Elas precisam cativar o cliente e ...", "status":"DONE", "dueDate":""}'
curl -X POST -H 'Content-Type: application/json' localhost:8000/tasks --data '{"name":"Menu Terça","description":"As descrições devem ser calorosas e transmitir a alma do restaurante. Elas precisam cativar o cliente e ...", "status":"DONE", "dueDate":""}'

curl localhost:8000/tasks

curl localhost:8000/tasks/2
```
