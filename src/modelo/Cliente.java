/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author YOEL
 */
public class Cliente {
     private int idcliente;
    private String nombre;
    private String apellidos;
    private String dni;
    private String f_nacimiento;
    
    //Constructores

    public Cliente() {
    }

    public Cliente(int idcliente, String nombre, String apellidos, String dni, String f_nacimiento) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.f_nacimiento = f_nacimiento;
    }
    //Metodos Accesores

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }
    
    //Metodos accesores especiales (con formato)
    public String getObtenerNombreCompleto(){
        return apellidos.toUpperCase() + ", " + nombre;
        //Ejemplo: AROTINCO BERROCAL, Danyelo
    }
}
