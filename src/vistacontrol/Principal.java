/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistacontrol;

import modelo.Alumno;

/**
 *
 * @author YOEL
 */
public class Principal {
    public static void main(String[] args) {
        Alumno alumno=new Alumno();
        Alumno alumno1= new Alumno(2,"2015400278","Abraham leon");
        
        //asignamos valores
        alumno.setIdalumno(1);
        alumno.setCodigo("2015100599");
        alumno.setNombre("Danyelo Arotinco");
        
        //obtenemos y mostramos valores
        System.out.println("objeto alumno");
        System.out.println("ID: "+ alumno.getIdalumno());
        System.out.println("Codigo: "+alumno.getCodigo());
        System.out.println("Nombre: "+ alumno.getNombre());
        
        // obtenemos y mostramos los valores del objeto alumno1
        System.out.println("objeto alumno 1");
        System.out.println("ID: "+ alumno1.getIdalumno());
        System.out.println("Codigo: "+alumno1.getCodigo());
        System.out.println("Nombre: "+ alumno1.getNombre());
        
    }
}
