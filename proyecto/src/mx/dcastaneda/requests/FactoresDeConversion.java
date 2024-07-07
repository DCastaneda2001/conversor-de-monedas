package mx.dcastaneda.requests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FactoresDeConversion {

    private static final double PESO_MEXICANO = 18.1569;
    private static final double PESO_ARGENITNO = 906;
    private static final double PESO_COLOMBIANO = 4156.4102;
    private static String FECHA_ACTUALIZACION = "Junio 24, 2024";
    private static double pesoMexicano;
    private static double pesoArgenitno;
    private static double pesoColombiano;

    public static void main(String[] args) throws IOException, InterruptedException {
        String API_KEY = ApiKey.getApiKey();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/"+API_KEY+"/latest/USD"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            JsonObject jsonObject = new Gson().fromJson(response.body(), JsonObject.class);
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            pesoMexicano = conversionRates.get("MXN").getAsDouble();
            pesoArgenitno = conversionRates.get("ARS").getAsDouble();
            pesoColombiano = conversionRates.get("COP").getAsDouble();
        }

//        else {
//            pesoMexicano = PESO_MEXICANO;
//            pesoArgenitno = PESO_ARGENITNO;
//            pesoColombiano = PESO_COLOMBIANO;
//            System.out.println("Fallo de coneccion: las tasas de conversion estaran acciatulazas hasta " + FECHA_ACTUALIZACION);
//        }

    }

    public static double getPesoMexicano() {

        try {
            main(new String[]{""});
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return pesoMexicano;

    }

    public static double getPesoArgenitno() {

        try {
            main(new String[]{""});
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return pesoArgenitno;

    }

    public static double getPesoColombiano() {

        try {
            main(new String[]{""});
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return pesoColombiano;

    }

}
