package mx.dcastaneda.operaciones;

import mx.dcastaneda.requests.FactoresDeConversion;

public class DolarAPesoArgentino {

    public static void conversion(double cantidad) {

        double total = cantidad * FactoresDeConversion.getPesoArgenitno();

        System.out.println("La cantidad en pesos argenitinos es: $" + String.format("%.2f", total));

    }

}