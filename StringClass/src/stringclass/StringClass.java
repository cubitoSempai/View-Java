package stringclass;

public class StringClass {

    public static void main(String[] args) {
        // -->Tema: Declaración de variable String
        String nombre = "christian mesa maRay";

        /* -->Tema: Concatenar
         * -->Uso: Posible uso es para unir textos y 
         * generar mensajes automáticos como son informes 
         * de ventas o unir los datos de un usuario o cliente
         *
         * TIPO 1
         */
        nombre = nombre + " es una forma de concatenar";

        // TIPO 2
        System.out.println(nombre.concat(" y este es un texto concatenado al nombre"));

        /* -->Tema: Funciones de la clase String
         *
         *
         * -->UpperCase: La función UpperCase nos permite convertir 
         * las primeras letras de una cadena en mayusculas
         *
         * -->Ejemplo de uso: Darle formato a todo nombre que sea 
         * ingresado por el usuario permitiendo que aun si lo escribe
         * sin el formato de mayúsculas iniciales el sistema lo mantenga
         */
        System.out.println("Mi nombre esta en mayusculas ----> " + nombre.toUpperCase());

        /* -->LowerCase: La función UpperCase nos permite convertir 
         * las primeras letras de una cadena en minusculas
         *
         * -->Ejemplo de uso: Darle formato a todo nombre que sea 
         * ingresado por el usuario permitiendo que aun si lo escribe
         * sin el formato de minusculas iniciales el sistema lo mantenga
         */
        System.out.println("Mi nombre esta en minusculas ----> " + nombre.toLowerCase());

        // Quiero saber el número de caracteres que tiene una cadena
        System.out.println("El nombre tiene " + nombre.length() + " caracteres");

        /* Obtener una posicion especifica de una cadena de texto
         *
         * un uso es obtener la primera letra de un nombre para saber
         * que personas tienen un nombre con una inicial
         *
         */
        System.out.println(nombre.charAt(0));

        /* Quiero obtener un fragmento determinado de la caden a 
         * desde la posicion "n" siendo "n" substring(n);
         *
         * tambien tiene una implementacion con rango, siendo asi
         * substring(inicio, fin);
         */
        System.out.println(nombre.substring(0));

        // Quiero quitar los espacios centrales en una cadena
        System.out.println(nombre.replace(" ", ""));

        /* Quitar espacios a los extremos de una cadena,
         * un ejemplo podria ser el ingreso en formulario
         */
        System.out.println(nombre.trim());

        // asi posemos saber si una cadena esta vacia
        System.out.println(nombre.isEmpty());

        //
        System.out.println(nombre.isEmpty());
    }

}
