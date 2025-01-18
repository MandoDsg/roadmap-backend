import java.util.Scanner;

/*
 * RETO #01 OPERADORES Y ESTRUCTURAS DE CONTROL
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */

public class Reto01_Operadores_y_Estructuras_de_Control {

    // throw y trows
    public void dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        System.out.println("Resultado: " + (a / b));
    }

    public static void main(String[] args) {

        // Operadores Aritméticos
        float a = 11;
        float b = 6;
        System.out.println("Operadores Aritméticos");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta : " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Residuo (Módulo): " + (a % b));
        System.out.println("-----------");

        // Operadores de Asignación
        float c = 3;
        System.out.println("Operadores de Asignación");
        System.out.println("Asignación Simple: " + (c));
        System.out.println("Suma y Asigna: " + (c += a));               // Es igual a (c = c + a)
        System.out.println("Resta Y Asigna: " + (c -= a));              // Es igual a (c = c - a)
        System.out.println("Multiplica y Asigna: " + (c *= a));         // Es igual a (c = c - a)
        System.out.println("Divide y Asigna: " + (c /= a));             // Es igual a (c = c / a)
        System.out.println("Calcula Residuo y Asigna: " + (c %= a));    // Es igual a (c = c % a)
        System.out.println("-----------");

        // Operadores Relacionales o de Comparación
        System.out.println("Operadores Relacionales o de Comparación");
        System.out.println("El número " + a + " es IGUAL al número " + b + ": " + (a == b));
        System.out.println("El número " + a + " es DIFERENTE al número " + b + ": " + (a != b));
        System.out.println("El número " + a + " es MAYOR al número " + b + ": " + (a > b));
        System.out.println("El número " + a + " es MENOR al número " + b + ": " + (a < b));
        System.out.println("El número " + a + " es MAYOR O IGUAL al número " + b + ": " + (a >= b));
        System.out.println("El número " + a + " es MENOR O IGUAL al número " + b + ": " + (a <= b));
        System.out.println("-----------");

        // Operadores Lógicos
        boolean t = true;
        boolean f = false;
        System.out.println("Operadores Lógicos");
        System.out.println("Para el operador AND (&&)");
        System.out.println("Devuelve: " + t + ", si ambas expresiones son verdaderas");
        System.out.println("Ambas expresiónes: " + t + " y " + t + ", ¿Son verdaderas?: " + (t && t));
        System.out.println("Ambas expresiónes: " + t + " y " + f + ", ¿Son verdaderas?: " + (t && f));
        System.out.println("Para el operador OR (||)");
        System.out.println("Devuelve: " + t + ", si al menos una expresión es verdadera");
        System.out.println("Alguna de las expresiónes: " + t + " o " + f + ", ¿Son verdaderas: " + (t || f));
        System.out.println("Alguna de las expresiónes: " + f + " o " + f + ", ¿Son verdaderas: " + (f || f));
        System.out.println("Para el operador NOT (!)");
        System.out.println("Invierte/niega el valor de la expresión");
        System.out.println("Si la expresión es " + (t) + " y se invierte/niega el valor cambia a: " + (!t));
        System.out.println("Si la expresión es " + (f) + " y se invierte/niega el valor cambia a: " + (!f));
        System.out.println("-----------");

        /*
        * ESTRUCTURAS DE CONTROL
        * Condicionales
        */

        // if
        System.out.println("ESTRUCTURA IF");
        int edad = 27;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }

        // else
        System.out.println("ESTRUCTURA ELSE");
        if (edad >= 18 ) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menos de edad.");
        }

        // else if
        System.out.println("ESTRUCTURA ELSE IF");
        int nota = 100;
        if (nota >= 90) {
            System.out.println("¡EXCELENTE!");
        } else if (nota >= 70) {
            System.out.println("¡Bueno!");
        } else {
            System.out.println("Necesitas mejorar");
        }

        // switch
        System.out.println("ESTRUCTURA SWITCH");
        int dia = 6;
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
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido");
        }

        // Operador ternario (?:)
        System.out.println("OPERADOR TERNARIO");
        String resultado = (edad >= 18) ? "Mayor de edad" : "Menos de edad";
        System.out.println(resultado);

        System.out.println("-----------");

        // Iterativas o bucles

        // for
        System.out.println("BUCLE FOR");
        for (int i = 1; i <=6; i++) {
            System.out.println("Número: " + i);
        }

        // forEach
        System.out.println("BUCLE FOREACH");
        String[] nombres = {"Alejandra", "Angel", "Concepción", "Armando"};
        for (String nombre : nombres) {
            System.out.println("¡Hola " + nombre + "!");
        }

        // while
        System.out.println("BUCLE WHILE");
        int contador = 1;
        while (contador <= 6) {
            System.out.println("Número: " + contador);
            contador ++;
        }

        // do...while
        System.out.println("BUCLE DO...WHILE");
        Scanner scanner = new Scanner(System.in);
        String password;
        do {

            System.out.println("Introduce tu contraseña:");
            password = scanner.nextLine();
        } while (!password.equals("password"));

        System.out.println("-----------");

        // Excepciones

        // try-catch
        System.out.println("EXCEPCIÓN CON TRY-CATCH");
        try {
            int division = 11 / 0;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero: " + e.getMessage());
        }

        // finally
        System.out.println("EXCEPCIÓN CON FINALLY");
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El índice esta fuera de rango: " + e.getMessage());
        } finally {
            System.out.println("El bloque finally siempre se va a ejecutar");
        }

        // throw y trows
        System.out.println("EXCEPCIÓN CON THROW Y TROWS");
        Reto01_Operadores_y_Estructuras_de_Control ejemploThrows = new Reto01_Operadores_y_Estructuras_de_Control();
        try {
            ejemploThrows.dividir(10, 2);
            ejemploThrows.dividir(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("-----------");

        /*
         * DIFICULTAD EXTRA (opcional):
         * Crea un programa que imprima por consola todos los números comprendidos
         * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
         */

        System.out.println("DIFICULTAD EXTRA");
        for (int i = 10; i <=55; i++){
            if ((i % 2 == 0) && (i != 16) && (i % 3 != 0)) {
                System.out.println(i);
            }
        }

    }

}
