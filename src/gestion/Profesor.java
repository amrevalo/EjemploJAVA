/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

/**
 *
 * @author a022593391p
 */


public class Profesor { //clase

    /**
     * @param args the command line arguments
     */
    private String dni; //atributos
    private String nombre;
    private String ape1;
    private String ape2;
    private String direccion;
    private IES instituto; //meto atributo ies en profesor
    
    public Profesor(){}
    
    /**
           * Constructor.
           * @param i: contiene dni.
           * @param n: contiene nombre.
           * @param d: contiene direccion.
           */
    public Profesor(String i, String n, String d, IES e){
        this.dni = i;
        this.nombre = n;
        this.direccion = d;
        this.instituto = e;
        
    }
    // Metodo para crear instituto dentro de profesor
   public void dirigirIES(IES ins){
       this.instituto = ins;
   }
    
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Profesor{" + "dni=" + dni + ", nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", direccion=" + direccion + '}';
    }

   
   
    
        
        

    
    
    
    
    
    

        
    }

