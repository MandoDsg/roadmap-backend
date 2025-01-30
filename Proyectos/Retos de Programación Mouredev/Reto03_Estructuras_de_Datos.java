/*
 * EJERCICIO:
 * - Muestra ejemplos de creación de todas las estructuras soportadas por defecto
 *   en tu lenguaje.
 * - Utiliza operaciones de inserción, borrado, actualización y ordenación.
 *
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

import java.util.*;

public class Reto03_Estructuras_de_Datos {

    public static void main(String[] args) {

        // LISTAS

        // Arraylist
        List<String> arrayList = new ArrayList<>();
        // Inserción
        arrayList.add("Alejandra");         // Inserta al final
        arrayList.addFirst("Angel");    // Inserta al inicio del array (en el índice 0)
        arrayList.add(1, "Arellano");  // Inserta en el índice 1
        System.out.println("Contenido del ArrayList: " + arrayList);
        // Borrado
        arrayList.remove( 1);    // Borra el elemento en el índice 1
        System.out.println("Contenido del ArrayList después de borrar: " + arrayList);
        // Actualización
        arrayList.set(1, "Ale");    // Actualiza el elemento en el índice 1
        System.out.println("Contenido del ArrayList después de actualizar: " + arrayList);
        // Ordenación
        Collections.sort(arrayList);    // Ordena en orden natural (ascendente)
        System.out.println("Contenido del ArrayList después de ordenar: " + arrayList);

        System.out.println("-----------");

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        // Inserción
        linkedList.add("Alejandra");
        linkedList.addFirst("Angel");
        linkedList.addLast("Arellano");
        System.out.println("Contenido del LinkedList: " + linkedList);
        // Borrado
        linkedList.remove("♥");
        System.out.println("Contenido del LinkedList después de borrar: " + linkedList);
        // Actualización
        linkedList.set(1, "Ale");
        System.out.println("Contenido del LinkedList después de actualizar: " + linkedList);
        // Ordenación
        Collections.sort(linkedList);
        System.out.println("Contenido del LinkedList después de ordenar: " + linkedList);

        System.out.println("-----------");

        // CONJUNTOS

        // HashSet
        Set<String> hashSet = new HashSet<>();
        // Inserción
        hashSet.add("Angel");
        hashSet.add("Ale");
        hashSet.add("Arellano");
        System.out.println("Contenido del HashSet: " + hashSet);
        // Borrado
        hashSet.remove("Arellano");
        System.out.println("Contenido del HashSet después de borrar: " + hashSet);
        // Actualización
        System.out.println("No existe manera directa de actualizar valores.");
        // Ordenar
        System.out.println("No se puede usar collections para ordenar.");

        // TreeSet
        Set<String> treeSet = new TreeSet<>();
        // Inserción
        treeSet.add("Arellano");
        treeSet.addAll(hashSet);    // Inserta y también ordena de manera automática
        System.out.println("Contenido del TreeSet: " + treeSet);
        // Borrado
        treeSet.remove("Arellano");
        System.out.println("Contenido del TreeSet después de borrar: " + treeSet);
        // Actualización
        System.out.println("No existe manera directa de actualizar valores.");
        // Ordenar
        System.out.println("TreeSet ordena de manera automática.");

        System.out.println("-----------");

        // MAPAS

        // HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        // Inserción
        hashMap.put(1, "Angel");
        hashMap.put(2, "Alejandra");
        hashMap.put(3, "Arellano");
        System.out.println("Contenido del HashMap: " + hashMap);
        // Borrado
        hashMap.remove(3);  // Elimina por clave
        System.out.println("Contenido del HashMap después de borrar: " + hashMap);
        // Actualización
        hashMap.put(2, "Ale");
        System.out.println("Contenido del HashMap después de actualizar: " + hashMap);
        // Ordenar
        System.out.println("Mantiene las claves ordenadas automáticamente.");

        // TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        // Inserción
        treeMap.put(1, "Angel");
        treeMap.put(2, "Alejandra");
        treeMap.put(3, "Arellano");
        System.out.println("Contenido del TreeMap: " + treeMap);
        // Borrado
        treeMap.remove(3);
        System.out.println("Contenido del TreeMap después de borrar: " + treeMap);
        // Actualización
        treeMap.put(2, "Ale");
        System.out.println("Contenido del TreeMap después de actualizar: " + treeMap);
        // Ordenar
        System.out.println("Mantiene las claves ordenadas automáticamente.");

        System.out.println("-----------");

        // COLAS

        // Queue (LinkedList)
        Queue<String> queue = new LinkedList<>();
        // Inserción
        queue.offer("Arellano");
        queue.offer("Angel");
        queue.offer("Alejandra");
        System.out.println("Contenido de la Queue: " + queue);
        // Borrado
        queue.poll();   // Elimina el primer elemento
        System.out.println("Contenido de la Queue después de borrar: " + queue);
        // Actualización
        System.out.println("No se puede actualizar directamente en queues.");
        // Ordenar
        System.out.println("No se puede usar collections para ordenar.");

        // PriorityQueue
        Queue<String> priorityQueue = new PriorityQueue<>();
        // Inserción
        priorityQueue.offer("Angel");
        priorityQueue.offer("Alejandra");
        priorityQueue.offer("Arellano");
        priorityQueue.offer("Jiménez");
        System.out.println("Contenido de la PriorityQueue: " + priorityQueue);
        // Borrado
        priorityQueue.poll();   // Elimina el elemento de mayor prioridad
        System.out.println("Contenido de la PriorityQueue después de borrar: " + priorityQueue);
        // Actualización
        System.out.println("No se puede actualizar directamente en queues.");
        // Ordenar
        System.out.println("La PriorityQueue ordena automáticamente los elementos según la prioridad.");

        System.out.println("-----------");

        // PILAS

        // Stack
        Stack<String> stack = new Stack<>();
        // Inserción
        stack.push("Angel");
        stack.push("Alejandra");
        stack.push("Arellano");
        System.out.println("Contenido del Stack: " + stack);
        // Borrado
        stack.pop();    // Elimina el elemento superior
        System.out.println("Contenido del Stack después de borrar: " + stack);
        // Actualización
        System.out.println("No es común actualizar elementos directamente; se recomienda eliminar y volver a insertar.");
        // Ordenar
        stack.sort(String::compareTo);   // Ordena el stack
        System.out.println("Contenido del Stack después de ordenar: " + stack);

        // Deque
        Deque<String> deque = new ArrayDeque<>();
        // Inserción
        deque.push("Alejandra");
        deque.push("Angel");
        deque.push("Arellano");
        System.out.println("Contenido del Deque: " + deque);
        // Borrado
        deque.pop();
        System.out.println("Contenido del Deque después de borrar: " + deque);
        // Actualización
        System.out.println("No es común actualizar elementos directamente; se recomienda eliminar y volver a insertar.");
        // Ordenar
        System.out.println("No se puede ordenar directamente.");
    }

}
