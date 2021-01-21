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

        //Consultar en que consisten los prefijos y sufijos en incrementadores
        // Acumuladores
        numero = numero + 1; // res --> 2
        System.out.println("Acumulador normal" + numero);

        // Forma simplificada
        numero += 1; // res --> 3
        System.out.println("Acumulador simplificado" + numero);

    }

}
