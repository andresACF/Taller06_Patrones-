/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author User
 */
class Producto {
    
    private boolean tieneGarantia;
    private boolean existeBodega;
    private boolean aprobadoGerente;
    private boolean tieneFallas;
    private int precioVenta;

    public int getPrecioVenta() {
        return precioVenta;
    }

    public boolean isTieneGarantia() {
        return tieneGarantia;
    }

    public void setTieneGarantia(boolean tieneGarantia) {
        this.tieneGarantia = tieneGarantia;
    }

    public boolean isExisteBodega() {
        return existeBodega;
    }

    public void setExisteBodega(boolean existeBodega) {
        this.existeBodega = existeBodega;
    }

    public boolean isAprobadoGerente() {
        return aprobadoGerente;
    }

    public void setAprobadoGerente(boolean aprobadoGerente) {
        this.aprobadoGerente = aprobadoGerente;
    }

    public boolean isTieneFallas() {
        return tieneFallas;
    }

    public void setTieneFallas(boolean tieneFallas) {
        this.tieneFallas = tieneFallas;
    }
    
}
