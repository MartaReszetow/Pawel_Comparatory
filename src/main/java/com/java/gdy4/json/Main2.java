package com.java.gdy4.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.gdy4.json.zad2.Recipe;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
           List<Recipe> recipe = objectMapper.readValue(new File("ingredients.json"),
                   new TypeReference<List<Recipe>>(){});
           recipe.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
