package Punto1.model;

import Punto1.util.Categoria;
import Punto1.util.Origen;

public class Producto {
    private String codigo;
    private String descripcion;
    private double precioUnitario;
    private Origen origenFabricacion;
    private Categoria categoria;

    public Producto(String codigo, String descripcion, double precioUnitario, 
                    Origen origenFabricacion, Categoria categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.origenFabricacion = origenFabricacion;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", origenFabricacion=" + origenFabricacion +
                ", categoria=" + categoria +
                '}';
    }
}


