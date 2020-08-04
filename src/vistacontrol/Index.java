/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistacontrol;
import utils.Leer;
import java.util.ArrayList;
import modelo.Cliente;
/**
 *
 * @author YOEL
 */
public class Index {
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private static int idpersona=-1;
    
    public static void cargarDataSintetica() {
        Cliente cliente0=new Cliente(0, "Mario Caled", "Leon Perez", "10514887", "25/01/1998");
        clientes.add(cliente0);
        Cliente cliente1=new Cliente(1, "Jose", "Leon Perez", "12457898", "26/02/1997");
        clientes.add(cliente1);
        Cliente cliente2=new Cliente(2, "Andrés", "Delgado Flores", "10214502", "25/01/1998");
        clientes.add(cliente2);
        Cliente cliente3=new Cliente(3, "Jorge", "del carpio soto", "23659887", "25/02/2004");
        clientes.add(cliente3);
        Cliente cliente4=new Cliente(4, "Armando", "sanchez paredes", "03152648", "27/04/1997");
        clientes.add(cliente4);
                
        
    }
    public static void agregarclientes() {
        String nombre;
        String apellidos;
        String dni;
        String f_nacimiento;
        
            
        
        System.out.println("Agregar Clientes");
        System.out.println("Nombre:");
        nombre=Leer.cadena();
        System.out.println("Apellidos:");
        apellidos=Leer.cadena();
        do{
        System.out.println("DNI:");
        dni=Leer.cadena();
        } while (dniValido(dni)==false || esNumero(dni)==false || dniUnico(dni)==false);
        System.out.println("Fecha de nacimiento:");
        f_nacimiento=Leer.cadena();
        idpersona++;
        Cliente cliente = new Cliente(idpersona, nombre, apellidos, dni, f_nacimiento);
         clientes.add(cliente);
         System.out.println("Resultado: Se agregó un Cliente con éxito");
        
    }
    public static boolean dniValido(String dni) {
        boolean resultado;
        //tamaño 8;
        if(dni.length() == 8){
            resultado=true;
        }
        else{
            error(2);
            resultado = false;
        }
        return resultado;
        
    }
    public static boolean esNumero(String cadena){
     boolean resultado;
        try {
            //para determinar si está compuesto por digitos
            Double.parseDouble(cadena);
            resultado=true;
        } catch (NumberFormatException nfe) {
            error(3);
            resultado = false;
        }
        return resultado;
    }
    public static boolean dniUnico(String dni) {
        boolean resultado = true;
        for (Cliente cliente:clientes) {
            if(cliente.getDni().equals(dni)){
                error(4);
                resultado=false;
                 }
           
        }           
        return resultado;
       }
    public static void eliminarclientes() {
        int elemento;
        listarclientes();
        System.out.println("Indique la posición del elemento a eliminar");
        elemento=Leer.entero();
        elemento--;
        clientes.remove(elemento);
        System.out.println("Resultado: registro del cliente eliminado");
    }
    public static void editarclientes() {
        int elemento;
        listarclientes();
        System.out.print("Indique la posición del elemento a editar");
        elemento=Leer.entero();
        elemento--;
        System.out.println("Resultado: "+ clientes.get(elemento).getObtenerNombreCompleto());
        System.out.print("Nuevo Nombre: ");
        clientes.get(elemento).setNombre(Leer.cadena());
        System.out.print("Nuevo apellido: ");
        clientes.get(elemento).setApellidos(Leer.cadena());
        String dni;
        do{
        System.out.print("Nuevo DNI: ");
        dni=Leer.cadena();
        }while (dniValido(dni)==false || esNumero(dni)==false || dniUnico(dni)==false);
        clientes.get(elemento).setDni(dni);
        System.out.print("Nueva fecha de nacimiento: ");
        clientes.get(elemento).setF_nacimiento(Leer.cadena());
        System.out.println("Resultado: Cliente editado correctamente: ");
        
    }
    public static void listarclientes() {
        System.out.println("Listar Clientes");
        System.out.println("N°\tDni\t\tF_Nacimiento\tApellidos\tNombres");
        int num=0;
        for (Cliente cliente :clientes) {
        num ++;
            System.out.println(num+"\t" + cliente.getDni()+"\t"+cliente.getF_nacimiento()+"\t"+cliente.getApellidos()+"\t"+cliente.getNombre());
        }
            
        
    }
    public static void salir() {
        System.out.println("Gracias por sus visita");
    }
    public static void error(int tipo) {
        switch (tipo){
            case 1:
                System.out.println("Opcion Incorrecta");
                break;
            case 2:
                System.out.println("El DNI debe tener 8 digitos");
                break;
            case 3:
                System.out.println("El DNI debe ser digitos");
                break;
            case 4:
                System.out.println("El DNI debe ser unico");
                break;
            default: 
                System.out.println("error");
        }
    }
    public static void menu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Agregar Clientes");
        System.out.println("2. Eliminar Clientes");
        System.out.println("3. Editar Clientes");
        System.out.println("4. Listar Clientes");
        System.out.println("5. Salir");
        System.out.println("Elija una opción [1-5]");
    }
    public static void inicio() {
        cargarDataSintetica();
        int opcion;
        do {menu();
        opcion=Leer.entero();
        switch(opcion){
            case 1:
                agregarclientes();
                break;
            case 2:
                eliminarclientes();
                break;
            case 3:
                editarclientes();
                break;
            case 4:
                listarclientes();
                break;
            case 5:
                salir();
                break;
            default:
                error(1
                );
                
        }
            
        } while (opcion!=5);
        
        
    }
    public static void main(String[] args) {
        inicio();
    }
}
