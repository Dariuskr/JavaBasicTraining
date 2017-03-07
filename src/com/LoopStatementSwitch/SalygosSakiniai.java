package com.LoopStatementSwitch;

import java.util.Scanner;


public class SalygosSakiniai {
    public void Uzduotysv2() {
        Scanner skaneris = new Scanner(System.in);
        System.out.println("iveskite skaiciu ,programa parodys ar jis lyginis ar nelyginis  ");
        int skaicius = skaneris.nextInt();
        int suma = skaicius % 2;
        if (suma == 0) {
            System.out.println("Nelyginis");
        } else {

            System.out.println("Lyginis");
        }
    }
}

