/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author tavoberry
 */
public class Empleado {
    //Atributos encapsulados
    private String clave;
    private String nombre;
    private String apellidos;
    private int edad;
    private String rfc;
    private String telefono;

    //constructor de la clase
    public Empleado(){
        clave = "";
        nombre = "";
        apellidos = "";
        edad = 18;
        rfc = "";
        telefono = "";
    }
    
    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
     * Retorna los datos principales de un empleado
     * @return regresa un string 
     */
    public String mostrarDatos(){
        return "Nombre: "+nombre+" Apellidos: "
                +apellidos
                +" Clave: "+clave+" RFC: "+rfc;
    }
    /**
     * Devuelve el nombre y apellidos del empleado
     * @return regresa un String
     */
    public String mostrarNombre(){//Firma
        return nombre+" "+apellidos;
    }
    
    /**
     * Devuelve los apellidos y el nombre del empleado
     * @param x es cualquier número entero
     * @return regresa una cadena
     */
    public String mostrarNombre(int x){
        return apellidos+" "+nombre;
    }
   
}
