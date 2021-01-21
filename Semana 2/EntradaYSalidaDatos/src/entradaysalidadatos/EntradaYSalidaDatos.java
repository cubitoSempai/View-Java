package entradaysalidadatos;

import java.util.Scanner;

/**
 *
 * @author cubes
 */
public class EntradaYSalidaDatos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* 
         * Esta es la forma de obtener informacion de texto
         * por parte del usuario usando la consula
         */
        System.out.println("Ingrese nu nombre");
        String nombre = scanner.next();

        System.out.println("Su nombre es: " + nombre);

        /* 
         * Todos los tipos de datos tienen su tipo de ingreso
         * un ejemplo de esto puede ser el siguiente
         */
        System.out.println("\nIngrese un numero para tipo de dato byte");
        byte numero = scanner.nextByte();

        // El formato normalmente seria scanner.nextTipoDato
        System.out.println("El numero ingresado es: " + numero);

    }

}
