package Punto1.main;

import Punto1.model.Producto;
import Punto1.util.Categoria;
import Punto1.util.Origen;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        
      

       productos.add(new Producto("1", "celular", 50000, Origen.ARGENTINA, Categoria.TELEFONIA));
       productos.add(new Producto("2", "computadora", 980000, Origen.CHINA, Categoria.INFORMATICA));
       productos.add(new Producto("3", "cocina", 80000, Origen.BRASIL, Categoria.ELECTROHOGAR));
       productos.add(new Producto("4", "taladro", 85000, Origen.URUGUAY, Categoria.HERRAMIENTAS));
       productos.add(new Producto("5", "amoladora", 150000, Origen.ARGENTINA, Categoria.HERRAMIENTAS));

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}






