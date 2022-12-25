import java.util.Scanner;

public class Template {

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

    public static int scanIntLoop(Scanner scanner)
    {
        while (true){
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
    public static void templateMain(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eingeben: ");

        int numberOfStrings = scanInt(scanner);
        String[] arr = scanMultipleStrings(scanner, numberOfStrings);

        printList(arr);
    }
}