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
public class Producto {
    private int idproducto;
    private String nombre;
    private double precio;
    
    public  void setIdproducto(int idproducto) {
        this.idproducto=idproducto;
    }
    public  int getIdproducto() {
        return idproducto;
        
    }
    
     public  void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public  String getNombre() {
        return nombre;
        
    }
     public  void setPrecio(double precio) {
        this.precio=precio;
    }
    public  double getPrecio() {
        return precio;
        
    }
    
  
}
