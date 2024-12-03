# Sintaxis Básica de Java

Comprender la sintaxis básica de Java es el primer paso para construir una base sólida en este lenguaje de programación. La claridad y estructura de Java permiten desarrollar aplicaciones robustas y escalables en una variedad de dominios, desde aplicaciones móviles hasta sistemas empresariales. En esta sección, exploraremos conceptos fundamentales, convenciones de nomenclatura, palabras clave reservadas, expresiones, sentencias y otras características esenciales que todo desarrollador debe dominar.


## Introducción a la Sintaxis Básica

Java tiene una sintaxis clara y estructurada diseñada para ser comprensible y legible. Este enfoque facilita la escritura y el mantenimiento de código, incluso para proyectos complejos.

La sintaxis de Java se inspira en lenguajes como C y C++, lo que la hace familiar para quienes tienen experiencia previa en esos lenguajes. Sin embargo, Java introduce una estructura simplificada y estricta que ayuda a minimizar errores comunes.

Un programa en Java siempre está contenido dentro de una clase, y el método `main` sirve como punto de entrada.

### Estructura de un Programa en Java

Un programa en Java generalmente sigue esta estructura básica: 

```java
public class MiPrimeraClase {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
    }
}
```

**Descripción:**
- `public class MiPrimeraClase`: Define una clase pública llamada `MiPrimeraClase`.
- `public static void main(String[] args)`: Es el método principal donde comienza la ejecución del programa.
- `System.out.println("¡Hola, mundo!");`: Imprime texto en la consola.

## Convenciones de Nomenclatura

Seguir las convenciones estándar de Java mejora la legibilidad y consistencia del código. Estas son algunas de las reglas clave:

#### 1. **Clases:**
  - Nombres en **PascalCase**. 
  - Por ejemplo: `MiPrimeraClase`, `GestorDeArchivos`, `Empleado`.
#### 2. **Métodos y Variables:** 
  - Nombres en **camelCase**.
  - Por ejemplo: `obtenerDatos`, `numeroDeElementos`, `calcularPromedio`.
#### 3. **Constantes:** 
  - Se escriben en **mayúsculas con guiones bajos**.
  - Por ejemplo: `PI`, `VALOR_MAXIMO`, `MAX_USUARIOS`.

## Palabras Clave Reservadas

Java tiene un conjunto de palabras clave reservadas que no pueden usarse como nombres de variables, métodos o clases. Algunas de las más comunes incluyen:

- **Control de flujo:** `if`, `else`, `switch`, `case`, `for`, `while`, `do`.
- **Declaraciones:** `class`, `interface`, `enum`, `extends`, `implements`.
- **Tipos primitivos:** `int`, `char`, `boolean`, `float`, `double`.
- **Modificadores de acceso:** `public`, `private`, `protected`, `static`, `final`, `abstract`.

Ejemplo de uso de palabras clave:

```java
public class EjemploPalabrasClave {
    public static void main(String[] args) {
        int numero = 11; // Declaración de variable
        if (numero > 6) {
            System.out.println("El número es mayor que 6.");
        }
    }
}
```

## Entrada y Salida Básica

### Imprimir Salida

Para mostrar mensajes o resultados en la consola, utiliza `System.out.println()`:

```java
System.out.println("Este es un mensaje de ejemplo");
```
Puedes usar concatenación para combinar texto y valores:
```java
int edad = 25;
System.out.println("Tu edad es: " + edad);
```

### Tomar Entrada del Usuario

Java ofrece múltiples maneras de recibir entrada del usuario. Las más comunes son las clases `Scanner` y `BufferedReader`.

**Usando `Scanner`:**

```java
import java.util.Scanner;

public class EntradaEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre + "!");
    }
}
```

**Usando `BufferedReader`:**

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EntradaBuffered {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingresa tu edad: ");
        String edad = reader.readLine();
        System.out.println("Tienes " + edad + " años.");
    }
}
```

## Expresiones y Sentencias

- **Expresiones:** Son combinaciones de variables, operadores y valores que producen un resultado.
  - Por ejemplo: `a + b`, `x > y`.
- **Sentencias:** Son instrucciones completas que terminan con un punto y coma.
  - Por ejemplo: `System.out.println("Hola");`.

## Comentarios
Los comentarios son esenciales para documentar el código y hacerlo más comprensible, estos son ignorados por el compilador.
1. Comentario de una línea:
```java
// Esto es un comentario de una línea
```
2. Comentario de múltiples líneas:
```java
/*
 Este es un comentario
 de múltiples líneas
 */
```
3. Comentarios de documentación:
```java
/*
 * Este método imprime un saludo.
 */
public void saludar() {
    System.out.println("¡Hola!");
}
```

## Uso de Paquetes

En Java, los paquetes organizan clases relacionadas en grupos lógicos. Por ejemplo, para usar la clase `Scanner`, debes importar su paquete correspondiente:

```java
import java.util.Scanner;
```
Si estás usando varias clases del mismo paquete, puedes usar * para importar todas:
```java
import java.util.*;
```

## Conclusión

En esta sección, hemos cubierto los aspectos básicos de la sintaxis de Java, incluidos: la estructura general del programa, las convenciones de nomenclatura, palabras clave reservadas, el manejo de entrada/salida, expresiones, sentencias y comentarios.

Estos fundamentos son esenciales para escribir programas efectivos y comprender conceptos más avanzados que exploraremos próximamente.

¡Estás listo para llevar tus habilidades en Java al siguiente nivel!

---

## Recursos recomendados por [roadmap.sh](https://roadmap.sh/java)

Aquí tienes algunos recursos que te ayudarán a profundizar en los fundamentos de Java y en la sintaxis básica del lenguaje:

1. **[Java Language Basics](https://dev.java/learn/language-basics/)**   
Este recurso oficial de Oracle ofrece una introducción completa a los fundamentos de Java, desde la sintaxis básica hasta conceptos avanzados. Es una excelente guía para comenzar con la programación en Java.

1. **[Video en YouTube: Java - Basic Syntax](https://www.youtube.com/watch?v=81piDKqPxjQ)**   
Un video muy popular que cubre los aspectos fundamentales de Java. Ideal para principiantes, proporciona una visión general de los conceptos básicos con ejemplos prácticos.

---

## Recursos recomendados por mí

Para complementar o reforzar lo aprendido, te sugiero los siguientes recursos adicionales:

1. **[Sintaxis básica de Java - W3Schools](https://www.w3schools.com/java/java_syntax.asp)**   
Este artículo de W3Schools te explica los fundamentos de la sintaxis de Java.

2. **[Salida en Java - W3Schools](https://www.w3schools.com/java/java_output.asp)**   
Este artículo cubre cómo mostrar información en la consola usando `System.out.println()`.

3. **[Salida numérica en Java - W3Schools](https://www.w3schools.com/java/java_output_numbers.asp)**   
Este artículo cubre cómo trabajar con salidas numéricas en Java.

1. **[Comentarios en Java - W3Schools](https://www.w3schools.com/java/java_comments.asp)**   
Este artículo cubre los diferentes tipos de comentarios en Java y cómo usarlos.