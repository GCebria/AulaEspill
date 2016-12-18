/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aula.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Gerard
 */
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String idUser;
    private String nombre;
    private String password;

    public Alumno(String idUser, String nombre, String password) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.password = password;
    }

    public Alumno() {
    }
    
    
    

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.idUser);
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
        final Alumno other = (Alumno) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idUser=" + idUser + ", nombre=" + nombre + ", password=" + password + '}';
    }

    
    
}
