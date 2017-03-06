package com.LoopStatementSwitch;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Created by Max on 2017.03.06.
 */
public class Ciklas0 {

    public void paskaiciuok() {

        int x = -1;
        System.out.println("Iveskite skaiciu");
        int suma = 0;
        while (x != 0) {
            try {
                Scanner sk = new Scanner(System.in);
                x = sk.nextInt();
                suma += x;
            } catch (InputMismatchException e) {
                System.out.println("Netinkamas skaicius");
            }
        }
        System.out.println("Programa baigta , rezultatas " + suma);
    }
}

//Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0. Pabaigoje
//turi būti atvaizduojama įvestų skaičių suma.
