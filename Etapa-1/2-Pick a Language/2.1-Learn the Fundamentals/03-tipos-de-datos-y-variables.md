# Tipos de Datos y Variables en Java

En Java, las **variables** son contenedores de datos que almacenan valores durante la ejecución de un programa. Cada variable se asigna a un **tipo de dato**, el cual especifica el tipo y la cantidad de valores que puede almacenar. En términos simples, una variable en Java puede verse como un nombre de ubicación en la memoria, donde se almacena un dato. 

### Tipos de Variables en Java

En Java, las variables se dividen en tres categorías principales según su alcance y la forma en que se utilizan:

1. **Variables locales:** 
   - Son aquellas que se declaran dentro de un método o bloque de código. 
   - Solo son accesibles dentro de ese método o bloque.
   - Se crean cuando el método o bloque comienza y se destruyen cuando el método o bloque finaliza.
   - Ejemplo: Variables dentro de un método.
    ```java
   public class EjemploLocal {
       public static void main(String[] args) {
           // Variable local
           int numero = 10;
           System.out.println("Número local: " + numero);
       }
   }
    ```
2. **Variables de instancia**:
   - Son variables declaradas dentro de una clase, pero fuera de los métodos.
   - Estas variables están asociadas con las instancias (objetos) de la clase.
   - Cada objeto creado a partir de la clase tendrá su propio valor para estas variables.
   - Ejemplo: Variables dentro de una clase, pero fuera de los métodos.
    ```java
   public class Persona {
       // Variable de instancia
       String nombre;
       int edad;
   
       public Persona(String nombre, int edad) {
           this.nombre = nombre;
           this.edad = edad;
       }

       public void mostrarInfo() {
           System.out.println("Nombre: " + nombre + ", Edad: " + edad);
       }
   }

   public class Main {
       public static void main(String[] args) {
           // Crear un objeto de la clase Persona
           Persona persona1 = new Persona("Juan", 30);
           persona1.mostrarInfo();
       }
   }
    ```
3. **Variables estáticas**:
   - Son variables que se asocian con la propia clase, no con las instancias (objetos) de la clase.
   - Todas las instancias de la clase comparten la misma variable estática.
   - Son útiles para almacenar información que debe ser común a todos los objetos de la clase.
   - Ejemplo: Variables dentro de una clase marcada con la palabra clave `static`.
    ```java
   public class Contador {
       // Variable estática
       static int cuenta = 0;
   
       public Contador() {
           cuenta++;
       }

       public static void mostrarCuenta() {
           System.out.println("Cuenta: " + cuenta);
       }
   }

   public class Main {
       public static void main(String[] args) {
           // Crear objetos, la variable cuenta es compartida
           Contador c1 = new Contador();
           Contador c2 = new Contador();
           Contador.mostrarCuenta(); // Muestra: Cuenta: 2
       }
   }
    ```
    
## Tipos de Datos en Java

Los **tipos de datos** en Java se dividen en dos grandes categorías: **primitivos** y **no primitivos**.

### Tipos de Datos Primitivos

Los tipos de datos primitivos son aquellos que están definidos directamente por el lenguaje de programación y no pueden descomponerse en tipos más pequeños. Son los bloques básicos para construir tipos de datos más complejos. Los tipos primitivos en Java son:

1. **byte**:
   - Un entero de 8 bits con un rango de valores de -128 a 127.
   - Ideal para ahorrar memoria cuando se trabaja con grandes cantidades de datos numéricos pequeños.
   - Ejemplo: `byte edad = 27;`

2. **short**:
   - Un entero de 16 bits con un rango de valores de -32,768 a 32,767.
   - Similar a `byte`, pero con un rango de valores más amplio.
   - Ejemplo: `short temperatura = 17;`

3. **int**:
   - Un entero de 32 bits con un rango de valores de -2^31 a 2^31-1.
   - Es el tipo de dato más común para almacenar números enteros en Java.
   - Ejemplo: `int precio = 5;`

4. **long**:
   - Un entero de 64 bits con un rango de valores de -2^63 a 2^63-1.
   - Se usa cuando el rango de `int` no es suficiente para los valores que se desean almacenar.
   - Ejemplo: `long distancia = 9876543210L;` (Se debe agregar la letra `L` al final de un número largo).

5. **float**:
   - Un número de punto flotante de 32 bits.
   - Se usa para representar números decimales con menor precisión. Precisión de 6-7 dígitos significativos.
   - Ejemplo: `float piFloat = 3.1415927f;` (Se debe agregar la letra `f` al final de un número float).

6. **double**:
   - Un número de punto flotante de 64 bits.
   - Se utiliza para representar números decimales con mayor precisión que `float`. Precisión de 15-16 dígitos significativos.
   - Ejemplo: `double piDouble = 3.141592653589793;`

7. **boolean**:
   - Representa valores de verdad, solo puede ser `true` o `false`.
   - Se usa para controlar el flujo de ejecución en las estructuras condicionales y de control.
   - Ejemplo: `boolean esVerdadero = true;`, `boolean esFalso = false;`

8. **char**:
   - Representa un solo carácter de 16 bits, basado en Unicode.
   - Se utiliza para almacenar caracteres y símbolos.
   - Ejemplo: `char letra = 'A';`

### Tipos de Datos No Primitivos

Los tipos de datos no primitivos en Java son más complejos y pueden contener más de un valor. Algunos ejemplos de estos son:

