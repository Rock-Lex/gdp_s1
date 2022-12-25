import java.util.Scanner;
import java.text.NumberFormat;

public class Zinsen {

    public static int scanInt(Scanner scanner)
    {
        try {
            int num = scanner.nextInt();
            scanner.nextLine();
            return num;
        }
        catch(Exception e)
        {
            System.out.println("Scanning of int went wrong: " + e);
            System.exit(1);
            return 1;
        }
    }

    public static void printList(Object[] objects)
    {
        for (Object s : objects)
        {
            System.out.println(s);
        }
    }
    public static <T> void println(T objekt)
    {
        System.out.println(objekt);
    }

    public static <T> void print(T objekt)
    {
        System.out.print(objekt);
    }












    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        NumberFormat f  = NumberFormat.getCurrencyInstance();

        println("Anfangskaopital?");
        double kapital = scanInt(scanner);
        println("Wie viel Jahren?");
        int jahren = scanInt(scanner);
        double [] zinssatz = {1.01, 1.015, 1.025, 1.03, 1.045, 1.05, 1.1};
        double [][] saldo = new double[zinssatz.length + 1][jahren+1];

        for(int i = 0; i < saldo.length - 1; ++i)
        {
            for(int j = 0; j < saldo[i].length; ++j)
            {
                if (j == 0)
                    saldo[i][j] = kapital;
                else
                    saldo[i][j] = saldo[i][j-1] * zinssatz[i];
            }
        }

        println("Zinssätze:");
        for(int i = 0; i < saldo.length - 1; ++i)
        {
            print((i+1) + ": " + zinssatz[i] + "  ");
        }
        println("\n\n");

        for(int i = 0; i < saldo.length ; ++i) // Zinssatz
        {
            for(int j = 0; j < saldo[i].length + 1; ++j) // Jahr
            {
                if(i == 0)
                {
//                    print("jahr  " + (j-1) + " \t\t");
                }
                else if( j == 0)
                {
                    print("Zinssatz: " + (i) + ":  ");
                }
                else {
                    print(f.format(saldo[i-1][j-1]) + "  ");
//                    System.out.format("15s", saldo[i-1][j-1]);
                }
            }
            println("");
        }

    }


}
