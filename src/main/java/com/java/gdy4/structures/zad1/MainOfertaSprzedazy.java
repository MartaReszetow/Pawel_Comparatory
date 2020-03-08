package com.java.gdy4.structures.zad1;

import java.util.*;

public class MainOfertaSprzedazy {
    public static void main(String[] args) {

        List<OfertaSprzedazy> lista = new ArrayList<>(Arrays.asList(
                new OfertaSprzedazy("aaaa", 25.0),
                new OfertaSprzedazy("bbbb", 15.6),
                new OfertaSprzedazy("cccc", 7.6),
                new OfertaSprzedazy("aaaa", 11.0)

        ));


        Collections.sort(lista, new OfertaComparator(true));

        Scanner scanner = new Scanner(System.in);

        String komenda;

        do {
            System.out.println("Podaj komendę:");
            komenda = scanner.nextLine();

            if (komenda.equalsIgnoreCase("listuj")) {
                lista.forEach(System.out::println);
                System.out.println();
            } else if (komenda.equalsIgnoreCase("sortuj malejąco")) {
                Collections.sort(lista, new OfertaComparator(true));
            } else if (komenda.equalsIgnoreCase("sortuj rosnąco")) {
                Collections.sort(lista, new OfertaComparator(false));
            } else if (komenda.startsWith("dodaj")) {

                String [] slowa = komenda.split(" ");
                String nazwa = slowa[1];
                Double cena = Double.parseDouble(slowa[2]);

                OfertaSprzedazy ofertaSprzedazy = new OfertaSprzedazy(nazwa,cena);
                lista.add(ofertaSprzedazy);
                System.out.println("Dodano" + ofertaSprzedazy);

            } else if (!komenda.equalsIgnoreCase("quit")) {
                System.err.println("Nie rozpoznałem komendy");
            }
        }
        while (!komenda.equalsIgnoreCase("quit"));


    }
}
