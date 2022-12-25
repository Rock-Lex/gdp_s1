import java.util.Scanner;

public class PiBerechnen {

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
    public static String[] scanMultipleStrings(Scanner scanner, int numberOfStrings)
    {
        System.out.println("Enter your strings " + numberOfStrings + " times:");
        try {
            String[] string = new String[numberOfStrings];
            for (int i = 0; i < string.length; ++i)
            {
                string[i] = scanner.nextLine();
            }
            return string;
        }
        catch(Exception e)
        {
            System.out.println("Scanning of strings went wrong: " + e);
            System.exit(1);
            return new String[1];
        }
    }

    public static void printList(Object[] objects)
    {
        for (Object s : objects)
        {
            System.out.println(s);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eingeben wie genau: ");

        int num = scanInt(scanner);
        double start = System.currentTimeMillis();
        System.out.println(piRechnen(num));
        System.out.println(System.currentTimeMillis()-start);
    }

    private static double piRechnen(int num) {
        double a = 1;
        double k = 1;
        double answear = 0;

        for (int i = 0; i <= num; ++i)
        {
            answear += 1/(a*k);
            a+=2;
            k*=-1;
        }
        return Math.abs(4 * answear);
    }
}
