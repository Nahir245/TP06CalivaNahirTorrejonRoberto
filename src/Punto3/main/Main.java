package Punto3.main;

import Punto3.model.Provincia;
import Punto3.util.Region;

public class Main {
    public static void main(String[] args) {
        Provincia[] provincias = new Provincia[10];
        provincias[0] = new Provincia(1, "Jujuy", Region.NOA, 200, 5, true);
        provincias[1] = new Provincia(2, "Buenos Aires", Region.CENTRO, 180, 3, true);
        provincias[2] = new Provincia(3, "Mendoza", Region.CUYO, 600, 2, true);
        provincias[3] = new Provincia(4, "Chubut", Region.PATAGONIA, 700, 2, true);
        provincias[4] = new Provincia(5, "Corrientes", Region.NEA, 150, 5, true);
        provincias[5] = new Provincia(6, "Chaco", Region.NEA, 900, 3, false);
        provincias[6] = new Provincia(7, "La Rioja", Region.CUYO, 200, 5, false);
        provincias[7] = new Provincia(8, "Neuquen", Region.PATAGONIA, 300, 3, false);
        provincias[8] = new Provincia(9, "La Pamapa", Region.PATAGONIA, 480, 2, false);
        provincias[9] = new Provincia(10, "Santa Cruz", Region.PATAGONIA, 400, 8, false);

        System.out.println("Provincias con estado verdadero:");
        for (Provincia provincia : provincias) {
            if (provincia.isEstado()) {
                System.out.println(provincia);
            }
        }
    }
}
