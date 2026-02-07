
package alumno;

public class POO {
    
    
    public static void main(String[] args){
        // creamos dos objetos para cada constructor (vacion y con parametros)
        Alumno alu1 = new Alumno();                         // para llamar al constructor vacio
        Alumno alu2 = new Alumno(36," Geordy Adrian", "Moreno" );        //para llamar al construcor con parametros
        Alumno alu3 = new Alumno (25, "Andres Julian", "Parra");       //para llamar al construcor con parametros
        
        System.out.println("la id del alumno 2 es: "+ alu2.getId());
        System.out.println("la id del primer alumno es: "+alu1.getId());
        System.out.println("El nombre del alumno 1 es :"+ alu1.getNombre());
        System.out.println("El apellido y el nombre del alumno 3, junto con su edad  es: " +alu3.getId()+" años "+alu3.getNombre()+" "+alu3.getApellido());
        System.out.println("--------------------------------------------");
        alu1.setNombre("Adrian");
        alu1.setApellido("Medina");
        alu1.setId(30);
        System.out.println("EL nombre del alumno 1 luego de usar el setNombre es: " +alu1.getNombre());
        System.out.println("EL apelido del alumno 1 luego de usar el setApellido es: " +alu1.getApellido());
        System.out.println("EL ID del alumno 1 luego de usar el setId es: " +alu1.getId());
        
    }
    
}

    