package com.java.gdy4.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.gdy4.json.zad1.RecipiesResponse;

import java.io.File;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            RecipiesResponse recipiesResponse = objectMapper.readValue(new File("recipies.json"), RecipiesResponse.class);
            recipiesResponse.getResults().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
