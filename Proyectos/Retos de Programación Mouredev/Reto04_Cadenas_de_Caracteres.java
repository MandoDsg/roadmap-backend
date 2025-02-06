/*
 * EJERCICIO:
 * Muestra ejemplos de todas las operaciones que puedes realizar con cadenas de caracteres
 * en tu lenguaje. Algunas de esas operaciones podrían ser (busca todas las que puedas):
 * - Acceso a caracteres específicos, subcadenas, longitud, concatenación, repetición,
 *   recorrido, conversión a mayúsculas y minúsculas, reemplazo, división, unión,
 *   interpolación, verificación...
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que analice dos palabras diferentes y realice comprobaciones
 * para descubrir si son:
 * - Palíndromos
 * - Anagramas
 * - Isogramas
 */

import java.util.Arrays;

public class Reto04_Cadenas_de_Caracteres {

    public static void main(String[] args) {

        // Creación de cadenas
        String nombre = "Angel";
        String nombre2 = "Ale";
        System.out.println(nombre);
        System.out.println(nombre2);
        // Concatenación
        System.out.println(nombre + " ♥ " + nombre2);
        System.out.println(nombre2.concat(" ♥ ").concat(nombre));
        // Comparación
        String cadena = "AA";
        String cadena2 = "Aa";
        boolean esIgual = cadena.equals(cadena2);
        System.out.println("La cadena '" + cadena + "' es igual a la cadena '" + cadena2 + "': " + esIgual);
        // Comparación ignorando mayúsculas y minúsculas
        boolean esIgualSinDistincion = cadena.equalsIgnoreCase(cadena2);
        System.out.println("La cadena '" + cadena + "' es igual a la cadena '" + cadena2 + "': " + esIgualSinDistincion);
        // Comparación alfabética o lexicográfica
        int compara = nombre.compareTo(nombre2);
        if (compara < 0) {
            System.out.println("El nombre de: " + nombre + " es alfabéticamente mayor que el nombre de: " + nombre2);
        } else {
            System.out.println("El nombre de '" + nombre + "' es alfabéticamente menor que el nombre de '" + nombre2 + "'");
        }
        // Conversión a mayúsculas
        String nombreMayusculas = nombre.toUpperCase();
        String nombre2Mayusculas = nombre2.toUpperCase();
        System.out.println(nombreMayusculas);
        System.out.println(nombre2Mayusculas);
        // Conversión a minúsculas
        String nombreMinusculas = nombre.toLowerCase();
        String nombre2Minusculas = nombre2.toLowerCase();
        System.out.println(nombreMinusculas);
        System.out.println(nombre2Minusculas);
        // Reemplazo de caracteres
        String mensaje = "¡Hola Mundo!";
        System.out.println(mensaje);
        String nuevoMensaje = mensaje.replace("Mundo", "Java");
        System.out.println(nuevoMensaje);
        // Extracción de una subcadena
        String subcadena = mensaje.substring(1, 5);
        System.out.println(subcadena);
        // Verificación de cadena vacía
        boolean esVacia = mensaje.isEmpty();
        System.out.println("La cadena está vacía: " + esVacia);
        // Verificación de una subcadena dentro de una cadena
        boolean contiene = mensaje.contains("Mundo");
        System.out.println("La cadena '" + mensaje + "' contiene la subcadena 'Mundo': " + contiene);
        // Verificación de sí una cadena empieza con una subcadena específica
        boolean empiezaCon = mensaje.startsWith("¡Hola");
        System.out.println("La cadena '" + mensaje + "' empieza con la subcadena '¡Hola': " + empiezaCon);
        // Verificación de sí una cadena termina con una subcadena específica
        boolean terminaCon = mensaje.endsWith("Mundo!");
        System.out.println("La cadena '" + mensaje + "' termina con la subcadena 'Mundo!': " + terminaCon);
        // Busca y retorna la primera posición en que se encuentra una cadena o un carácter
        int posicion = mensaje.indexOf("o");
        System.out.println("El primer carácter 'o' se encuentrá en la posición: " + posicion + " dentro de la cadena.");
        // Busca y retorna la última posición en que se encuentra una cadena o un carácter
        int ultimaPosicion = mensaje.lastIndexOf("o");
        System.out.println("El último carácter 'o' se encuentrá en la posición: " + ultimaPosicion + " dentro de la cadena.");
        // Eliminación de espacios en blanco al inicio y final de una cadena
        String textoConEspacios = "  ¡You Make Me! ";
        System.out.println(textoConEspacios);
        String textoSinEspacios = textoConEspacios.trim();
        System.out.println(textoSinEspacios);
        // Conversión de diferentes tipos de datos a cadenas
        String numero = String.valueOf(11);
        System.out.println(numero);
        String booleano = String.valueOf(true);
        System.out.println(booleano);
        // División de cadenas en partes según un delimitador
        String frase = "¡You make me something new!";
        System.out.println(frase);
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            System.out.print(" - " + palabra);
        }
        System.out.println();
        // Reversión de cadenas con StringBuilder
        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        System.out.println(fraseInvertida);
        // Unificación de cadenas
        StringBuilder builder = new StringBuilder();
        builder.append("¡You");
        builder.append(" ");
        builder.append("make me!");
        String unifica = builder.toString();
        System.out.println(unifica);
        // Convertir una palabra en un arreglo de caracteres
        char[] nombreEnArreglo = nombre.toCharArray();
        for (char letras : nombreEnArreglo) {
            System.out.print(" - " + letras);
        }
        System.out.println();
        // Ordenar las letras alfabéticamente
        Arrays.sort(nombreEnArreglo);
        System.out.println(nombreEnArreglo);
        // Convertir el arreglo de caracteres ordenado a nuevo String
        String letrasNombreOrdenado = new String(nombreEnArreglo);
        System.out.println(letrasNombreOrdenado);
    }

}
