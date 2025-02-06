/*
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que analice dos palabras diferentes y realice comprobaciones
 * para descubrir si son:
 * - Palíndromos
 * - Anagramas
 * - Isogramas
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Reto04_Dificultad_Extra {

    public boolean sonPalindromos(String palabra1, String palabra2) {
        // Conversión de las palabras a minúsculas
        String palabra1Min = palabra1.toLowerCase();
        String palabra2Min = palabra2.toLowerCase();
        // Reversión de la palabra 2
        String palabra2Invertida = new StringBuilder(palabra2Min).reverse().toString();
        // Retorna un valor booleano de la comparación
        return palabra1Min.equals(palabra2Invertida);
    }

    public boolean sonAnagramas(String palabra1, String palabra2) {
        // Convertir ambas palabras en un arreglo de caracteres
        char[] palabra1EnArreglo = palabra1.toLowerCase().toCharArray();
        char[] palabra2EnArreglo = palabra2.toLowerCase().toCharArray();
        // Ordenar ambas palabras alfabéticamente
        Arrays.sort(palabra1EnArreglo);
        Arrays.sort(palabra2EnArreglo);
        // Retorna un valor booleano de la comparación
        return Arrays.equals(palabra1EnArreglo, palabra2EnArreglo);
    }

    public static void main(String[] args) throws IOException {
        Reto04_Dificultad_Extra comprueba = new Reto04_Dificultad_Extra();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Este programa analiza dos palabras diferentes para descubrir si son: ");
        System.out.println("- Palíndromos");
        System.out.println("- Anagramas");
        System.out.println();
        System.out.print("Ingresa la palabra 1: ");
        String palabra1 = reader.readLine();
        System.out.println();
        System.out.print("Ingresa la palabra 2: ");
        String palabra2 = reader.readLine();
        System.out.println();

        // Comprobación de sí las palabras son palíndromos
        boolean sonPalindromos = comprueba.sonPalindromos(palabra1, palabra2);
        if (sonPalindromos) {
            System.out.println("La palabra '" + palabra1 + "' y la palabra '" + palabra2 + "' SI son Palíndromos.");
        } else {
            System.out.println("La palabra '" + palabra1 + "' y la palabra '" + palabra2 + "' NO son Palíndromos.");
        }

        System.out.println();

        // Comprobación de sí las palabras son anagramas
        boolean sonAnagramas = comprueba.sonAnagramas(palabra1, palabra2);
        if (sonAnagramas) {
            System.out.println("La palabra '" + palabra1 + "' y la palabra '" + palabra2 + "' SI son Anagramas.");
        } else {
            System.out.println("La palabra '" + palabra1 + "' y la palabra '" + palabra2 + "'L NO son Anagramas.");
        }

    }

}
