package org.bedu.java.jse.basico.Reto01;

public class Saludos {

    public static void main(String[] args) {

        estudiante estudiante = new estudiante();
        estudiante.setNombre("Juan Pablo");
        estudiante.setApellido("Ramos González");

        System.out.println("Hola: " + estudiante.getNombre() + " " + estudiante.getApellido());

    }

}
