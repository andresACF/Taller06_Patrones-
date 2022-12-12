/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Logistica {
    private Transporte transporte;
    
    public void setTransporte(Transporte t){
        this.transporte=t;
    }
    public void ejecutarEstrategia(ArrayList<Producto> p, Tienda t){
         transporte.transportar(p,t);
    }
}
