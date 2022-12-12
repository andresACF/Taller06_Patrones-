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
public class Laptop implements Producto{
    
    private String marca;
    private String modelo;
    private String SO;
    private int cantidadRam;
    private int Almacenamiento;
    private String tecnologíaPantalla;
    private String diagonalPantalla;
    private String tarjetaGráfica;
    private ArrayList<String> fallas;

    public Laptop(String marca, String modelo, String SO, int cantidadRam, int Almacenamiento, String tecnologíaPantalla, String diagonalPantalla, String tarjetaGráfica, ArrayList<String> fallas) {
        this.marca = marca;
        this.modelo = modelo;
        this.SO = SO;
        this.cantidadRam = cantidadRam;
        this.Almacenamiento = Almacenamiento;
        this.tecnologíaPantalla = tecnologíaPantalla;
        this.diagonalPantalla = diagonalPantalla;
        this.tarjetaGráfica = tarjetaGráfica;
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

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public int getCantidadRam() {
        return cantidadRam;
    }

    public void setCantidadRam(int cantidadRam) {
        this.cantidadRam = cantidadRam;
    }

    public int getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(int Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public String getTecnologíaPantalla() {
        return tecnologíaPantalla;
    }

    public void setTecnologíaPantalla(String tecnologíaPantalla) {
        this.tecnologíaPantalla = tecnologíaPantalla;
    }

    public String getDiagonalPantalla() {
        return diagonalPantalla;
    }

    public void setDiagonalPantalla(String diagonalPantalla) {
        this.diagonalPantalla = diagonalPantalla;
    }

    public String getTarjetaGráfica() {
        return tarjetaGráfica;
    }

    public void setTarjetaGráfica(String tarjetaGráfica) {
        this.tarjetaGráfica = tarjetaGráfica;
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
