package com.uzduotis1;

import java.util.Scanner;


public class Ilgis {

    public void Ilgiss() {

        Scanner skaneris = new Scanner(System.in);
        System.out.println("Įveskite Žodį ir aš pasakysiu , kokio jis ilgio ");
        String eilute = skaneris.nextLine();
        System.out.println(eilute.length());


    }

}
