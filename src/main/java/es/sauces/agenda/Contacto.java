/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.sauces.agenda;

import java.util.Objects;
/**
 * @since 1.0
 * @author cristian.matveg
 */

public class Contacto implements Comparable<Contacto>{
    private String nombre;
    private String telefono;
    private String email;
    
    public Contacto() {
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @param nombre es el nombre del contacto
     * @param telefono es el telefono del contacto
     * @param email es el email del contacto
     */
    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    /**
     * @return devuelve el nombre del contacto
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre establece el nombre del contacto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return devuelve el telefono del contactoo
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * @param telefono establece el telefono del contacto
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * @return devuelve el email del contactoo
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email establece el email del contacto
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nombre + "," + telefono + "," + email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.telefono);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto other = (Contacto) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int compareTo(Contacto o){
        return this.nombre.compareTo(o.nombre);
    }
}
