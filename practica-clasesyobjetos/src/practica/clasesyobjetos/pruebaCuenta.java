
package practica.clasesyobjetos;

 import java.util.Scanner;

public class pruebaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         //Creamos un objeto cuenta y lo asignamos a mi cuenta
         Cuenta cuenta1 = new Cuenta("Jane Green",50.13);
         Cuenta cuenta2 = new Cuenta("John Blue",30.00);
        
         // Mostramos el saldo inicial de cada objeto
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n",cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
         
         //c objeto scanner
         Scanner entrada= new Scanner(System.in);
         
         
         System.out.print("Escriba el monto a depositar para cuenta1: "); // indicador (promt)
         double montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
         System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",montoDeposito);
         cuenta1.depositar(montoDeposito); // suma al saldo de cuenta1

         
         // muestra los saldos
         System.out.printf("Saldo de %s: $%.2f%n",cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
         System.out.printf("Saldo de %s: $%.2f%n%n",cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

         
         System.out.print("Escriba el monto a depositar para cuenta2: "); // indicador (promt)
         montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
         System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n", montoDeposito);
         cuenta2.depositar(montoDeposito); // suma al saldo de cuenta2

         // muestra los saldos
         System.out.printf("Saldo de %s: $%.2f%n",cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
         System.out.printf("Saldo de %s: $%.2f%n%n",cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
         
        }
    }
