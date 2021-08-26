
package atributos;

public class persona {

   
    
        private String cedula,nombre;
        private double edad;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }
        
       
        @Override
   public String toString(){
   return "la persona se llama: " +getNombre()+ " y su cedula es: " +getCedula()+ " tiene la edad de: " +getEdad();
   
     
        
   }
        
}    
    
        
        
    
   
    
    

