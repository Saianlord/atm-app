<h1>INSTRUCCIONES PARA COLABORAR</h1>

<h2>Github: <h2>

Para iniciar a trabajar en sus tasks, por favor sigan los siguiente pasos:

1. Asegurense de tener Git instalado en sus computadoras<br><br>
2. Abran la terminal de su preferencia y ejecuten el comando <span style="color:brown">cd Desktop</span>. Esto hará que la terminal se coloque en la carpeta Escritorio<br><br>
3. Estando en la carpeta escritorio, ejecuten el comando <span style="color:brown">git clone https://github.com/Saianlord/atm-app.git</span> este comando les clonara el repositorio remoto en su Escritorio<br><br>
4. Una vez tengan el proyecto en su escritorio, ejecuten el siguiente comando <span style="color:brown">cd atm-app </span> esto hará que la terminal se coloque dentro del proyecto<br><br>
5. Una vez dentro del proyecto, tienen que crear una nueva rama para trabajar, para esto ejecutan el siguiente comando <span style="color:brown">git checkout -b nombre-de-la-rama</span>. Al definir el nombre de la rama sigan esta convencion: <span style="color:yellow">feature/nombre-funcionalidad><br><br>

Cuando estén listos para actualizar el repositorio remoto con sus cambios, sigan los siguientes pasos:
1. Ejecuten el comando <span style="color:brown">git add . </span> (El punto es parte del comando)<br><br>
2. Ejecuten el comando <span style="color:brown">git commit -m "Descripción de los cambios"</span><br><br>
3. Ejecuten el comando <span style="color:brown">git push -u origin nombre-de-la-rama</span> (el nombre de la rama que ustedes definieron)<br><br>

Estos pasos lo que hacen es subir los cambios que hicieron a la rama que ustedes crearon. Para que puedan combinarla con la rama principal, tienen que seguir los siguientes pasos:
1. Vayan al repositorio en GitHub<br><br>
2. Van a ver una opción para crear un Pull Request desde la rama que crearon.<br><br>
3. Sigan las instrucciones para solicitar la revisión de sus cambios y fusionarlos con la rama principal.<br><br>


<h2>Estructura del proyecto<h2>

<h3 style="color:orange;">Models<h3>
Las clases de este paquete representan los elementos que se guardan en la base de datos y sus atributos, 
por lo tanto van a notar que cada una de las clases tiene muy poca lógica o casi nada, ya que lo único para lo que sirven estas clases es
para poder ubicar la información que obtenemos de la base de datos y poder usarla en el programa. Normalmente en un programa si quisieramos actualizar un usuario,
consultaríamos la base de datos por ese usuario y si existe, lo reconstruiríamos extrayendo cada uno de los atributos de Usuario de la base de datos y colocandolos una nueva instancia del modelo usuario en Java,
después actualizaríamos el objeto en java, y volveríamos a guardarlo en la base de datos con las actualizaciones hechas.

<h3 style="color:orange;">Repositories<h3>
Las clases en este paquete representan las clases que interactúan con cada una de las tablas de la base de datos
o los registros en general. Por ejemplo, UsuarioRepository se encarga del CRUD de Usuarios, en otras palabras,
de Crear, Leer, Actualizar y borrar Usuarios. Sin embargo, aquí solo implementamos las funciones básicas, es decir, si vamos a crear un nuevo usuario, el repositorio contendria la logica
para insertarlo en la base de datos, pero todo lo que son las verificaciones de que el nombre de usario no esté repetido y cosas como esas, se verifican en las clases Servicios. 
Vean la siguiente sección para entender

<h3 style="color:orange;">Services<h3>
Las clases servicios llaman a los métodos de la clase Repositorio para interactuar con la base de datos, es decir, siempre es la 
clase repositorio la que tiene el contacto directo con la base de datos, pero la clase servicio implementa la lógica de negocio.
Por ejemplo, si los nombres de usuario tienen que tener un largo en específico, o si hay que checkear el formato de la cédula, etc., 
todo esto iría en esta capa.

<h3 style="color:orange;">Util<h3>
Esto si es muy relativo y depende de cada quien. Bueno, forma en la que se organizan los archivos en general es subjetiva, las secciones anteriores son como un estandar.
En Util se puede agregar todas aquellas clases que nos proporcionan herramientas que necesitemos pero que no forman parte de las otras categorías,
en este caso tenemos la clase que crea la conexión a la base de datos aqui. Por lo cual, todos los repositories tienen que usar esta clase para establecer una conexión con la base de datos.
El cómo nos conectemos a la base de datos va a depender de si estamos usando un archivo o un motor de base de datos.

<h3 style="color:orange;">GUI<h3>
Aquí van todas las clases de la interfaz gráfica. No más comentarios.

<h3 style="color:orange;">Exceptions<h3>
Aqui todas las excepciones personalizadas que queramos crear para definir los errores.





