/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aula.service;

import com.aula.domain.Producto;
import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author Gerard
 */
@Stateless
public class ProductoService implements ProductoServiceLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    static ArrayList<Producto> productos = new ArrayList();
    static{
        productos.add(new Producto ("1", "p1", "producto", "img/portfolio/thumbnails/1.jpg", 300.0));
        productos.add(new Producto ("2", "p2", "producto", "img/portfolio/thumbnails/2.jpg", 350.0));
        productos.add(new Producto ("3", "p3", "producto","img/portfolio/thumbnails/3.jpg", 400.0));
        productos.add(new Producto ("4", "p4", "producto","img/portfolio/thumbnails/4.jpg", 500.0));
        productos.add(new Producto ("5", "p5", "producto","img/portfolio/thumbnails/5.jpg", 300.0));
        productos.add(new Producto ("6", "p6", "producto", "img/portfolio/thumbnails/6.jpg", 250.0));
    }

    @Override
    public ArrayList listaProductos() {
        return productos;
    }

    
    
    
    
    
}
