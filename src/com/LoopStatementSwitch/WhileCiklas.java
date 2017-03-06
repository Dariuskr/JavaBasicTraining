package com.LoopStatementSwitch;

import java.util.Scanner;


public class WhileCiklas {

    public void Nesibaigiantis() {
        String x = "";
        Scanner skaneris = new Scanner(System.in);
        System.out.println("Iveskite teksta ");
        while (!x.equals("pabaiga")) {
            x = skaneris.next();
            System.out.println(x);
        }


    }
}

