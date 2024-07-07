package mx.dcastaneda.operaciones;

import mx.dcastaneda.requests.FactoresDeConversion;

public class PesoArgentinoADolar {

    public static void conversion(double cantidad) {

        double total = cantidad / FactoresDeConversion.getPesoArgenitno();

        System.out.println("La cantidad en dolares es: $"  + String.format("%.2f", total));

    }

}