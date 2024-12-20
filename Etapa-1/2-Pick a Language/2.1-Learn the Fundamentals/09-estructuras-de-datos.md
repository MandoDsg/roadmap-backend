# Estructuras de Datos en Java

Las estructuras de datos son fundamentales en la programación, ya que permiten organizar, almacenar y manipular datos de manera eficiente. En Java, las estructuras de datos ofrecen diferentes formas de gestionar información dependiendo del caso de uso. Comprender cómo funcionan es esencial para escribir programas efectivos y escalables.

En esta parte exploraremos las estructuras de datos más comunes, sus características, funcionamiento, casos de uso y ejemplos prácticos, para ofrecer una guía completa y fácil de entender.

## ¿Qué son las estructuras de datos?

Las estructuras de datos son técnicas para organizar datos en la memoria de un ordenador, de modo que puedan ser utilizados de forma eficiente. Por ejemplo, cuando necesitas almacenar listas de elementos, realizar búsquedas rápidas o mantener un historial, las estructuras de datos permiten lograr estas tareas de forma óptima. Dependiendo del problema a resolver, algunas estructuras de datos son más adecuadas que otras.

Por ejemplo:
- Una lista de nombres puede almacenarse en un **array**.
- Un historial de acciones puede gestionarse con una **pila**.
- Una red social puede representarse mediante un **grafo**.

En Java, las estructuras de datos pueden ser divididas en **estructuras lineales** (como arreglos y listas enlazadas) y **estructuras no lineales** (como árboles y grafos). También incluyen colecciones más avanzadas como pilas, colas y tablas hash.

### Clasificación general de las estructuras de datos
1. **Estructuras de datos lineales:**  
   Los elementos se almacenan secuencialmente. Ejemplos: arrays, listas enlazadas, pilas y colas.

2. **Estructuras de datos no lineales:**  
   Los elementos se organizan en jerarquías o conexiones arbitrarias. Ejemplos: árboles y grafos.

3. **Estructuras de datos dinámicas:**  
   Su tamaño puede cambiar durante la ejecución del programa. Ejemplo: listas enlazadas, colas.

4. **Estructuras de datos estáticas:**  
   Tienen un tamaño fijo definido en tiempo de compilación. Ejemplo: arrays.

## Estructuras de Datos Comunes en Java

A continuación, exploramos en detalle las estructuras de datos más comunes en Java, sus características, funcionamiento, casos de uso y ejemplos.

### 1. Arreglos (Arrays)

Un array es una estructura de datos que almacena un conjunto de elementos del mismo tipo en memoria contigua. Los arrays tienen un tamaño fijo y se accede a sus elementos mediante índices.

**Características:**
- Los datos son homogéneos.
- El tamaño es fijo y debe definirse al momento de la creación.
- Los elementos se almacenan en ubicaciones consecutivas de memoria.
- El acceso a los elementos es rápido gracias al uso de índices.

**Ejemplo:**
```java
int[] numeros = {1, 2, 3, 4, 5};
System.out.println("Elemento en la posición 2: " + numeros[1]); // Salida: 2
```
**Ventajas:**
- Acceso rápido a cualquier elemento mediante índices.
- Ocupan menos memoria en comparación con otras estructuras.

**Desventajas:**
- Tamaño fijo que no puede cambiar dinámicamente.
- La inserción y eliminación de elementos puede ser costosa.

**Caso de uso:** Un array es útil para almacenar datos de tamaño fijo o conocido, como una lista de calificaciones o una matriz.

### 2. Listas Enlazadas (Linked Lists)

Una lista enlazada es una estructura de datos en la que cada elemento (nodo) contiene un valor y una referencia al siguiente nodo. Esto permite añadir o eliminar elementos fácilmente, pero no ofrece acceso directo a través de índices.

**Características:**
- Los datos pueden ser heterogéneos (dependiendo del tipo de nodo).
- La inserción y eliminación son rápidas.
- No requiere un tamaño fijo como un array.
- Tamaño dinámico, lo que permite añadir o eliminar elementos fácilmente.
- No permite acceso directo; requiere recorrer la lista para encontrar elementos.

**Ejemplo:**
```java
import java.util.LinkedList;

LinkedList<String> nombres = new LinkedList<>();
nombres.add("Ale");
nombres.add("Angel");

System.out.println("Lista de nombres: " + nombres);
```

**Ventajas:**
- Inserciones y eliminaciones son rápidas.
- No requiere memoria contigua.

**Desventajas:**
- Acceso más lento en comparación con arrays.
- Consume más memoria debido a las referencias adicionales.

**Caso de uso:** Se utiliza cuando es necesario realizar muchas inserciones o eliminaciones, como en una lista de tareas dinámicas, listas de reproducción de música, implementaciones de cachés.

### 3. Pilas (Stacks)

Una pila es una estructura de datos que sigue el principio Last In First Out (LIFO), lo que significa que el último elemento en entrar es el primero en salir.

**Características:**
- Se utiliza para gestionar datos en el orden inverso al que se insertaron.
- Los métodos principales son `push` (insertar), `pop` (eliminar) y `peek` (consultar el elemento superior).
- Implementada en Java a través de la clase `Stack`.

