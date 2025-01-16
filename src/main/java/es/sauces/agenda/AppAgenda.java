/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package es.sauces.agenda;

import java.util.Scanner;

/**
 *
 * @author cristian.matveg
 */
public class AppAgenda {

    public static void main(String[] args) {
        Contacto contacto = null;
        Agenda agenda;
        int opcion;
        agenda=new Agenda();
        String nombre, email, telefono, seguro;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("1- Crear Contacto");
            System.out.println("2- Consultar Contacto");
            System.out.println("3- Modificar Contacto");
            System.out.println("4- Eliminar Contacto");
            System.out.println("0- Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion >= 1 && opcion <= 4) {
                System.out.println("Introduzca nombre del contacto");
                nombre = teclado.nextLine();
                if (opcion == 1) {
                    if (contacto == null) {
                        System.out.println("Introduzca telefono del contacto:");
                        telefono = teclado.nextLine();
                        System.out.println("Introduzca email del contacto:");
                        email = teclado.nextLine();
                        agenda.crearContacto(nombre, telefono, email);
                        System.out.println("Contacto creado con exito: " + contacto);
                    } else {
                        System.out.println("No se puede crear el contacto");
                    }
                } else {
                    if (contacto != null && nombre.equals(contacto.getNombre())) {
                        switch (opcion) {
                            case 2 -> {
                                System.out.println("Introduzca nombre del contacto");
                                nombre = teclado.nextLine();
                                contacto=agenda.consultarContacto(nombre);
                                if(contacto!=null){
                                    System.out.println(contacto);
                                }else{
                                    System.out.println("No se encontró el contacto");
                                }
                            }
                            case 3 -> {
                                System.out.println("Introduzca nombre del contacto");
                                nombre = teclado.nextLine();
                                contacto=agenda.consultarContacto(nombre);
                                if(contacto!=null){
                                    System.out.println(contacto);
                                    System.out.print("Introduce telefono:");
                                    telefono=teclado.nextLine();
                                    System.out.print("Introduce email:");
                                    email=teclado.nextLine();
                                    contacto.setTelefono(telefono);
                                    contacto.setEmail(email);
                                    if(agenda.modificarContacto(contacto)){
                                        System.out.println("Modificado"+contacto);
                                    }else{
                                        System.out.println("No pudo ser modificado"+contacto);
                                    }
                                }else{
                                    System.out.println("No existe contacto");
                                }
                            }
                            case 4 -> {
                                System.out.print("Introduce telefono:");
                                telefono=teclado.nextLine();
                                contacto=agenda.consultarContacto(nombre);
                                if(contacto!=null){
                                    seguro=teclado.nextLine();
                                }else{
                                    System.out.println("No existe contacto");
                                }
                                
                            }
                        }
                    } else {
                        System.out.println("No se encontró el contacto");
                    }
                }
            } else {
                System.out.println("Adios");
            }
        } while (opcion != 0);
    }
}