1. **String**:
   - Una secuencia de caracteres, utilizada para representar texto.
   - Se trata como un objeto, pero es inmutable.
   - Ejemplo: `String nombre = "Angel";`

2. **Arrays**:
   - Una colección de elementos del mismo tipo. Los arrays en Java son de tamaño fijo una vez que se declaran.
   - Ejemplo: `int[] numeros = {1, 2, 3, 4, 5};`

3. **Clases**:
   - Las clases son los planos para crear objetos. Definen las propiedades (variables) y los comportamientos (métodos) de los objetos.
   - Ejemplo de clase:
    ```java
     class Persona {
         String nombre;
         int edad;
     
         void mostrarInfo() {
             System.out.println("Nombre: " + nombre + ", Edad: " + edad);
         }
     }
    ```
4. **Enums**:
   - Son tipos de datos especiales que representan un conjunto fijo de constantes, como los días de la semana o los estados de un proceso.
   - Ejemplo:
    ```java
     enum Dia {
         LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
     }
    ```
5. **Records**:
   - Introducidos en Java 14, los records son clases inmutables que proporcionan una forma concisa de crear clases de datos.
   - Ejemplo de record:
    ```java
     record Persona(String nombre, int edad) {}
    ```

## Declaración y Asignación de Variables

La **declaración de variables** en Java sigue una sintaxis específica:

```java
tipoDeDato nombreDeVariable;
```

Donde `tipoDeDato` es el tipo de variable (como `int`, `String`, `boolean`), y `nombreDeVariable` es el nombre que se le asignará a la variable.

Después de declarar una variable, puedes **asignarle un valor** usando el operador de asignación `=`:

```java
nombreDeVariable = valor;
```

También puedes declarar y asignar un valor a la vez:

```java
int edad = 30;
```

## Ejemplos de Declaración de Variables

### Ejemplo 1: Declaración y Asignación de Variables Primitivas

```java
public class EjemploVariables {
    public static void main(String[] args) {
        // Variables primitivos
        int numero = 24;
        double precio = 11.03;
        boolean esActivo = true;
        char letra = 'A';

        System.out.println("Número: " + numero);
        System.out.println("Precio: " + precio);
        System.out.println("Activo: " + esActivo);
        System.out.println("Letra: " + letra);
    }
}
```

### Ejemplo 2: Declaración y Asignación de Variables No Primitivas

```java
public class EjemploString {
    public static void main(String[] args) {
        // Variables no primitivas
        String saludo = "Hola Mundo";
        String[] dias = {"Lunes", "Martes", "Miércoles"};

        System.out.println(saludo);
        for (String dia : dias) {
            System.out.println(dia);
        }
    }
}
```

## Conclusión

Entender los **tipos de datos** y las **variables** en Java es fundamental para comenzar a programar, ya que constituyen la base sobre la cual construirás aplicaciones más complejas. Los tipos de datos primitivos te permiten almacenar información básica y eficiente en la memoria, mientras que los tipos no primitivos te permiten trabajar con estructuras más complejas y objetos. 

El conocimiento de cómo se gestionan las variables y cómo se elige el tipo de dato adecuado es crucial para escribir código eficiente y comprensible. Además, entender las diferencias entre los tipos de datos te permitirá optimizar el uso de la memoria y mejorar el rendimiento de tus aplicaciones.

---

## Recursos recomendados por [roadmap.sh](https://roadmap.sh/java)

Aquí tienes algunos recursos que te ayudarán a profundizar en los tipos de datos y variables en Java:

1. **[Java Variables - Guru99](https://www.guru99.com/java-variables.html)**  
   Este artículo proporciona una explicación completa de las variables en Java, incluyendo cómo se declaran, cómo se utilizan y sus distintos tipos.

2. **[Java Data Types - JavaTpoint](https://www.javatpoint.com/java-data-types)**  
   Un recurso excelente para entender los tipos de datos primitivos y no primitivos en Java, con ejemplos prácticos que te ayudarán a comprender mejor cómo se manejan los datos en el lenguaje.

3. **[Enum in Java - Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)**  
   La documentación oficial de Oracle sobre las enumeraciones (`enums`) en Java, un tipo de dato especial utilizado para definir un conjunto de constantes.

4. **[Java Record Keyword - Baeldung](https://www.baeldung.com/java-record-keyword)**  
   Un artículo de Baeldung que cubre el uso de la palabra clave `record` en Java, introducida en Java 14, para crear clases inmutables de manera concisa.

---

## Recursos recomendados por mí

Para complementar o reforzar lo aprendido, te sugiero los siguientes recursos adicionales:

1. **[Java Language Basics - Oracle](https://dev.java/learn/language-basics/)**  
   El sitio oficial de Oracle ofrece una guía completa sobre los fundamentos del lenguaje Java, ideal para entender mejor el tema.

2. **[Java Variables - W3Schools](https://www.w3schools.com/java/java_variables.asp)**  
   Este artículo de W3Schools te proporciona una introducción básica a las variables en Java, cubriendo cómo se declaran y cómo se utilizan.

3. **[Java Data Types - W3Schools](https://www.w3schools.com/java/java_data_types.asp)**  
   Un recurso útil de W3Schools que explica todos los tipos de datos disponibles en Java, tanto primitivos como no primitivos, con ejemplos claros.