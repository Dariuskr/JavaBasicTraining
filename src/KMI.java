import java.util.Scanner;

/**
 * Created by Max on 2017.03.03.
 */
public class KMI {

    public static void main (String[] args)
    {

        Scanner skaneris = new Scanner(System.in);
           System.out.println("Ši programa apskaičiuos jūsų KMI");
           System.out.println("Įveskite savo svorį");
           double skaicius = skaneris.nextInt();
           System.out.println("Įveskite savo ūgį");
           double skaicius1 = skaneris.nextInt();
           Math.pow(skaicius1,2);

           double suma = skaicius / skaicius1;

           System.out.println("Jūsų Kmi yra" + suma);

    }
}
