/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringclass;

/**
 *
 * @author cgara
 */
public class StringClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "christian mesa maRay";

        // ¿que es concatenar? => ejemplo
        // nombre = nombre + "es un impostor";
        // Quiero hacer que todo mi nombre este en mayosculas
        System.out.println("Mi nombre esta en mayusculas ----> " + nombre.toUpperCase());

        // Quiero que todo mi nombre este en minusculas
        System.out.println("Mi nombre esta en minusculas ----> " + nombre.toLowerCase());

        // Quiero saber el numero de caracteres que tiene una cadena
        System.out.println("El nombre tiene " + nombre.length() + " caracteres");

        //Quiero obtener un fragmento determinado de la cadena
        System.out.println(nombre.substring(0));

        //Quiero quitar los espacios centrales en una cadena
        System.out.println(nombre.replace(" ", ""));
    }

}
