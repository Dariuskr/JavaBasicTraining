package com.Masyvai;

import java.util.Scanner;


public class Masyvas1 {
    private int x[] ;
    public void Nuskaityti(int y) {
        Scanner sk = new Scanner(System.in);
        x=  new int[y];
        // System.out.println("Jus ivedete " + x);
        for (int i = 0; i < x.length;
             i++) {
            System.out.println("Iveskite " + (i + 1) + " Sveika skaičių ");
            x[i] = sk.nextInt();

        }

        }


    public void suskaiciuoti() {
        int suma = 0;

        for (int i = 0; i < x.length; i++) {
            System.out.println("Ivestas skaicius " + x[i]);
            suma += x[i];
        }
        System.out.println("Jūsų suma yra " + suma);

    }
}



/* ​Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti, tuomet duoti jam įvesti tiek
skaičių, kiek jis pasirinko. Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni
nei 100. */