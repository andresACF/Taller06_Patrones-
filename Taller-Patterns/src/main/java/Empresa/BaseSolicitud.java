/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author User
 */
public abstract class BaseSolicitud implements Solicitud{

    public BaseSolicitud(Solicitud next) {
        this.next = next;
    }
    private Solicitud  next;
    
    @Override
    public abstract void handle(String reclamo, Producto p);
    @Override
    public void setNext(Solicitud solicitud){
        next=solicitud;
    }
    
    
}
