package clasemath;

public class ClaseMath {

    public static void main(String[] args) {
        double operador1 = 25.5;
        
        double operador2 = -15.21;
        
        System.out.println("operador 1: " + operador1 + "\toperador 2: " + operador2);
        
        System.out.println("\nmax: " + Math.max(operador1, operador2)); //Devuelve 25.5
        
        System.out.println("min: " + Math.min(operador1, operador2)); //Devuelve -15.21
        
        System.out.println("ceil: " + Math.ceil(operador1)); // Devuelve 26.0 
        
        System.out.println("floor: " + Math.floor(operador2)); //Devuelve -16.0
        
        System.out.println("pow: " + Math.pow(operador1, operador2)); // Devuelve 4.0413257272332195E-22
        
        System.out.println("sqrt: " + Math.sqrt(operador1)); // Devuelve 5.049752469181039

        System.out.println("abs: " + Math.abs(operador2) ); // Devuelve 15.21
    }

}
