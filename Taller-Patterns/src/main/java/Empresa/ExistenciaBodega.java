/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author User
 */
public class ExistenciaBodega extends BaseSolicitud{
    private Solicitud next;

    @Override
    public void handle(String reclamo, Producto p) {
       if(p.isExisteBodega()==true){
           this.setNext(next);
       } 
    }
}