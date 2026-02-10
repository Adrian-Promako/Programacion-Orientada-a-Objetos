
package poo1;

/**
 *
 * @author USUARIO
 */
public class Consultor extends Persona{
    
    String nombreConsultor ;
    int numeroConsultor;
    int telefonoConsultor;

    public Consultor() {
    }

    public Consultor(String nombreConsultor, int numeroConsultor, int telefonoConsultor, int edad, String nombre, String apellido, int calificacion) {
        super(edad, nombre, apellido, calificacion);
        this.nombreConsultor = nombreConsultor;
        this.numeroConsultor = numeroConsultor;
        this.telefonoConsultor = telefonoConsultor;
    }

    public String getNombreConsultor() {
        return nombreConsultor;
    }

    public void setNombreConsultor(String nombreConsultor) {
        this.nombreConsultor = nombreConsultor;
    }

    public int getNumeroConsultor() {
        return numeroConsultor;
    }

    public void setNumeroConsultor(int numeroConsultor) {
        this.numeroConsultor = numeroConsultor;
    }

    public int getTelefonoConsultor() {
        return telefonoConsultor;
    }

    public void setTelefonoConsultor(int telefonoConsultor) {
        this.telefonoConsultor = telefonoConsultor;
    }
    
    
    
}
