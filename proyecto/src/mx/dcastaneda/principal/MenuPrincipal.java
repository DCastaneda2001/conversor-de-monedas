package mx.dcastaneda.principal;

import java.util.Scanner;

public class MenuPrincipal {

    private static int opcionSeleccionada;

    public static int getOpcionSeleccionada() {

        String menuDeOpciones = """
            ****************************************
            1) Dolar =>> Peso mexicano
            2) Peso mexicano =>> Dolar
            3) Dolar =>> Peso argentino
            4) Peso argentino =>> Dolar
            5) Dolar =>> Peso colombiano
            6) Peso colombiano =>> Dolar
            7) Salir
            Elija una opcion valida:
            ****************************************
            """;

        System.out.println(menuDeOpciones);
        Scanner teclado = new Scanner(System.in);
        opcionSeleccionada = teclado.nextInt();

        return opcionSeleccionada;

    }

}
