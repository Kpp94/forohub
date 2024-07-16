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
Ya con nuestro token generado realizaremos el siguiente request que sera registrar un topico para lo cual usaremos la siguiente URL: http://localhost:8080/topicos  

## Datos a considerar <img src="https://w7.pngwing.com/pngs/973/727/png-transparent-amplifier-owner-s-manual-product-manuals-sign-electric-potential-difference-importance-thumbnail.png" width="30px">
- Si se selecciona una opcion fuera de las mostradas en el menu, se mostrara una alerta mencionando que la opcion no es valida.
- No se pueden registrar dos veces el mismo libro.
- Se pueden consutlar varios libros de un mismo autor.
- La consulta de libros por idioma se usa escribiendo las dos letras del idioma con base a la norma ISO 639-1

<h5>Autor. Kevin Pérez Pérez</h5>
