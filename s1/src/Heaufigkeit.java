import java.util.Arrays;
import java.util.Scanner;

public class Heaufigkeit
{
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
//        String word = scanString(scanner);
        String word = "Prorammioren";
        String teil = "en";
//        println(word.indexOf(3));

        berechnen(word, teil);
    }

    public static void berechnen(String word, String teil) {
        int i = 0;
        int counter = 0;
        while (true)
        {
            i = word.indexOf(teil);
            if(i != -1) {
                counter++;
                if (i >= word.length()-1)
                    break;
            }
            else break;
            word = word.substring(i+teil.length());
            println(counter);
        }

    }
}
