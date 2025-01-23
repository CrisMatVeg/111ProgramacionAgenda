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
            System.out.println("5- Listar Contactos");
            System.out.println("6- Numero de Contactos");
            System.out.println("0- Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion >= 1 && opcion <= 6) {
                if (opcion == 1) {
                    System.out.print("Introduzca nombre: ");
                    nombre = teclado.nextLine();
                    System.out.print("Introduzca teléfono: ");
                    telefono = teclado.nextLine();
                    System.out.print("Introduzca email: ");
                    email = teclado.nextLine();
                    Contacto nuevo = new Contacto(nombre, telefono, email);
                    if(agenda.crearContacto(nuevo)){
                        System.out.println("Contacto añadido.");
                    }else{
                        System.out.println("El contacto ya existe.");
                    }
                } else {
                    switch (opcion) {
                        case 2 -> {
                            System.out.println("Introduzca nombre del contacto");
                            nombre = teclado.nextLine();
                            contacto=agenda.consultarContacto(nombre);
                            if(contacto!=null){
                                System.out.println(contacto);
                            }else{
                                System.out.println("No se encontro el contacto");
                            }
                        }
                        case 3 -> {
                            System.out.print("Introduzca nombre: ");
                            nombre = teclado.nextLine();
                            System.out.print("Introduzca teléfono: ");
                            telefono = teclado.nextLine();
                            System.out.print("Introduzca email: ");
                            email = teclado.nextLine();
                            contacto = new Contacto(nombre, telefono, email);
                            if(agenda.modificarContacto(contacto)){
                                System.out.println("Contacto Modificado "+contacto);
                            }else{
                                System.out.println("No pudo ser modificado "+contacto);
                            }
                        }

                        case 4 -> {
                            System.out.print("Introduce nombre:");
                            nombre=teclado.nextLine();
                            if(agenda.eliminarContacto(nombre)){
                                System.out.println("Contacto eliminado");
                            }else{
                                System.out.println("No se pudo eliminar el contacto, puede que no se haya encontrado");
                            }
                        }
                    }
                }
                switch (opcion) {
                    case 5 -> {
                        System.out.println(agenda.listarContactos());
                    }
                    case 6 -> {
                        System.out.println(agenda.mostrarNumeroContactos());
                    }
                }
            } else {
                System.out.println("Adios");
            }
        } while (opcion != 0);
    }
}
