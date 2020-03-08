package com.java.gdy4.structures.zad1;

import lombok.*;

import java.util.Comparator;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Osoba implements Comparable<Osoba> {

    private String imie, nazwisko;
    private int wiek;


    @Override
    public int compareTo(Osoba osoba) {
        return Integer.compare(wiek,osoba.getWiek());
    }
}
