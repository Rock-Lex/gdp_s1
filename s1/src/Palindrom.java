import java.util.Scanner;

public class Palindrom
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
        String word = "ottfo";

        println(test(word));
    }

    public static Boolean test(String word) {
        String str1 = word.substring(0, word.length()/2);
        String str2 = "";
        for(int i = word.length() -1; i >= (word.length() + 1) / 2; --i)
        {
            str2 = String.join("", str2, Character.toString(word.charAt(i)));
        }

        return str1.equals(str2);
    }
}
