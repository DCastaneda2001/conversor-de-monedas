package mx.dcastaneda.operaciones;

import mx.dcastaneda.requests.FactoresDeConversion;

public class DolarAPesoMexicano {

    public static void conversion(double cantidad) {

        double total = cantidad * FactoresDeConversion.getPesoMexicano();

        System.out.println("La cantidad en pesos mexicanos es: $" + String.format("%.2f", total));

    }

}