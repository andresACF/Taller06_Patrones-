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
public class Televisor implements Producto{
    private String marca;
    private String modelo;
    private String tecnologíaPantalla;
    private String diagonalPantalla;
    private String potenciaSonido;
    private String SO;
    private ArrayList<String> fallas;

    public Televisor(String marca, String modelo, String tecnologíaPantalla, String diagonalPantalla, String potenciaSonido, String SO, ArrayList<String> fallas) {
        this.marca = marca;
        this.modelo = modelo;
        this.tecnologíaPantalla = tecnologíaPantalla;
        this.diagonalPantalla = diagonalPantalla;
        this.potenciaSonido = potenciaSonido;
        this.SO = SO;
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

    public String getPotenciaSonido() {
        return potenciaSonido;
    }

    public void setPotenciaSonido(String potenciaSonido) {
        this.potenciaSonido = potenciaSonido;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
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
