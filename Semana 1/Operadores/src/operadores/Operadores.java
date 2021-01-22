package operadores;

/**
 *
 * @author cubes
 */
public class Operadores {

    public static void main(String[] args) {
        // Asignación
        int numero = 1;
        /* La variable "numero" almacenara el valor de "1"
         *
         * Nota: Funciona igual en todos los tipos de variables 
         * o objetos existentes
         */
        System.out.println("Asignacion: " + numero);

        // Aritmeticos
        int suma = numero + 1; // res --> 2
        System.out.println("Suma: " + suma);

        int resta = numero - 1; // res --> 0
        System.out.println("Resta: " + resta);

        int multiplicacion = numero * 1; // res --> 1
        System.out.println("Multiplicacion: " + multiplicacion);

        //double divicion = 2/0; //res --> error, recordar que la dicion entre 0 no existe
        double divicion = 2 / 2; // res ---> 1.0
        System.out.println("Divicion: " + divicion);

        int modulo = 20 % 2; // res --> 0
        System.out.println("Modulo: " + modulo);

        // Incremento
        numero++; // res --> 2
        System.out.println("Incremento: " + numero);

        // Decreto
        numero--; // res --> 1
        System.out.println("Decremento: " + numero);

        /* 
         * Consultar en que consisten los prefijos y sufijos en incrementadores
         * 
         * Acumuladores
         *
         * Adicion:
         */
        numero = numero + 1; // res --> 2
        System.out.println("Acumulador suma normal: " + numero);

        // Forma simplificada
        numero += 1; // res --> 3
        System.out.println("Acumulador suma simplificado: " + numero);

        // Resta:
        numero -= 0; //res --> 3
        System.out.println("Acumulador de resta: " + numero);

        // Multiplicación
        numero *= 1; //res --> 3
        System.out.println("Acumulador de multiplicacion: " + numero);

        // Divición
        numero /= 2; // res --> 1
        System.out.println("Acumulador de divicion: " + numero);

        // Modulo
        numero %= 2; // res --> 1
        System.out.println("Acumulador de modulo: " + numero);

        /*
         * Existen operrores de comparacion estos cirven para definir si
         * al comparar 2 o mas cosas determinar cual es el valor de verdad
         * entre ellas, asi:
         *
         * Igualdad:
         */
        boolean iguales1 = 1 == 1; // res --> la instruccione s verdadera ya que el  == es un operador de igualdad
        System.out.println("iguales1: " + iguales1);

        /*
         * En el caso de las cadenas de texto hay una forma especifica de 
         * comprarlos y esta es usando el metodo equals
         */
        boolean iguales2 = "cadena de texto".equals("otra cadena"); // res --> al las dos cadenas ser distintas las respues sera false
        System.out.println("iguales2: " + iguales2);

        /*
         * NOTA: existe otro llamado "equalsIgnoreCase", este nos permite ignorar si 
         * las letras estan mayusculas oi minisculas, solo se fija en la igualdad del contenido
         *
         * Desigualdad o diferente de:
         */
        boolean desigual1 = 1 != 1;
        System.out.println("desigual1: " + desigual1); //res --> la respuesta sera falso debido a 1 es igual a uno

    }

}
