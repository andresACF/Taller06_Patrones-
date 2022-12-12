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
public class Garantia extends BaseSolicitud{
    private Solicitud next;
    public static ArrayList<String> cobertura;
    

    @Override
    public void handle(String reclamo, Producto p) {
        if(p.isTieneGarantia()==true){
            this.setNext(next);
        }
        else{
            next.handle(reclamo, p);
        }
    }
}