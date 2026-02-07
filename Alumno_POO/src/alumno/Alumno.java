package alumno;

// ESTA ES NUESTRA CLASE
public class Alumno {
    
   int id;
   String nombre;
   String apellido;
   
        // ESTE ES UN COSTRUCTOR VACIO
    public Alumno() {
    }
   
        // ESTE ES NUESTRO CONSTRUCTOR CON PARAMETROS
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
        // METODO PARA MOSTRAR EL NOMBRE   
       public void mostrarNombre(){
       
       System.out.println("Hola souy un estudiante y se decir mi ni nombre");
   } 


    
}