**Ejemplo:**
```java
import java.util.Stack;

Stack<Integer> pila = new Stack<>();
pila.push(10);
pila.push(20);
pila.push(30);

System.out.println("Elemento en la parte superior: " + pila.peek()); // 30
pila.pop();
System.out.println("Pila después de eliminar el último elemento: " + pila.peek()); // 10
```

**Ventajas:**
- Fácil de implementar.
- Ideal para problemas recursivos.

**Desventajas:**
- Acceso restringido; sólo el tope es accesible directamente.

**Caso de uso:** Las pilas se utilizan para manejar historial de navegación, expresiones matemáticas o control de llamadas recursivas.

### 4. Colas (Queues)

Una cola es una estructura de datos que sigue el principio First In First Out (FIFO), donde el primer elemento en entrar es el primero en salir.

**Características:**
- Métodos principales: `add` (añadir), `poll` (eliminar).
- Inserción en el final (cola) y eliminación desde el inicio (cabeza).
- Implementada frecuentemente con las interfaces `Queue` o `Deque` en Java.

**Ejemplo:**
```java
import java.util.LinkedList;
import java.util.Queue;

Queue<String> cola = new LinkedList<>();
cola.add("Cliente1");
cola.add("Cliente2");
cola.add("Cliente3");

System.out.println("Atendiendo a: " + cola.poll()); // Elimina y retorna el primer elemento
System.out.println("Clientes en espera: " + cola);
```

**Ventajas:**
- Eficiente para gestionar datos en orden.
- Sencilla de implementar.

**Desventajas:**
- No permite acceso aleatorio a los elementos.

**Caso de uso:** Las colas son útiles para sistemas de espera, como manejo de solicitudes en un servidor o impresión en una cola de trabajos.

### 5. Tablas Hash (Hash Tables)

Una tabla hash almacena pares clave-valor y permite acceder a los datos mediante una clave única. En Java, la clase `HashMap` es una implementación común.

**Características:**
- Almacenamiento no ordenado basado en un hash.
- Rápida inserción, búsqueda y eliminación.
- Basada en el cálculo de un hash para localizar elementos.
- Las claves deben ser únicas.

**Ejemplo:**
```java
import java.util.HashMap;

HashMap<Integer, String> mapa = new HashMap<>();
mapa.put(1, "Uno");
mapa.put(2, "Dos");
mapa.put(3, "Tres");

System.out.println("Valor asociado a la clave 2: " + mapa.get(2)); // Dos
```

**Ventajas:**
- Búsqueda e inserción rápidas.
- Flexible para muchos casos de uso.

**Desventajas:**
- No garantiza el orden de los elementos.
- Puede haber conflictos de hash.

**Caso de uso:** Las tablas hash son ideales para almacenar datos de búsqueda rápida, como un directorio telefónico, gestión de inventarios.

### 6. Árboles (Trees)

Un árbol es una estructura jerárquica en la que cada nodo tiene un valor y referencias a nodos hijos. Los árboles binarios, en los que cada nodo tiene como máximo dos hijos, son los más comunes.

**Caso de uso:** Los árboles se utilizan en bases de datos, representaciones jerárquicas o algoritmos de búsqueda.

### 7. Grafos (Graphs)

Un grafo es una colección de nodos (vértices) y conexiones entre ellos (aristas). Es útil para modelar relaciones complejas.

**Caso de uso:** Los grafos son útiles para representar redes sociales, rutas en mapas o sistemas de recomendación.

---

## Conclusión

Las estructuras de datos son herramientas esenciales para cualquier programador, ya que permiten organizar y procesar datos de manera eficiente. Cada estructura tiene sus ventajas y casos de uso específicos, por lo que es importante elegir la adecuada según las necesidades del programa. Practica utilizando estas estructuras en diferentes contextos para comprender mejor su funcionamiento y aplicaciones.

---

## Recursos recomendados por [roadmap.sh](https://roadmap.sh/java)

1. **[Data Structure Introduction - Javatpoint](https://www.javatpoint.com/data-structure-introduction)**  
   Este artículo de Javatpoint proporciona una introducción detallada a las estructuras de datos, explicando los conceptos básicos y su importancia en la programación.

2. **[Data Structures and Algorithms Playlist - YouTube](https://www.youtube.com/playlist?list=PLkZYeFmDuaN2-KUIv-mvbjfKszIGJ4FaY)**  
   Esta lista de reproducción de YouTube incluye varios videos sobre estructuras de datos y algoritmos, proporcionando una serie de tutoriales paso a paso.
---

## Recursos recomendados por mí

Para complementar tu aprendizaje, también recomiendo estos recursos adicionales:

1. **[ArrayList - W3Schools](https://www.w3schools.com/java/java_arraylist.asp)**  
   Guía sobre el uso de `ArrayList` en Java. Este recurso explica cómo declararlo, agregar elementos, y cómo modificar la lista.

2. **[LinkedList - W3Schools](https://www.w3schools.com/java/java_linkedlist.asp)**  
   En este artículo aprenderás sobre la clase `LinkedList` de Java. El recurso cubre los métodos y operaciones disponibles en una lista enlazada.

3. **[HashMap - W3Schools](https://www.w3schools.com/java/java_hashmap.asp)**  
   Este tutorial explica cómo usar `HashMap` en Java, que es una implementación de la estructura de datos de tabla hash. El artículo cubre operaciones como agregar, obtener y eliminar elementos en un `HashMap`.