import java.util.Scanner;

public class SchaltJahr {
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

    public static boolean isSchaltJahr(int jahr)
    {
        if (jahr % 4 == 0)
        {
            if (jahr % 100 != 0 || jahr % 400 == 0)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean switcher = true;

        while(switcher)
        {
            int num = scanInt(scanner);

            if (num == 0) switcher = false;
            else System.out.println(isSchaltJahr(num));
        }
    }
}

