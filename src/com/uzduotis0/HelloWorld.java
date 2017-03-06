package com.uzduotis0;

import java.util.Scanner;


public class HelloWorld {
    public void HelloWorldd() {
        Scanner skaneris = new Scanner(System.in);
        System.out.print("Įveskite savo vardą ");
        String vardas = skaneris.nextLine();


        for (int i=0; i<5; i++)   {
            System.out.println("Jūsų vardas " + vardas);


        }
    }
}
