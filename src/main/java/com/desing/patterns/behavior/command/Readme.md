## Command 馃攷

Convierte una solicitud en un objeto independiente que contiene toda la informaci贸n sobre la solicitud. Esta transformaci贸n permite parametrizar m茅todos con diferentes solicitudes, retrasar o poner en cola la ejecuci贸n de una solicitud y respaldar operaciones que no se pueden deshacer.

Nos permite solicitar operaciones a objetos sin conocer realmente el contenido de 茅stas.

### El Problema 馃え

Un simple programa puede ejecutar decenas de invocaciones a subprocesos o subprogramas. En ocasiones es muy conveniente desacoplar la invocaci贸n de determinados procesos del contexto donde se encuentran, y 茅sto es precisamente el problema que viene a solucionar el patr贸n Command.

Adem谩s pueden surgir situaciones en las que las invocaciones deban de tratarse por medio de una cola, pila o estructura de datos similar. Mediante el patr贸n Command podemos realizar estas acciones de manera sencilla.

#### Se Aplica cuando:

- Precisamos de colas, pilas u otras estructuras para gestionar las invocaciones.
- Exista la posibilidad de cancelar operaciones.
- Se necesite parametrizar de manera uniforme las invocaciones.
- El momento de ejecuci贸n del subprograma o subproceso deba de ser independiente del contexto en el que se invoca.
- Necesitemos realizar llamadas a 贸rdenes cuyos par谩metros puedan ser otras 贸rdenes (callbacks).
- Las 贸rdenes que debemos desarrollar son de alto nivel y por debajo son implementadas por 贸rdenes simples (primitivas).

<p align="center"> 
  <img src="./sincommand.png" width=80%>
  <img src="./command.png" width=80%>
</p>

### La soluci贸n 馃

La soluci贸n consiste en crear una interfaz Command que contenga un m茅todo execute, permitiendo desde la misma ejecutar la operaci贸n a la que representa el comando. Adicionalmente, si se permite deshacer operaciones, deberemos a帽adir un m茅todo undo para poder hacerlo.

### UML 馃棑
<p align="center"> 
  <img src="./command.jpg" width=80%>
</p>

### Consecuencias 馃対

#### Positivas

- Desacoplamiento de la aplicaci贸n que invoca las 贸rdenes y la implementaci贸n de las mismas.
- Como las 贸rdenes son objetos, podemos aplicar la herencia a las mismas o realizar composiciones de 贸rdenes.
- El conjunto de 贸rdenes es escalable.
- Permite modificar las 贸rdenes a ejecutar en tiempo de ejecuci贸n.

#### Negativas

- Aumenta el volumen de nuestro c贸digo.

### Links de inter茅s 馃摎

- https://refactoring.guru/es/design-patterns/behavioral-patterns
- https://programacion.net/articulo/patrones_de_diseno_xv_patrones_de_comportamiento_command_1018
- https://github.com/mrugerio/myHelloWorldJava