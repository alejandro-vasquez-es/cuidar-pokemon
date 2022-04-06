package com.org.helpers;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Get {

    public static String[] nameAndUrl (int id){

        String[] data = new String[2];
        try {
            URL url = new URL("https://pokeapi.co/api/v2/pokemon/" + id);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            // Obtener el codigo de respuesta
            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                String inline = "";
                Scanner scanner = new Scanner(url.openStream());

                // Escribir toda la JSON data en un string
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }

                //Cerrar el  scanner
                scanner.close();

                // Usando la libreria JSON simple para convertir el string en un JSON
                JSONParser parse = new JSONParser();
                JSONObject data_obj = (JSONObject) parse.parse(inline);

                // Obtiene el nombre del pokemon
                String name = data_obj.get("name").toString();
                data[0] = name;

                //Obtiene un objeto de los sprites
                JSONObject obj = (JSONObject) data_obj.get("sprites");
                JSONObject other = (JSONObject) obj.get("other");
                JSONObject officialArtwork = (JSONObject) other.get("official-artwork");
                String urlPoke = officialArtwork.get("front_default").toString();
                data[1] = urlPoke;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
            return data;
    }

}
