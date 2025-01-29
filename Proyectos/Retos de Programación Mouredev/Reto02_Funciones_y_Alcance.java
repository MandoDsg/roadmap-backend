/*
 * EJERCICIO:
 * - Crea ejemplos de funciones básicas que representen las diferentes
 *   posibilidades del lenguaje:
 *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
 * - Comprueba si puedes crear funciones dentro de funciones.
 * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
 * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 *
 * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
 * Cada lenguaje sigue una convención que debes de respetar para que el código se entienda.
 */

public class Reto02_Funciones_y_Alcance {

    // Función sin parámetros ni retorno
    public void imprimirMensaje() {
        System.out.println("Esta es una función sin parámetros ni retorno.");
        System.out.println("-----------");
    }

    // Función con un parámetro
    public void imprimirNombre(String nombre) {
        System.out.println("Esta es una función con un parámetro.");
        System.out.println("¡Hola " + nombre + "!");
        System.out.println("-----------");
    }

    // Función con varios parámetros
    public void imprimirSuma(int a, int b) {
        System.out.println("Esta es una función con varios parámetros.");
        System.out.println("La suma de " + a + " + " + b + " es: " + (a + b));
        System.out.println("-----------");
    }

    // Función con retorno sin parámetros
    public String obtenerMensaje() {
        return "Esta es una función con retorno.";
    }

    // Función con retorno y parámetros
    public int calcularProducto(int a, int b) {
        System.out.println("Esta es una función con retorno y parámetros.");
        return a * b;
    }

    // Variable global o de clase
    String variableGlobal = "Variable Global";

    // Función para utilizar una variable global
    public void mostrarVariableGlobal() {
        System.out.println("Esta es una " + variableGlobal);
    }

    // Función para utilizar una variable local
    public void variableLocal() {
        String variableLocal = "Variable Local";
        System.out.println("Esto es una " + variableLocal);
    }

    // Función para la Dificultad extra del reto
    public int retoExtra(String texto1, String texto2) {
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(texto1 + texto2);
            } else if (i % 3 == 0) {
                System.out.println(texto1);
            } else if (i % 5 == 0) {
                System.out.println(texto2);
            } else {
                System.out.println(i);
                contador ++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        Reto02_Funciones_y_Alcance funciones = new Reto02_Funciones_y_Alcance();

        // Llamada a la función sin parámetros ni retorno
        funciones.imprimirMensaje();

        // Llamada a la función con un parámetro
        funciones.imprimirNombre("Angel");

        // Llamada a la función con varios parámetros
        funciones.imprimirSuma(11, 6);

        // Llamada a la función con retorno sin parámetros
        String mensaje = funciones.obtenerMensaje();
        System.out.println(mensaje);
        System.out.println("-----------");

        // Llamada a la función con retorno y parámetros
        int producto = funciones.calcularProducto(11, 6);
        System.out.println("El producto es: " + producto);
        System.out.println("-----------");

        // Funciones ya creadas en el lenguaje
        // Ejemplos de funciones matemáticas
        System.out.println("Funciones ya creadas en el lenguaje");
        System.out.println("Ejemplos con funciones matemáticas:");
        double numero = -11.6;

        // Valor absoluto
        System.out.println("El valor absoluto de " + numero + " es: " + Math.abs(numero));

        // Redondear hacia arriba
        System.out.println("El valor redondeado hacia arriba de " + numero + " es: " + Math.ceil(numero));

        // Redondear hacia abajo
        System.out.println("El valor redondeado hacia abajo de " + numero + " es: " + Math.floor(numero));

        // Potencia
        System.out.println("11 elevado a la 6 es: " + Math.pow(11, 6));

        // Raíz cuadrada
        System.out.println("La raíz cuadrada de 16 es: " + Math.sqrt(16));

        System.out.println("-----------");

        // Llamada a la variable global
        funciones.mostrarVariableGlobal();

        // Llamada a la variable local
        funciones.variableLocal();

        System.out.println("-----------");

        // Llamada a la función del reto extra
        System.out.println("DIFICULTAD EXTRA");
        // funciones.retoExtra("Angel", "Alejandra");

        // Llamada a la función del reto extra y almacena el contador
        int numeroDeVeces = funciones.retoExtra("Angel", "Alejandra");
        // Imprime el número de veces que se imprimieron números en lugar de texto
        System.out.println("El número de veces que se imprimió un número en lugar de texto es: " + numeroDeVeces);
    }
}
