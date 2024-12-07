# Condicionales en Java

Las estructuras condicionales son esenciales en cualquier lenguaje de programación, ya que permiten que los programas tomen decisiones basadas en ciertas condiciones. En Java, estas estructuras determinan qué bloques de código se ejecutan según el resultado de expresiones lógicas o valores de variables. 

Aquí aprenderás sobre las distintas estructuras condicionales que Java ofrece, junto con sus casos de uso más comunes y ejemplos claros que te permitirán comprender cómo implementarlas en tus programas.

## ¿Qué son las condicionales?

Las condicionales son sentencias que evalúan una o más condiciones, las cuales pueden ser verdaderas o falsas. Dependiendo del resultado de esa evaluación, se ejecuta un bloque de código u otro. En Java, las principales estructuras condicionales son:

1. **`if`**: Para ejecutar un bloque de código si la condición es verdadera.
2. **`else`**: Para ejecutar un bloque alternativo si la condición es falsa.
3. **`else if`**: Para evaluar una nueva condición cuando la condición anterior no se cumple.
4. **`switch`**: Para manejar múltiples alternativas con una sintaxis más compacta.
5. **Operador ternario (`? :`)**: Una forma abreviada de escribir una estructura `if-else`.

## Tipos de condicionales en Java

### 1. **Estructura `if`**

La sentencia `if` permite ejecutar un bloque de código únicamente si la condición especificada es verdadera. Es la estructura condicional más básica y versátil.

#### Sintaxis
```java
if (condición) {
    // Código a ejecutar si la condición es verdadera
}
```

#### Explicación:
- La condición es una expresión booleana que devuelve `true` o `false`.
- Si la condición es `true`, se ejecuta el código dentro del bloque `{}`.
- Si la condición es `false`, el programa continúa ejecutando el código que sigue después del bloque `if`.

#### Ejemplo:
```java
int edad = 25;
if (edad >= 18) {
    System.out.println("Eres mayor de edad.");
}
```

### 2. **Estructura `else`**

La sentencia `else` se utiliza para ejecutar un bloque de código alternativo cuando la condición de un `if` no se cumple.

#### Sintaxis
```java
if (condición) {
    // Código si la condición es verdadera
} else {
    // Código si la condición es falsa
}
```

#### Ejemplo:
```java
int edad = 17;
if (edad >= 18) {
    System.out.println("Eres mayor de edad.");
} else {
    System.out.println("Eres menor de edad.");
}
```

### 3. **Estructura `else if`**
`else if` se utiliza para manejar múltiples condiciones en un solo bloque. Permite evaluar nuevas condiciones si las anteriores no son verdaderas.

#### Sintaxis
```java
if (condición1) {
    // Código si condición1 es verdadera
} else if (condición2) {
    // Código si condición2 es verdadera
} else {
    // Código si ninguna condición es verdadera
}
```

#### Ejemplo:
```java
int nota = 85;
if (nota >= 90) {
    System.out.println("Excelente");
} else if (nota >= 70) {
    System.out.println("Bueno");
} else {
    System.out.println("Necesitas mejorar");
}
```

### 4. **Estructura `switch`**
El `switch` es útil cuando se necesita evaluar una misma variable o expresión contra múltiples valores posibles. Es más limpio que usar varios `else if` consecutivos.

#### Sintaxis
```java
switch (expresión) {
    case valor1:
        // Código para valor1
        break;
    case valor2:
        // Código para valor2
        break;
    default:
        // Código si ningún caso coincide
}
```

#### Explicación:
- La expresión en el `switch` se evalúa una sola vez.
- El programa compara el resultado de la expresión con los valores de los casos (`case`).
- Si encuentra una coincidencia, ejecuta el bloque correspondiente.
- La palabra clave `break` detiene la ejecución del bloque para evitar que los casos siguientes se ejecuten.

#### Ejemplo:
```java
int dia = 3;
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Día no válido");
}
```

### 5. Operador ternario (`? :`)
El operador ternario es una forma abreviada de escribir un `if-else` en una sola línea. Es útil para asignaciones rápidas o salidas condicionales.

#### Sintaxis
```java
variable = (condición) ? valor_si_verdadero : valor_si_falso;
```

#### Ejemplo:
```java
int edad = 20;
String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
System.out.println(resultado);
```

#### Ventajas:
- Ahorra espacio y es más limpio en situaciones simples.

#### Desventajas:
- Puede reducir la legibilidad si se utiliza con condiciones complejas.

## Casos de uso y recomendaciones

1. **Usa `if-else` para condiciones sencillas.**  
   Esta estructura es fácil de leer y entender, especialmente si hay solo una o dos alternativas posibles en tu lógica de decisión.

2. **Prefiere `else if` o `switch` para múltiples condiciones.**  
   - Si necesitas evaluar varias opciones posibles para un valor, considera usar `switch`, ya que proporciona una sintaxis más limpia y organizada.  
   - Si las condiciones no se basan en un único valor, `else if` ofrece mayor flexibilidad.

3. **Elige el operador ternario para expresiones simples.**  
   Utiliza el operador ternario (`? :`) cuando quieras manejar condiciones simples en una sola línea, como asignaciones o salidas rápidas, sin comprometer la legibilidad.

4. **Evita anidar muchas condiciones.**  
   Anidar múltiples niveles de condiciones puede dificultar la comprensión del código. En estos casos, considera dividir la lógica en funciones separadas para mantener la claridad y facilitar el mantenimiento.

5. **Documenta tu lógica de decisión.**  
   Si las condiciones son complejas, utiliza comentarios claros para explicar su propósito. Esto es especialmente útil cuando trabajas en equipo o revisas el código después de un tiempo.

6. **Prueba todos los escenarios posibles.**  
   Asegúrate de cubrir tanto las condiciones esperadas como las excepciones posibles al probar tu programa. Esto ayuda a garantizar que tu lógica sea robusta y confiable.

---

## Conclusión
Las condicionales en Java son herramientas poderosas para controlar el flujo de tu programa. Practicar con diferentes estructuras y escenarios es crucial para entender su comportamiento y cuándo usarlas.

Si algo no está claro, revisa los conceptos aprendidos anteriormente o busca más recursos para profundizar en los temas. Experimenta escribiendo tus propias soluciones para ganar confianza en el manejo de las condicionales.

---

## Recursos recomendados por [roadmap.sh](https://roadmap.sh/java)

Aquí tienes algunos recursos que te ayudarán a profundizar en el uso de condicionales en Java:

1. **[What are Conditional Statements in Programming? - Educative](https://www.educative.io/answers/what-are-conditional-statements-in-programming)**  
   Este artículo explica qué son las estructuras condicionales, cómo funcionan y su importancia en la lógica de programación.

2. **[Java if-else - Javatpoint](https://www.javatpoint.com/java-if-else)**  
   Un recurso detallado que describe las estructuras condicionales `if`, `else`, y `else if` con ejemplos prácticos para entender su uso.

---

## Recursos recomendados por mí

Para complementar o reforzar lo aprendido, te sugiero los siguientes recursos adicionales:

1. **[Java Conditions - W3Schools](https://www.w3schools.com/java/java_conditions.asp)**  
   Explica las estructuras condicionales básicas en Java con ejemplos claros y directos.

2. **[Java Switch - W3Schools](https://www.w3schools.com/java/java_switch.asp)**  
   Una guía sencilla para entender y utilizar la estructura `switch` en Java, ideal para manejar múltiples casos en tu código.