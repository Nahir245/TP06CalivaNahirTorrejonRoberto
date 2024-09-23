package Punto3.model;


import Punto3.util.Region;

public class Provincia {
    private int identificador;
    private String nombre;
    private Region region;
    private int poblacion;
    private double superficie;
    private boolean estado;

    public Provincia(int identificador, String nombre, Region region, int poblacion, double superficie, boolean estado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.region = region;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.estado = estado;
    }
    
// aqui calculo la densidad
    
    public double calcularDensidad() {
        return poblacion / superficie;
    }

    @Override
    public String toString() {
        return "identificador = " + identificador + "   nombre =" + nombre + "  region = " + region + " poblacion  = " + poblacion + " superficie = " + superficie +   " densidad poblacional = " + calcularDensidad();
    }

    public boolean isEstado() {
        return estado;
    }
}
