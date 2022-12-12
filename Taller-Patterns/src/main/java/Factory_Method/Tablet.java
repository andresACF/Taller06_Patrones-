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
public class Tablet implements Producto{

    private String marca;
    private String modelo;
    private boolean soportaSim;
    private String SO;
    private int cantidadRam;
    private int Almacenamiento;
    private String tecnologíaPantalla;
    private String diagonalPantalla;
    private ArrayList<String> fallas;

    public Tablet(String marca, String modelo, boolean soportaSim, String SO, int cantidadRam, int Almacenamiento, String tecnologíaPantalla, String diagonalPantalla, ArrayList<String> fallas) {
        this.marca = marca;
        this.modelo = modelo;
        this.soportaSim = soportaSim;
        this.SO = SO;
        this.cantidadRam = cantidadRam;
        this.Almacenamiento = Almacenamiento;
        this.tecnologíaPantalla = tecnologíaPantalla;
        this.diagonalPantalla = diagonalPantalla;
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

    public boolean isSoportaSim() {
        return soportaSim;
    }

    public void setSoportaSim(boolean soportaSim) {
        this.soportaSim = soportaSim;
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
