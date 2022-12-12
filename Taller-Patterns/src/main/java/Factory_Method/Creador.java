/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory_Method;

import Factory_Method.Producto;

/**
 *
 * @author Jorge Daniel
 */
public abstract class Creador {
    
    //En este método independientemente de cual sea la implementación de las clases hijas, se deben solicitar los datos de la base de datos.
    public abstract Producto crearProducto(String query);
    
}
