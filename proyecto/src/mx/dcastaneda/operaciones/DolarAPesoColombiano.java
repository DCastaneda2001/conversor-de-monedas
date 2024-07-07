package mx.dcastaneda.operaciones;

import mx.dcastaneda.requests.FactoresDeConversion;

public class DolarAPesoColombiano {

    public static void conversion(double cantidad) {

        double total = cantidad * FactoresDeConversion.getPesoColombiano();

        System.out.println("La cantidad en pesos colombianos es: $" + String.format("%.2f", total));

    }

}