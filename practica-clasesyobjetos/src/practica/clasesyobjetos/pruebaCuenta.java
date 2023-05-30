/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        Cuenta miCuenta=new Cuenta();
        
       
        
        System.out.println("Introduzca el nombre: ");
        String elNombre=entrada.nextLine();
        miCuenta.establecerNombre(elNombre);//llamamos al metodo obtener nombre
        
        System.out.printf("El nombre en el objeto miCuenta es:%n%s%n",miCuenta.obtenerNombre());
        
        
    }
    
}
