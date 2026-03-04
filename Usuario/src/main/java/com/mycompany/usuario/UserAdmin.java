/*
Clase hija de la clase usuario 
 */
package com.mycompany.usuario;

/**
 *
 * @author USUARIO
 */
public class UserAdmin extends Usuario {
    int idAdmin ;
    //String nombreAdmin;
    String permisosAdmin;

    public UserAdmin() {
    }
    
    

    public UserAdmin(int idAdmin, String permisosAdmin, int dni, String nombre, int edad) {
        super(dni, nombre, edad);
        this.idAdmin = idAdmin;
        //this.nombreAdmin = nombreAdmin;
        this.permisosAdmin = permisosAdmin;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    public String getPermisosAdmin() {
        return permisosAdmin;
    }

    public void setPermisosAdmin(String permisosAdmin) {
        this.permisosAdmin = permisosAdmin;
    }

// metodo para imprimir con una sobre escritura de metodo para esta clase
    @Override
public void mostrarInfo(){
        System.out.println("El id del admin es: "+idAdmin
        +"\nel nombre del admin es: "+nombre
        +"\nlos permisos del admin son: " +permisosAdmin);
    
}    
    
   

    
    
    
    
}
