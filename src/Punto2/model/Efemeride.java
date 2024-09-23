package Punto2.model;

import Punto2.util.Mes;

public class Efemeride {
    private int codigo;
    private String nombre;
    private Mes mes;
    private int dia;
    private String detalle;

    public Efemeride(int codigo, String nombre, Mes mes, int dia, String detalle) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.mes = mes;
        this.dia = dia;
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Efemeride{" + "nombre='" + nombre + '\'' + ", dia=" + dia + ", mes=" + mes + ",   detalle='" + detalle +'}';
    }

    public void modificar(String nombre, String detalle) {
        this.nombre = nombre;
        this.detalle = detalle;
    }
}
