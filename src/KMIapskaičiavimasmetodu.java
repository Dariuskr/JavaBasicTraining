import java.util.Scanner;

/**
 * Created by Darius on 2017.03.03.
 */
public class KMIapskaičiavimasmetodu {
    public static void main(String[] args) {
        Scanner skaneris = new Scanner(System.in);
        System.out.println("Įveskite savo ūgį");
        double ugis = skaneris.nextDouble();
        System.out.println("Įveskite savo svorį");
        double svoris = skaneris.nextDouble();
        Skaiciavimas naujas = new Skaiciavimas();
        naujas.Apskaiciuok(ugis, svoris);
    }


}

class Skaiciavimas {
    public  double Apskaiciuok(double ugis, double svoris) {
        Math.pow(ugis, 2);
        double result = svoris / ugis;
        result = result* 10;
        result = Math.floor(result);
        result = result/10;
        System.out.println("Tavo KMI yra" + result);
        return result;
    }
}