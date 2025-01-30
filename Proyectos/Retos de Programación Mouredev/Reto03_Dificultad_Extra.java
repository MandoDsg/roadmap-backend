/*
 * DIFICULTAD EXTRA (opcional):
 * Crea una agenda de contactos por terminal.
 * - Debes implementar funcionalidades de búsqueda, inserción, actualización
 *   y eliminación de contactos.
 * - Cada contacto debe tener un nombre y un número de teléfono.
 * - El programa solicita en primer lugar cuál es la operación que se quiere realizar,
 *   y a continuación los datos necesarios para llevarla a cabo.
 * - El programa no puede dejar introducir números de teléfono no numéricos y con más
 *   de 11 dígitos (o el número de dígitos que quieras).
 * - También se debe proponer una operación de finalización del programa.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Reto03_Dificultad_Extra {

    // Almacena los contactos
    private ArrayList<String> contactos = new ArrayList<>();

    // Método para crear un contacto
    public void crearContacto(String nombre, String numeroTelefono) {
        String contacto = "Nombre: " + nombre + ", Teléfono: " + numeroTelefono;
        contactos.add(contacto);
        System.out.println("¡Contacto: " + contacto + " creado exitosamente!");
    }

    // Método para mostrar contactos
    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            System.out.println("Lista de contactos:");
            Collections.sort(contactos);
            for (int i = 0; i < contactos.size(); i++) {
                System.out.println((i + 1) + ". " +contactos.get(i));
            }
        }
    }

    // Método para actualizar un contacto
    public void actualizarContacto(BufferedReader reader) {
        try {
            mostrarContactos();
            System.out.println("Ingresa el número de la lista del contacto para actualizar:");
            int indice = Integer.parseInt(reader.readLine()) - 1;
            if (indice > 0 && indice < contactos.size()) {
                System.out.println("¿Qué deseas modificar?");
                System.out.println("1. Nombre");
                System.out.println("2. Número de teléfono");
                System.out.println("Selecciona la opción a modificar:");
                int opc = Integer.parseInt(reader.readLine());

                switch (opc) {
                    case 1:
                        System.out.println("Ingresa el nuevo nombre: ");
                        String nuevoNombre = reader.readLine();
                        String[] contactoPartes = contactos.get(indice).split(", ");
                        contactos.set(indice, "Nombre: " + nuevoNombre + ", " + contactoPartes[1]);
                        System.out.println("¡Nombre actualizado exitosamente!");
                        mostrarContactos();
                        break;
                    case 2:
                        System.out.println("Ingresa el nuevo número de teléfono: ");
                        String nuevoTelefono = validarTelefono(reader);
                        contactoPartes = contactos.get(indice).split(", ");
                        contactos.set(indice, contactoPartes[0] + ", Teléfono: " + nuevoTelefono);
                        System.out.println("¡Número de teléfono actualizado exitosamente!");
                        mostrarContactos();
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }

            } else {
                System.out.println("Índice del contacto no válido.");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer los datos.");
        }
    }

    // Método para borrar un contacto
    public void borrarContacto (BufferedReader reader) {
        try {
            mostrarContactos();
            System.out.println("Ingresa el número de la lista del contacto a borrar:");
            int indice = Integer.parseInt(reader.readLine()) - 1;
            contactos.remove(indice);
            mostrarContactos();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Índice del contacto no válido.");
        }
    }

    // Método para validar el número de teléfono
    public String validarTelefono(BufferedReader reader) {
        String telefono = "";
        boolean valido = false;

        while (!valido) {
            try {
                telefono = reader.readLine().trim();
                // Verificar si el número tiene exactamente 10 dígitos y si es numérico
                if (telefono.length() == 10 && telefono.matches("\\d+")) {
                    valido = true;
                } else {
                    System.out.println("Número inválido. Debe tener exactamente 10 dígitos.");
                }
            } catch (IOException e) {
                System.out.println("Error al leer los datos.");
            }
        }
        return telefono;
    }

    public static void main(String[] args) {
        Reto03_Dificultad_Extra agenda = new Reto03_Dificultad_Extra();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int opc = 0;

        do {
            // Funcionalidades
            System.out.println("AGENDA DE CONTACTOS");
            System.out.println("Lista de funciones disponibles:");
            System.out.println("1. Buscar contactos.");
            System.out.println("2. Crear nuevo contacto.");
            System.out.println("3. Actualizar contacto.");
            System.out.println("4. Eliminar contacto.");
            System.out.println("5. Salir.");

            try {
                System.out.println("Selecciona la función a ejecutar: ");
                opc = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Error al leer los datos.");
                continue; // Reinicia el bucle si ocurre un error
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número valido.");
                continue; // Reinicia el bucle si el formato no es válido
            }

            switch (opc) {
                case 1:
                    System.out.println("Búsqueda de contactos.");
                    agenda.mostrarContactos();
                    break;
                case 2:
                    System.out.println("Creación de un nuevo contacto.");
                    try {
                        System.out.println("Ingresa el nombre del contacto: ");
                        String nombre = reader.readLine();
                        System.out.println("Ingresa el número de teléfono (10 dígitos): ");
                        String numeroTelefono = agenda.validarTelefono(reader);
                        agenda.crearContacto(nombre, numeroTelefono);
                    } catch (IOException e) {
                        System.out.println("Error al leer los datos.");
                    }
                    break;
                case 3:
                    System.out.println("Actualización de un contacto.");
                    agenda.actualizarContacto(reader);
                    break;
                case 4:
                    System.out.println("Eliminación de un contacto.");
                    agenda.borrarContacto(reader);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingresa una opción válida.");
                    break;
            }
            System.out.println();
        } while (opc != 5);
    }

}