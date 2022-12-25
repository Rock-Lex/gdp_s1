import java.util.Scanner;
import java.util.Timer;

public class VollkomendeZahlEff {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Option 1-xxx: Zahlüberprüfung");
        System.out.println("Option 0: exit");
        System.out.println("Geben Sie bitte den Zahl zu prüfen: ");


        while (true)
        {
            int zahl = scanInt(scanner);

            if(zahl == 0)
            {
                break;
            }
            if(zahl < 0)
            {
                System.out.println("Falsche Zahl. Versuchen Sie nochmal");
            }
            else {
                System.out.println(isVollkomendeEff(zahl));
                System.out.println(isVollkomende(zahl));
            }
        }
//        for(int i = 1; i < 1000; ++i)
//        {
//            System.out.println(i + " : " + isVollkomende(i));
//        }
    }

    public static boolean isVollkomendeEff(int zahl)
    {
        long timer = System.currentTimeMillis();
        if (zahl % 2 != 0)
            return false;

        int summe = 0;


        for (int i = 1; i <= Math.sqrt(zahl); ++i) // round(..., 0)
        {
            if(zahl % i == 0)
            {
                if(i == 1)
                    summe+=i;
                else {
                    summe += i + zahl/i;
                }
            }
        }
        System.out.println("Diff vollkomende Effe: " + (System.currentTimeMillis() - timer));
        return summe==zahl;
    }

    public static boolean isVollkomende(int zahl)
    {
        long timer = System.currentTimeMillis();

        if (zahl % 2 != 0)
            return false;

        int summe = 0;

        for (int i = 1; i <= zahl/2; ++i)
        {
            if(zahl % i == 0)
                summe += i;
        }
        System.out.println("Diff vollkomende: " + (System.currentTimeMillis() - timer));

        return summe==zahl;
    }

    public static int scanInt(Scanner scanner)
    {
        while (true)
        {
            try {
                int num = scanner.nextInt();
                scanner.nextLine();
                return num;
            }
            catch(Exception e)
            {
                System.out.println("Scanning of int went wrong: " + e);
                System.out.println("Versuchen Sie noch mal");
                scanner.nextLine();
            }
        }
    }
}
