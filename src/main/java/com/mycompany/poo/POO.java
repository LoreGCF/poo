

package com.mycompany.poo;


public class POO {

    public static void main(String[] args) {
       
        Alumno alu1 = new Alumno();
        
        Alumno alu2 = new Alumno(5, "Lorena","Cabana Flores");
        
        System.out.println("La id del alumno es: "+ alu2.getId());
        System.out.println("El nombre es: "+alu2.getNombre());
        System.out.println("El apellido es: "+ alu2.getApellido());
        
        alu1.setId(8);
        alu1.setNombre("suscribite");
        alu1.setApellido("Garcia");
        
        
        System.out.println("---------------");
        System.out.println("La id del alumno 1 es: "+ alu1.getId());
        System.out.println("El nombre es: "+alu1.getNombre());
        System.out.println("El apellido es: "+ alu1.getApellido());
        
        
        
        
    }
}
