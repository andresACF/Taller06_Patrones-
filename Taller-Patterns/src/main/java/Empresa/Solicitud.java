/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Empresa;

/**
 *
 * @author User
 */
public interface Solicitud {
    
    public void handle(String reclamo,Producto p);
    public void setNext(Solicitud solicitud);
    
    
}
