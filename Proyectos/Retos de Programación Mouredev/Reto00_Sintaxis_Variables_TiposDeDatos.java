/*
 * RETO #00 SINTAXIS, VARIABLES, TIPOS DE DATOS Y HOLA MUNDO
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 *
 * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
 * debemos comenzar por el principio.
 */

// https://www.oracle.com/mx/java/technologies/downloads/
// Este es un comentario de una sola línea
/*
 * Este es un comentario de múltiples líneas,
 * para explicar o comentar algo con más detalle.
 */

public class Reto00_Sintaxis_Variables_TiposDeDatos {

    public static void main(String[] args) {

        /*
         * Sintaxis de una variable:
         * tipoDeDato nombreVariable = valor;
         * Sintaxis de una constante:
         * final tipoDeDato NOMBRE_CONSTANTE = valor;
        */

        // Esta es una variable de tipo de dato entero y de nombre 'numero' con el valor de '6'
        int numero = 6;

        // Esta es una constante de tipo de dato entero y con nombre 'MAXIMO_USUARIOS' con el valor de '26'
        final int MAXIMO_USUARIOS = 26;

        // byte: Tipo de dato numérico entero con valores pequeños. Va de -128 a 127.
        // Se usa cuando necesitas almacenar un valor que ocupa menos memoria.
        byte edad = 27;

        // short: Tipo de dato numérico entero más grande que 'byte', pero más pequeño que 'int'.
        // Va de -32,768 a 32,767.
        short numeroFavorito = 6;

        // int: Tipo de dato numérico entero estándar. Va de -2^31 a 2^31-1 (aproximadamente -2.1 mil millones a 2.1 mil millones).
        // Usado para almacenar la mayoría de los números enteros en Java.
        int distancia = 1111;

        // long: Tipo de dato numérico entero para valores muy grandes.
        // Va de -2^63 a 2^63-1. Usado cuando el rango de 'int' no es suficiente.
        long poblacion = 6000000000L;  // Se pone 'L' al final para indicar un literal de tipo long.

        // float: Tipo de dato numérico decimal de precisión simple. Precisión de 6-7 dígitos significativos.
        // Usado para representar números con decimales cuando no se requiere tanta precisión.
        float piFloat = 3.1415927f;  // Se pone 'f' al final para indicar un literal de tipo float.

        // double: Tipo de dato numérico decimal de precisión doble. Precisión de 15-16 dígitos significativos.
        // Usado para representar números decimales con mayor precisión que 'float'.
        double piDouble = 3.141592653589793;

        // boolean: Tipo de dato lógico que puede ser 'true' o 'false'.
        // Usado para almacenar valores lógicos como condiciones o resultados de comparaciones.
        boolean esVerdadero = true;
        boolean esFalso = false;

        // char: Tipo de dato para almacenar un solo carácter (letra, número o símbolo).
        // Almacena un solo valor Unicode.
        char letra = 'A';

        // String: Tipo de dato para almacenar cadenas de texto (secuencias de caracteres).
        // Es un objeto, no un tipo de dato primitivo. Usado para representar palabras, frases o cualquier texto.
        String palabra = "Java";

        System.out.println("¡Hola, " + palabra + "!");

    }

}