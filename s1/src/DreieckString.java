import java.util.Scanner;

public class DreieckString {

    public static String scanString(Scanner scanner)
    {
        String string = new String();
        string = scanner.nextLine();

        return string;
    }

    public static <T> void println(T objekt)
    {
        System.out.println(objekt);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eingeben: ");

        String string = scanString(scanner);

        printDreieckOpt(string);
    }

    public static void printDreieck(String string) {
    int a = string.length()/2;
    if (string.length() % 2 == 0)
    {
        int b = string.length()/2+1;
        while (a != 0)
        {
            println(string.substring(a-1, b));
            a--;
            b++;
        }
    }
    else
    {
        int b = string.length()/2+1;
        while (a != -1)
        {
            println(string.substring(a, b));
            a--;
            b++;
        }
    }
}


    public static void printDreieckOpt(String string) {
        int a = (string.length() -1)/2;
        int b = string.length()/2+1;

        while (a != -1)
        {
            for(int i = 0; i <= a; i++) System.out.print(" ");
            println(string.substring(a, b));
            a--;
            b++;
        }
    }
}