/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory_Method;

import java.util.ArrayList;

/**
 *
 * @author Jorge Daniel
 */
public class Impresora implements Producto{
    
    private String marca;
    private String modelo;
    private boolean tieneWifi;
    private boolean puedeEscanear;
    private ArrayList<String> fallas;

    public Impresora(String marca, String modelo, boolean tieneWifi, boolean puedeEscanear, ArrayList<String> fallas) {
        this.marca = marca;
        this.modelo = modelo;
        this.tieneWifi = tieneWifi;
        this.puedeEscanear = puedeEscanear;
        this.fallas = fallas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isTieneWifi() {
        return tieneWifi;
    }

    public void setTieneWifi(boolean tieneWifi) {
        this.tieneWifi = tieneWifi;
    }

    public boolean isPuedeEscanear() {
        return puedeEscanear;
    }

    public void setPuedeEscanear(boolean puedeEscanear) {
        this.puedeEscanear = puedeEscanear;
    }

    public ArrayList<String> getFallas() {
        return fallas;
    }

    public void setFallas(ArrayList<String> fallas) {
        this.fallas = fallas;
    }
    
    
    
    public String toString(){
        
        return null;
        
    }
}
