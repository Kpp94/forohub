# ForoHub <img src="https://e7.pngegg.com/pngimages/658/936/png-clipart-internet-forum-computer-icons-online-chat-discussion-forum.png" width="30px">

Para este Challenge de Alura Latam se presenta una API Rest con la tematica de un foro de dudas, en la cual los usuarios podran:
- Realizar topicos
- Contestar topicos
- Actualizar topicos
- Eliminar topicos

Todo esto junto con un sistema de usuarios y contraseñas los cuales daran un token de autenticacion para poder realizar los request mencionados anteriormente.


## Caracteristicas 

- Lenguaje de programacion Java
- Insomnia Rest para los Request
- Base de Datos MySQL 


## Preparando el Ambiente <img src="https://cdn-icons-png.flaticon.com/512/2071/2071756.png" width="30px">

- Descargue el proyecto desde el repositorio.
- Cree su base de Datos en MySQL
- Modifique sus variables de entorno para poder hacer la conexión a la base de datos
- Ejecute el archivo el su IDE de preferencia.
- Ejecute el archivo ForoHubApplication del proyecto.

## Funcionalidad
Una vez ejecutado el programa, iremos a la base de datos generada en MySQL Workbench donde en la tabla de usuarios registraremos un nuevo usuario y su respectiva contraseña en formato bcrypt.
<img src="https://github.com/Kpp94/forohub/blob/master/img/Usuario.png?raw=true" width="750px">

Dentro de la carpeta se encuentra un archivo ejecutable llamado **CreadorClave** en el cual podras generar tu propia clave en formato bcrypt y copiarla en la columna contraseña de la base de datos
<img src="https://github.com/Kpp94/forohub/blob/master/img/gurdar_contra.png?raw=true" width="750px">

Con el programa ForoHubApplication ejecutado iremos a insmonia y creaermos un nuevo proyecto donde haremos los request de los topicos.

## Login de Usuario
Lo primero que haremos sera hacer el Login del usuario asi que crearemos un nuevo Request con el metodo Post y la siguiente URL: **http://localhost:8080/login**
en el Body del request en formato json ingresaremos los siguientes datos

  `"login": "nombre registrado",`
	`"password": "contraseña sin formato hash (bcrypt)"`
 
 <img src="https://github.com/Kpp94/forohub/blob/master/img/validar_usuario.png?raw=true">

 Al ingresar correctamente los datos igual que en la base de datos obtendremos un status 200 ok y nos generara un token.

 <img src="https://github.com/Kpp94/forohub/blob/master/img/token_generado.png?raw=true" width="750px">

 ## Registrar Topico
Ya con nuestro token generado realizaremos el siguiente request que sera registrar un topico con el metodo Post para lo cual usaremos la siguiente URL: http://localhost:8080/topicos.
antes de ir directamente al registro del topico iremos a la pestaña Auth y seleccionaremos la opcion Bearer Token, en el apartado que dice TOKEN pegaremos el previamente generado al hacer el login del usuario, (este paso lo haremos en cada requeste nuevo que hagamos).

Para hacer el registro del Topico llenaremos los siguientes datos:

{
	"titulo": "titulo",
	"mensaje": "pregunta o mensaje",
	"curso": "nombre del curso en mayuscula"
}

y le daremos en enviar (send).

<img src="https://github.com/Kpp94/forohub/blob/master/img/registrar_topico.png?raw=true" width="750px">

nos dara un status 201 created y nos mostrara los datos de nuestro topico ademas de la fecha de creacion del mismo.

<img src="https://github.com/Kpp94/forohub/blob/master/img/topico_registrado.png?raw=true">

## Listar Topicos
El siguiente request sera con el metodo Get y sera para listar los topicos registrados en la misma URL: http://localhost:8080/topicos
solo daremos enviar y nos mostrara todos los topicos registrados con su Id generado automaticamente.

<img src="https://github.com/Kpp94/forohub/blob/master/img/listar_topicos.png?raw=true" width="750px">

## Listar Topico especifico
El siguiente request al igual que el anterior sera un metodo Get donde listaremos un topico especifico para lo cual la URL utilizada sera la siguiente http://localhost:8080/topicos/{id}
donde **{id}** sera sustituido por el numero id del topico que queremos consultar (en este ejemplo el topico recien generado recibio como id el numero 4)

<img src="https://github.com/Kpp94/forohub/blob/master/img/listar_topico_especifico.png?raw=true" width="750px">

## Eliminar Topico
Para el siguiente request utilizaremos el metodo Delete para borrar un topico especifico, la URL a utilizar sera la siguiente: http://localhost:8080/topicos/{id}
donde de igual manera **{id}** sera remplazado por el topico que queremos eliminar al dar enviar recibiremos un status 204 por lo cual el topico sera eliminado de la base de datos.

<img src="https://github.com/Kpp94/forohub/blob/master/img/borrar_topico.png?raw=true" width="750px">

y al volver a listar los topicos observaremos que el topico previamente eliminado ya no aparecera.

<img src="https://github.com/Kpp94/forohub/blob/master/img/topico_borrado.png?raw=true" width="750px">

## Datos a considerar <img src="https://w7.pngwing.com/pngs/973/727/png-transparent-amplifier-owner-s-manual-product-manuals-sign-electric-potential-difference-importance-thumbnail.png" width="30px">
- Todos los usuarios deben estar autenticados para poder realizar las consultas.
- No se pueden repetir titulos en el mismo curso
- Se puede actualizar cualquier topico con un metodo PUT solo se necesita escribir el id del topico y el mensaje actualizado
  <img src="https://github.com/Kpp94/forohub/blob/master/img/actualizar_topico.png?raw=true" width="700px">

<h5>Autor. Kevin Pérez Pérez</h5>
