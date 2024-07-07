package mx.dcastaneda.principal;

import java.util.Scanner;
import mx.dcastaneda.operaciones.*;

public class Switch {

    public static void main(int opcion) {

        Scanner scanner = new Scanner(System.in);

        switch (opcion) {

            case 1:
                System.out.println("Ingrese la catidad de dolares: ");
                double catidadDolar = scanner.nextInt();
                DolarAPesoMexicano.conversion(catidadDolar);
                break;

            case 2:
                System.out.println("Ingrese la catidad de pesos: ");
                double catidadPeso = scanner.nextInt();
                PesoMexicanoADolar.conversion(catidadPeso);
                break;

            case 3:
                System.out.println("Ingrese la catidad de dolares: ");
                double catidadDolar2 = scanner.nextInt();
                DolarAPesoArgentino.conversion(catidadDolar2);
                break;

            case 4:
                System.out.println("Ingrese la catidad de pesos: ");
                double catidadPeso2 = scanner.nextInt();
                PesoArgentinoADolar.conversion(catidadPeso2);
                break;

            case 5:
                System.out.println("Ingrese la catidad de dolares: ");
                double catidadDolar3 = scanner.nextInt();
                DolarAPesoColombiano.conversion(catidadDolar3);
                break;

            case 6:
                System.out.println("Ingrese la catidad de pesos: ");
                double catidadPeso3 = scanner.nextInt();
                PesoColombianoADolar.conversion(catidadPeso3);
                break;

            case 7:
                System.out.println("Adios");
                break;

            default:
                System.out.println("Opcion no valida");

        }

        if (opcion != 7) {
            System.out.println("\n\n");
            Principal.main(new String[]{""});
        }

    }

}
