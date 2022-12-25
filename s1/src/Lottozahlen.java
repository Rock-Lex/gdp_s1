import java.util.Scanner;

public class Lottozahlen {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie gross muss array sein?");
        int num = scanInt(scanner);

        System.out.println("Wie viele Elemente muss entfernt werden?");
        int zahlen = scanInt(scanner);

        int [] numbers = new int[(int) num];
        int [] result = new int[zahlen];

        for (int i = 0; i < numbers.length; ++i)
        {
            numbers[i] = (int) (Math.random() * 100);
        }

        System.out.println("Generierte Array ist: ");
        printArrayInt(numbers);

        for (int i = 0; i < zahlen; ++i)
        {
            int zahlIndex = (int) (Math.random() * numbers.length);
            result[i] = numbers[zahlIndex];
            System.arraycopy(numbers, numbers.length-1, numbers, zahlIndex, 1);
            int [] temp = new int[numbers.length];
            temp = numbers;
            numbers = new int[numbers.length - 1];
            System.arraycopy(temp, 0, numbers, 0, numbers.length);
        }

        System.out.println("Result array:");
        printArrayInt(result);
        System.out.println("Array");
        printArrayInt(numbers);
    }


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

    public static void printArrayInt(int [] arr)
    {
        for (int i = 0; i < arr.length; ++i)
        {
            System.out.println(i + " : " + arr[i]);
        }
    }

}


