package com.LoopStatementSwitch;

import java.util.Scanner;

/**
 * Created by Max on 2017.03.06.
 */
public class SalygosSakiniai {
    public void Uzduotysv2() {
        Scanner skaneris = new Scanner(System.in);
        System.out.println("iveskite skaiciu ir as pasakysiu ar jis sveikas ar ne ");
        int skaicius = skaneris.nextInt();
        int suma = skaicius % 2;
        if (suma == 0) {
            System.out.println("Nelyginis");
        } else {

            System.out.println("Lyginis");
        }
    }
}
