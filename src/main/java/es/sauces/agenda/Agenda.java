/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.sauces.agenda;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cristian.matveg
 */

public class Agenda {
    private List<Contacto> contactos;
    private static Scanner teclado = new Scanner(System.in);
    private Contacto contacto;
    /**
     * METODOS*
     */
    private String nombre;
    private String telefono;
    private String email;
    
    public Agenda() {
        contactos=new LinkedList<>();
    }
    
    public boolean crearContacto(Contacto contacto){
        boolean salida=false;
        if(!contactos.contains(contacto)){
            salida=contactos.add(contacto);
        }
        return salida;
    }

    public Contacto consultarContacto(String nombre){
        for (int i=0;i<contactos.size();i++) {
            Contacto ncontacto=contactos.get(i);
            if (ncontacto.getNombre().equals(nombre)) {
                return ncontacto;
            }
        }
        return null;
    }

    public boolean modificarContacto(Contacto contacto) {
        for (int i=0;i<contactos.size();i++) {
            Contacto ncontacto=contactos.get(i);
            if (ncontacto.equals(contacto)) {
                contactos.set(i, contacto);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarContacto(String nombre) {
        for (int i=0;i<contactos.size();i++) {
            Contacto ncontacto=contactos.get(i);
            if (ncontacto.getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(ncontacto);
                return true;
            }
        }
        return false;
    }
    
    public List<Contacto> listarContactos() {
        return new ArrayList<>(contactos);
    }
    
    public int mostrarNumeroContactos() {
        return contactos.size();
    }
}
