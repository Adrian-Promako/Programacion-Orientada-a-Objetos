
package poo1;

/**
 *
 * @author USUARIO
 */
public class Empleado extends Persona{
    int num_legajo;
    String cargo;
    int sueldo;

    public Empleado() {
    }
    
    public Empleado (int num_legajo, String cargo, int sueldo, int edad, String nombre, String apellido, int calificacion) {
        super (edad, nombre, apellido, calificacion);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    // getters and setters
    public void setNum_legajo (int num_legajo){
        this.num_legajo = num_legajo;
    }
    public int getNum_legajo(){
        return num_legajo;
    }
    public void setCargo (String cargo){
        this.cargo = cargo;
    }
    public String getCargo (){
        return cargo;
    }
    public void setSueldo (int sueldo){
        this.sueldo = sueldo;
    }
    public int getSueldo (){
        return sueldo;
    }
    
}
