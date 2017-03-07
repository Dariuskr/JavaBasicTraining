package com.Masyvai;

import java.util.Scanner;

public class Masyvas2TEST {

    int x[];

    public void Uzduotis1_7(int y) {


        Scanner sk = new Scanner(System.in);
        x = new int[y];
        for (int i = 0; i < x.length;
             i++) {
            System.out.println("Iveskite " + (i + 1) + " skaičių ");
            x[i] = sk.nextInt();

        }
    }

    public void suskaiciuoti() {
        int suma = 0;

        for (int i = 0; i < x.length; i++) {

            suma += x[i];
        }


    }
}





