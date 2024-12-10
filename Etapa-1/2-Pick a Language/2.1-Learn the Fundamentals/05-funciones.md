# Funciones en Java

Las funciones (o métodos) son bloques de código diseñados para ejecutar tareas específicas dentro de un programa. En Java, las funciones son fundamentales, ya que permiten estructurar el código de forma más eficiente, reutilizable y comprensible. Siguen el principio **DRY (Don’t Repeat Yourself)**, lo que significa "No te repitas", promoviendo la creación de código modular y limpio.

## ¿Qué es una función?

En términos simples, una función es una unidad lógica dentro del programa que realiza una tarea específica. Las funciones pueden:

- Aceptar **entradas** (parámetros).
- Realizar una operación o conjunto de operaciones.
- Proporcionar un **resultado** (o no, dependiendo del tipo de función).

Por ejemplo, en lugar de escribir el mismo cálculo varias veces, puedes encapsular esa lógica en una función y simplemente llamarla cuando sea necesario.

## Componentes de una función en Java

### 1. **Definición de una función**
La definición de una función establece su comportamiento. Incluye su especificador de acceso, el tipo de dato que retorna, su nombre, parámetros opcionales y el cuerpo que contiene el código.

**Sintaxis general:**
```java
especificadorAcceso tipoDeDato nombreFuncion(parámetrosOpcionales) {
    // Cuerpo de la función
    return valor; // Opcional, dependiendo del tipo de dato
}
```
Por ejemplo, una función que calcula el área de un círculo podría definirse así:
```java
public static double calcularAreaCirculo(double radio) {
    return Math.PI * radio * radio;
}
```

### 2. **Llamada a una función**
Para usar una función, simplemente la llamas utilizando su nombre y pasas los valores requeridos como argumentos (si los tiene).

**Ejemplo:**
```java
public class Ejemplo {
    public static void main(String[] args) {
        double area = calcularAreaCirculo(6.0);
        System.out.println("El área del círculo es: " + area);
    }
}
```

### 3. **Funciones Lambda**
Las funciones lambda, introducidas en Java 8, permiten definir funciones de manera más concisa, ideales para situaciones donde necesitas escribir funciones simples y rápidas, como al trabajar con interfaces funcionales.

**Sintaxis básica de una función lambda:**
```java
(parametros) -> { cuerpo }
```

**Ejemplo de una función lambda:**
```java
x -> x * x
```
Esto representa una función que toma un argumento `x` y devuelve el valor de `x` al cuadrado.

*Un ejemplo práctico:*
```java
import java.util.function.Function;

Function<Integer, Integer> cuadrado = x -> x * x;
System.out.println(cuadrado.apply(4)); // Resultado: 16
```

### 4. **Paso de funciones como variables**
Java permite pasar funciones como argumentos utilizando interfaces funcionales. Esto es útil para personalizar el comportamiento de métodos sin necesidad de herencia.

**Ejemplo con referencia a un método:**
```java
final Consumer<Integer> imprimirNumero = App::mostrarNumero;
imprimirNumero.accept(11); // Llama al método mostrarNumero con el valor 11
```

## Tipos de funciones en Java

### 1. Funciones sin retorno ni parámetros
- Usadas para ejecutar tareas simples.
```java
public static void saludar() {
    System.out.println("¡Hola, mundo!");
}
```
### 2. Funciones con retorno
- Devuelven un valor después de realizar una operación.
```java
public static int sumar(int a, int b) {
    return a + b;
}
```
### 3. Funciones con parámetros
- Reciben valores de entrada para operar.
```java
public static void mostrarMensaje(String mensaje) {
    System.out.println(mensaje);
}
```
### 4. Funciones recursivas
- Se llaman a sí mismas para resolver problemas más complejos.
```java
public static int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
}
```
### 5. Funciones lambda
- Definidas en línea para operaciones simples.
```java
Runnable tarea = () -> System.out.println("Ejecutando tarea...");
tarea.run();
```

