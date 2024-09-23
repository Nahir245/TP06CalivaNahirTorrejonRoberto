package Punto4.model;


import java.time.LocalDate;

import Punto1.model.Producto;

public class Compra {
 private int codigo;
 private LocalDate fechaCompra;
 private Producto producto;
 private int cantidad;

 public Compra(int codigo, LocalDate fechaCompra, Producto producto, int cantidad) {
     this.codigo = codigo;
     this.fechaCompra = fechaCompra;
     this.producto = producto;
     this.cantidad = cantidad;
 }

 public void imprimirRecibo() {
     System.out.println("Compra: " + codigo);
     System.out.println("Fecha: " + fechaCompra);
   System. out.println("Producto: " + producto);
     System.out.println("Cantidad: " + cantidad);
    System.out.println("Total: " + (producto.getPrecioUnitario()* cantidad));
 }
}

