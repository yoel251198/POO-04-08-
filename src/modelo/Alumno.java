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
public class Alumno {
    private int idalumno;
    private String codigo;
    private String nombre;

    //constructor vacio
    public Alumno() {
    }
    //cinstructor que recibe valores para inicializar
    public Alumno(int idalumno, String codigo, String nombre) {
        this.idalumno = idalumno;
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    
    

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
