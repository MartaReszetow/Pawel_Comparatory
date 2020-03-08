package com.java.gdy4.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.gdy4.json.zad3.MenuInspector;

import java.io.File;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            MenuInspector menuInspector = objectMapper.readValue(new File("menuItem.json"), MenuInspector.class);
            menuInspector.getMenuItems().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
