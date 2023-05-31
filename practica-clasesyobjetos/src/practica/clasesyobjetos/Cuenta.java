
package practica.clasesyobjetos;


public class Cuenta {
     
    private String nombre; //variable de instancia
    
   public Cuenta(String nombre)// el nombre del constructor es el nombre de la clase
 {
 this.nombre = nombre;
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
