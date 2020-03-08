package com.java.gdy4.structures.zad1;

import java.util.*;

public class MainComparable {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Jan", "Kowalski", 25);
        Osoba o2 = new Osoba("Janek", "Wiśniewski", 18);
        Osoba o3 = new Osoba("Adam", "Małysz", 35);
        Osoba o4 = new Osoba("Stefan", "Batory", 42);
        Osoba o5 = new Osoba("Maja", "Lis", 17);

        List<Osoba> list = new ArrayList<>(Arrays.asList());
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        list.add(o5);

        list.forEach(System.out::println);
        System.out.println();

        Collections.sort(list);

        list.forEach(System.out::println);
        System.out.println();

    }
}
