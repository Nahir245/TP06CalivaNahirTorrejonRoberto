package Punto4.main;

import Punto4.model.Compra;
import Punto1.model.Producto;
import Punto1.util.Origen;
import Punto1.util.Categoria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("1", "iphone", 50000, Origen.ARGENTINA, Categoria.TELEFONIA));
        productos.add(new Producto("2", "Notebook", 120000, Origen.CHINA, Categoria.INFORMATICA));
        productos.add(new Producto("3", "Televisor", 75000, Origen.BRASIL, Categoria.ELECTROHOGAR));
        productos.add(new Producto("4", "Taladro", 35000, Origen.URUGUAY, Categoria.HERRAMIENTAS));
        productos.add(new Producto("5", "Router", 20000, Origen.CHINA, Categoria.INFORMATICA));
        productos.add(new Producto("6", "Aire Acondicionado", 150000, Origen.ARGENTINA, Categoria.ELECTROHOGAR));
        productos.add(new Producto("7", "Microondas", 45000, Origen.BRASIL, Categoria.ELECTROHOGAR));
        productos.add(new Producto("8", "Impresora", 25000, Origen.CHINA, Categoria.INFORMATICA));
        productos.add(new Producto("9", "Celular", 65000, Origen.ARGENTINA, Categoria.TELEFONIA));
        productos.add(new Producto("10", "Monitor", 30000, Origen.BRASIL, Categoria.INFORMATICA));

        // Crear tres compras
        Compra compra1 = new Compra(1, LocalDate.now(), productos.get(0), 2);
        Compra compra2 = new Compra(2, LocalDate.now(), productos.get(1), 1);
        Compra compra3 = new Compra(3, LocalDate.now(), productos.get(2), 3);

        Compra[] compras = {compra1, compra2, compra3};

        // Mostrar recibos
        for (Compra compra : compras) {
            compra.imprimirRecibo();
        }
    }
}