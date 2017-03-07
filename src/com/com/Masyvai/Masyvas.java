package com.com.Masyvai;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Masyvas {

    public void arr () {

        Scanner ska = new Scanner(System.in);
       int suma = 0;
       System.out.println("Iveskite 5 skaicius ");
       int x [] = new int[5];
        x[0] = ska.nextInt();
        x[1] = ska.nextInt();
        x[2] = ska.nextInt();
        x[3] = ska.nextInt();
        x[4] = ska.nextInt();

    for (int i = 0 ; i < x.length; i++ ) {
            System.out.println("Jūsų skaičius yra : " + x[i]);
            suma += x[i];
        }

        System.out.println("Suma " + suma);
          }
}





/*Parašyti programą, kuri paprašytų įvesti 5 skaičius. Baigus skaičių įvedimą, turi būti
atvaizduojama įvestų skaičių suma ir visi įvesti skaičiai.*/