
package practica.clasesyobjetos;


public class Cuenta {
     
    private String nombre; //variable para el nombre de la cuenta
    private double saldo; // variable para saldo
    
   public Cuenta(String nombre,double saldo)// el nombre del constructor es el nombre de la clase
 {
 this.nombre = nombre;
 
 if(saldo > 0.0)//si el saldo es valido lo agrega a la variable saldo
     this.saldo=saldo;
   }
   
 // método que deposita (suma) sólo una cantidad válida al saldo
public void depositar(double montoDeposito)
 {
if (montoDeposito > 0.0) // si el montoDeposito es válido
 saldo = saldo + montoDeposito; // lo suma al saldo
}


// método que devuelve el saldo de la cuenta
 public double obtenerSaldo()
 {
 return saldo;
 }
 

    
    
    //metodo para establecer elnombre
    public void establecerNombre (String nombre ){
        this.nombre=nombre;
    }
    
    //metodo para obtener el nombre
    public String obtenerNombre(){
        return nombre;
    }
     
     
     
     
}