## Ventajas de usar funciones
1. **Reutilización de código:** Una función escrita una vez puede usarse múltiples veces en diferentes partes del programa.
2. **Modularidad:** Permiten dividir un programa en bloques más pequeños y manejables.
3. **Legibilidad:** Facilitan la comprensión del programa al separar la lógica en partes claras.
4. **Mantenimiento:** Los cambios son más fáciles de implementar, ya que solo necesitas modificar la lógica en un lugar.

## Buenas prácticas al usar funciones
- **Mantén las funciones cortas y específicas:** Una función debería realizar solo una tarea específica.
- **Nombres descriptivos:** El nombre de una función debe reflejar claramente su propósito.
- **Evita efectos secundarios:** Las funciones deben evitar modificar variables globales para mantener la predictibilidad.
- **Documenta tus funciones:** Explica brevemente qué hace cada función, especialmente si es compleja.

## Casos de uso
- **Cálculos matemáticos:** Agrupa fórmulas complejas en funciones reutilizables.
- **Validaciones:** Centraliza las reglas de validación en funciones dedicadas.
- **Operaciones repetitivas:** Usa funciones para evitar escribir código repetitivo.
- **Colaboración:** Ayuda a que otros desarrolladores comprendan y trabajen con tu código fácilmente.

---

## Conclusión
El dominio de las funciones es un paso crucial en el aprendizaje de Java. Te permitirá escribir código más eficiente, estructurado y fácil de mantener. Si algo no está claro, consulta los recursos anteriores o explora nuevas fuentes de información para profundizar en el tema.

---

## Recursos recomendados por [roadmap.sh](https://roadmap.sh/java)

Aquí tienes algunos recursos que te ayudarán a profundizar en el tema de funciones en Java:

1. **[Methods in Java - Javatpoint](https://www.javatpoint.com/method-in-java)**  
   Una explicación completa sobre los métodos en Java, cubriendo su sintaxis, tipos, y ejemplos prácticos. Ideal para entender los conceptos básicos y avanzados.

2. **[Java Methods - W3Schools](https://www.w3schools.com/java/java_methods.asp)**  
   Una guía accesible y directa para aprender sobre los métodos en Java, incluyendo cómo definir y llamar métodos.

3. **[Java Lambda Expressions - W3Schools](https://www.w3schools.com/java/java_lambda.asp)**  
   Una introducción a las expresiones lambda en Java, con ejemplos claros para empezar a utilizarlas en tu código.

4. **[Passing Java Functions in Variables - Northcoder](https://northcoder.com/post/passing-java-functions-in-variables/)**  
   Este artículo aborda cómo trabajar con funciones como variables en Java, proporcionando ejemplos prácticos sobre referencias a métodos y expresiones lambda.

---

## Recursos recomendados por mí

Para complementar o reforzar lo aprendido sobre funciones en Java, te sugiero el siguiente recurso adicional:

1. **[LAMBDA en JAVA 8 - YouTube](https://www.youtube.com/watch?v=QrptTiBP5yk)**  
   Un video práctico que explica a fondo cómo funcionan las funciones LAMBDA, desde su definición hasta ejemplos de implementación. Ideal para aprender de manera visual e interactiva.

2. **[Expresiones Lambda en Java - Oracle](https://www.oracle.com/mx/technical-resources/articles/java/expresiones-lambda-api-stream-java.html)**  
   Una guía oficial de Oracle que detalla el uso de expresiones lambda en Java y su integración con la API Stream.

3. **[Expresiones Lambda en Java con Ejemplos - JavaRush](https://javarush.com/es/groups/posts/es.845.expresiones-lambda-con-ejemplos)**  
   Un artículo que desglosa las expresiones lambda con ejemplos prácticos y explicaciones detalladas, ideal para mejorar la comprensión y el uso de esta característica.