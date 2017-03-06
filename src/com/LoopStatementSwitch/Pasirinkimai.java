package com.LoopStatementSwitch;

import java.util.Scanner;


public class Pasirinkimai {

    public void switchas(){
         System.out.println ("Sveiki , pasirinkite skaičių nuo 1 iki 4 ");
        Scanner skaneris = new Scanner(System.in);
        int ivestasSkaicius = skaneris.nextInt();
        switch(ivestasSkaicius){
            case 1:
                System.out.println ("Jus pasirinkote 1 ");
                break;
            case 2:
                System.out.println ("Jus pasirinkote 2 ");
                break;
            case 3:
                System.out.println ("Jus pasirinkote 3 ");
                break;
            case 4:
                System.out.println ("Jus pasirinkote 4 ");

                default: System.out.println ("Jusų pasirinkimas yra klaidingas");
                break;
        }


    }
}
