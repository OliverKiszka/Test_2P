package pl.kurs.task2;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //zakładając że argumentem metody stworzKolo() jest srednica gdyż sout wypisuje promien (ktory jest o polowe mniejszy)

        List<Figura> figury = Arrays.asList(Figura.stworzKwadrat(10), Figura.stworzKolo(20), Figura.stworzProstokat(10, 20));
        for (Figura f : figury) { //brakuje nawiasu zamykającego
            System.out.println(f);
        }

        System.out.println("Figura z najwiekszym obwodem to: " + Figura.getFiguraWithHighestPerimeter(figury));
        System.out.println("Figura z najwiekszym polem to: " + Figura.getFiguraWithHighestArea(figury));

        System.out.println(figury.contains(new Kwadrat(10))); //powinno wypisac true

    }
}

