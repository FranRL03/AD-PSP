# AD-PSP

GET:
si todo sale bien te debe devolver un "200 OK"
si sale mal sale "404 Not Found"

Post: 
si sale bien "201 Created"
si sale mal "400 Bad Request"

Put:
si encuentro y edito sale "200 OK"
si enceuntro pero no edito porque los datos no son correctos "400 Bad Request"
si sale mal "404 Not Found"

Delete:
haga lo que haga devuelve un "204 todo va bien pero el cuerpo de la respuesta va vacío"
