package variables;

public class Variables {

    public static void main(String[] args) {
        // scope local

        // Información tipos de datos primitivos
        // https://www.abrirllave.com/java/tipos-de-datos-primitivos.php
        
        // Convenciones para nombrar variables
        // * Empiezan con letra, $ o _
        // * Son key Sensitive
        // * LowerCamelCase
        
        //Declaración
        
        // Tipos de datos primitivos
         byte byteVariable; // -128 A 127
         short shortVariable; // -32768 A 32767 
         int intVariable; // -2147483648 A 2147483647
         long longVariable; // -9223372036854775808 A 9223372036854775808
         float floatVariable; // -3.402823e38 A 3.402823e38
         double doubleVariable; // -1.79769313486232e308 A 1.79769313486232e308
         boolean booleanVariable; // true o false
         char charVariable; // '\u0000' A '\uffff', Permite solo un caracter 
         
        // No primitivo (Objetos)
        // String
         String stringVariable;
         
         
         // Constantes
         final double  PI; // Almacena valor constante que no permite modificarse
    }

}
