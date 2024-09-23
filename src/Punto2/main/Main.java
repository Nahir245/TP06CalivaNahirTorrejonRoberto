package Punto2.main;

import Punto2.model.Efemeride;
import Punto2.util.Mes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Efemeride> efemerides = new ArrayList<>();

        efemerides.add(new Efemeride (1, "Dia de la Bandera", Mes.JUNIO, 20, "Creacion de la Bandera"));
        efemerides.add(new Efemeride (2, "Dia del Exodo", Mes.AGOSTO, 23, "Exodo jujeño"));
        efemerides.add(new Efemeride(3, "Dia del Estudiante", Mes.SEPTIEMBRE, 21, "Fiesta del estudiante"));
        efemerides.add(new Efemeride(4, "Dia de la Madre", Mes.OCTUBRE, 20, "Celebración de las madres"));
        efemerides.add(new Efemeride(5, "Dia del Trabajador", Mes.MAYO, 1, "Fiesta del trabajador"));

        for (Efemeride efemeride : efemerides) {
            System.out.println(efemeride);
        }

     // Aqui elimino una efemeride
        
        efemerides.remove(2);  
        
     // aqui modifico la efemeride
        
        efemerides.get(1).modificar("Exodo", "se celebra en la provincia de jujuy");  

        System.out.println("lanueva lista modificada es:");
        for (Efemeride efemeride : efemerides) {
            System.out.println(efemeride);
        }
    }
}
