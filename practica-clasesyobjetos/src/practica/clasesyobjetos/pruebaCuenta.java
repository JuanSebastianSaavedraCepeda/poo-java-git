
package practica.clasesyobjetos;

 import java.util.Scanner;

public class pruebaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un objeto scanner 
        Scanner entrada= new Scanner(System.in);
        
        //Creamos un objeto cuenta y lo asignamos a mi cuenta
         Cuenta cuenta1 = new Cuenta("Jane Green");
         Cuenta cuenta2 = new Cuenta("John Blue");
        
       System.out.printf("El nombre de cuenta1 es: %s%n", cuenta1.obtenerNombre());
       System.out.printf("El nombre de cuenta2 es: %s%n", cuenta2.obtenerNombre());
        
        
        
        
    }
    
}
