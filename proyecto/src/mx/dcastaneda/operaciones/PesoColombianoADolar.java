package mx.dcastaneda.operaciones;

import mx.dcastaneda.requests.FactoresDeConversion;

public class PesoColombianoADolar {

    public static void conversion(double cantidad) {

        double total = cantidad / FactoresDeConversion.getPesoColombiano();

        System.out.println("La cantidad en dolares es: $"  + String.format("%.2f", total));

    }

}