package com.company;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();

        Persona.setnombre("Nicolas");
        Persona.setedad(30);
        Persona.settelefono(640194557);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());


    }
}

class Persona {
   private String nombre;
   private int edad;
   private String telefono;

    public void setnombre(String nombre) {
       this.nombre = nombre;
   }
    public String getNombre() {
        return this.nombre;

    }
   public void setedad(int edad) {
        this.edad = edad;
   }
   public int getEdad() {
        return this.edad;
   }
   public void settelefono(String telefono) {
        this.telefono = telefono;
   }
   public String getTelefono() {
        return this.telefono;
   }

}