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
public class Automotriz implements Transporte {
    String cliente;
    Tienda destino;
    String placa;
    String Conductor;
    ArrayList<Producto> productos;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Tienda getDestino() {
        return destino;
    }

    public void setDestino(Tienda destino) {
        this.destino = destino;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getConductor() {
        return Conductor;
    }

    public void setConductor(String Conductor) {
        this.Conductor = Conductor;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public void transportar(ArrayList<Producto> p, Tienda destino) {
       this.destino=destino;
        this.setProductos(p);
      System.out.println("Se transporta por tierra");
    }
    
}
