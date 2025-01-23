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
 * @since 1.0
 * @author cristian.matveg
 */

public class Agenda {
    private List<Contacto> contactos;
    private static Scanner teclado = new Scanner(System.in);
    private Contacto contacto;
    
    private String nombre;
    private String telefono;
    private String email;
    
    public Agenda() {
        contactos=new LinkedList<>();
    }
    /**
     * @param contacto es el contacto que quieres crear 
     * @return devuelve verdadero o falso dependiendo de si se crea o no
     */
    public boolean crearContacto(Contacto contacto){
        boolean salida=false;
        if(!contactos.contains(contacto)){
            salida=contactos.add(contacto);
        }
        return salida;
    }
    /**
     * @param nombre es el contacto que quieres consultar
     * @return devuelve el contacto entero cuyo nombre coincide con el dado como parametro
     */
    public Contacto consultarContacto(String nombre){
        for (int i=0;i<contactos.size();i++) {
            Contacto ncontacto=contactos.get(i);
            if (ncontacto.getNombre().equals(nombre)) {
                return ncontacto;
            }
        }
        return null;
    }
    /**
     * @param contacto es el contacto que quieres modificar 
     * @return devuelve verdadero o falso dependiendo de si se modifica o no
     */
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
    /**
     * @param nombre es el nombre por el que buscará el contacto que queremos eliminar
     * @return devuelve true o false dependiendo de si se elimina o no
     */
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
    /**
     * @param
     * @return devuelve la lista de contactos de la agenda metidos en un nuevo ArrayList
     */
    public List<Contacto> listarContactos() {
        return new ArrayList<>(contactos);
    }
    
    public int mostrarNumeroContactos() {
        return contactos.size();
    }
}
