/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author User
 */
public class Fallas extends BaseSolicitud{
    private Solicitud next;
    
    public void setNext(Solicitud solicitud){
        next=solicitud;
    }

    @Override
    public void handle(String reclamo, Producto p) {
        for(String cubertuea: Garantia.cobertura){
            if(reclamo==cubertuea){
                this.setNext(next);
        }
        
        }
        
    }
}
