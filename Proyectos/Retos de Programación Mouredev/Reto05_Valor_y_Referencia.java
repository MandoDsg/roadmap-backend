/*
 * EJERCICIO:
 * - Muestra ejemplos de asignación de variables "por valor" y "por referencia", según
 *   su tipo de dato.
 * - Muestra ejemplos de funciones con variables que se les pasan "por valor" y
 *   "por referencia", y cómo se comportan en cada caso en el momento de ser modificadas.
 * (Entender estos conceptos es algo esencial en la gran mayoría de lenguajes)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea dos programas que reciban dos parámetros (cada uno) definidos como
 * variables anteriormente.
 * - Cada programa recibe, en un caso, dos parámetros por valor, y en otro caso, por referencia.
 *   Estos parámetros los intercambia entre ellos en su interior, los retorna, y su retorno
 *   se asigna a dos variables diferentes a las originales. A continuación, imprime
 *   el valor de las variables originales y las nuevas, comprobando que se ha invertido
 *   su valor en las segundas.
 *   Comprueba también que se ha conservado el valor original en las primeras.
 */

import java.util.Arrays;

// Clase para el ejemplo de paso de parámetros "por referencia" en funciones
class Persona {
    String nombre;
}

public class Reto05_Valor_y_Referencia {

    // Método para el ejemplo de paso de parámetros "por valor" en funciones
    public void cambiarValor(int numero) {
        System.out.println("Antes de cambiar, numero (local): " + numero); // Muestra el valor local antes del cambio
        numero = 11;    // Cambia solo el valor de la copia local
        System.out.println("Después de cambiar, numero (local): " + numero); // Muestra el valor local después del cambio
    }

    // Método para el ejemplo de paso de parámetros "por referencia" en funciones
    public void cambiarNombre(Persona persona) {
        persona.nombre = "Angel";   // Cambia el atributo del objeto referenciado
    }

    public static void main(String[] args) {

        // Asignación de variable por valor
        int a = 6;
        int b = a;  // Se copia el valor de 'a' en 'b'
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        b = 11;     // Modifica 'b', pero 'a' no cambia
        System.out.println("b modificada: " + b);

        //Asignación de variable por referencia
        int[] numeros = {1, 2, 3};  // Creamos un arreglo (objeto)
        int[] copia = numeros;  // Asignamos la referencia del arreglo a otra variable
        // Imprimimos los valores de ambas referencias
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(copia));
        copia[0] = 99;  // Modificamos el primer elemento usando la referencia 'copia'
        // Imprimimos los valores de ambas referencias después de modificar
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(copia));

        // Paso de parámetros "por valor" en funciones
        Reto05_Valor_y_Referencia valor = new Reto05_Valor_y_Referencia();
        int x = 6;
        System.out.println("Antes de llamar a cambiarValor, x (original): " + x); // Muestra el valor original
        valor.cambiarValor(x);  // Pasa una copia del valor de 'x'
        System.out.println("Después de llamar a cambiarValor, x (original): " + x); // Muestra el valor original después de la llamada

        // Paso de parámetros "por referencia" en funciones
        Persona persona = new Persona();
        persona.nombre = "Ale";

        System.out.println("Nombre: " + persona.nombre);    // Antes de pasar la referencia
        valor.cambiarNombre(persona);   // Pasa la referencia al objeto
        System.out.println("Nombre: " + persona.nombre);    // Después de pasar la referencia
    }
}
