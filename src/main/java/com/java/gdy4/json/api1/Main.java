package com.java.gdy4.json.api1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.ObjectBuffer;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Main {
    public final static HttpClient HTTP_CLIENT = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

    public static void main(String[] args) {
        // zapytanie do linku
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://api.nbp.pl/api/cenyzlota/last/100/?format=json"))
                .build();

        try {

            // zacięgnięcie odpowiedzi do zapytania
            HttpResponse<String> resp = HTTP_CLIENT.send(request,
                    HttpResponse.BodyHandlers.ofString());

            String responseBody = resp.body(); // cialo odpowiedzi - jest w formacie json

            // deklaruje object mappera żeby odzytać treść (stworzyłam schemat poboieranych danych w NOtowanieCenyZłota)

            ObjectMapper objectMapper = new ObjectMapper();

            // wynikiem będzie lista więc musimy zmapować - NewTypeReference
            List<NotowanieCenyZlota> notowania = objectMapper.readValue(responseBody,
                    new TypeReference<List<NotowanieCenyZlota>>() {
                    });
            notowania.forEach(System.out::println);




        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
