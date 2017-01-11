/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author a022593391p
 */
//Clase gestion utiliza objetos profesor
public class Gestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        IES instituto = new IES();

        Scanner sc = new Scanner(System.in);
        ArrayList<Profesor> teacher = new ArrayList<Profesor>();
        String variable;
        String dni, nombre, direccion;
        IES AUSIAS = new IES("id90","Avenida Ausias March", 6);

        do {

            System.out.print("Introduce el dni ");
            dni = sc.nextLine();

            System.out.print("Introduce el nombre ");
            nombre = sc.nextLine();

            System.out.print("Introduce la direccion ");
            direccion = sc.nextLine();

            teacher.add(new Profesor(dni, nombre, direccion, instituto));

            System.out.print("¿ Quieres seguir s/n ? ");
            variable = sc.nextLine();

        } while (variable.equals("s"));

        /*System.out.print("Introduce un profesor ");
            System.out.print("Introduce un calle ");
            Profesor luis = new Profesor("777", "Luis", "calle coma");*/
        for (int i = 0; i < teacher.size(); i++) {
            System.out.print(teacher.get(i));

        }
        
        teacher.get(2).dirigirIES(AUSIAS);
        System.out.print(teacher.get(2));
        //System.out.println();
        
        
        // se crea un objeto profesor llamado teacher1 y le damos 3 propiedades 
        /*
        Profesor teacher1 = new Profesor();
        teacher1.setDni("444");
        teacher1.setNombre("Alberto");
        teacher1.setDireccion("calle ausias");
        */

        // se crea otro objeto profesor llamado teacher2 y le damos 3 propiedades    
        //Profesor teacher2 = new Profesor("555", "Mario", "calle ausias2");

        /* 
        Estos son los metodos para mostrar por pantalla lo que tienen los profesores declarados
        anteriormente 
        */
        //System.out.println(teacher1.toString());
        //System.out.println(teacher2.toString());

    }
    //Profesor luis = new Profesor("777", "Luis", "calle coma");

    //IES ausias = new IES("1", "calle prueba", 6);

}
