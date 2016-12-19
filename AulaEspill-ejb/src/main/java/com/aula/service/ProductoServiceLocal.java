/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aula.service;

import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author Gerard
 */
@Local
public interface ProductoServiceLocal {

    ArrayList listaProductos();

  
    
}
