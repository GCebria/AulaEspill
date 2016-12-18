/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aula.service;

import com.aula.domain.Alumno;
import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author Gerard
 */
@Stateless
public class AlumnoService implements AlumnoServiceLocal {

    static ArrayList<Alumno> alumnos = new ArrayList();
    static{
    alumnos.add(new Alumno("1", "alumno", "alumno") );
    alumnos.add(new Alumno("2", "alumno2", "alumno2") );
    }

   

    @Override
    public Alumno loginUser(String nombre, String password) {
        Alumno a=null; 
        Boolean encontrado = false;
        for (int i = 0; i < alumnos.size()&& encontrado==false; i++) {
            if(alumnos.get(i).getNombre().equals(nombre) && alumnos.get(i).getPassword().equals(password)){
                a = alumnos.get(i);
                encontrado = true; 
            }
        }
        
        return a;
    }
    
    
    
}
