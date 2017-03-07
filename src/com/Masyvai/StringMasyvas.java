package com.Masyvai;

import java.util.Scanner;


public class StringMasyvas {
   private String x[];

    public void Stringas(int y) {

        Scanner sk = new Scanner(System.in);
        x = new String[y];
        // System.out.println("Jus ivedete " + x);
        for (int i = 0; i < x.length; i++) {
            System.out.println("Iveskite zodį");
            x[i] = sk.nextLine();
            System.out.println(  "Jūsų" + (i + 1) + "žodis yra = " + x[i]);


        }


    }
}






