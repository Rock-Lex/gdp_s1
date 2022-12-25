import java.util.Scanner;

public class OptionsGenerator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hallo!");

        auswahlEinlesen(scanner);
    }

    private static void auswahlEinlesen(Scanner scanner)  {
        System.out.println("Geben Sie bitte anzahl der Optionen ein:");
        int auswahl = scanInt(scanner);

        for (int i = 1; i <= auswahl; i++)
        {
            System.out.println("Option " + i);
        }
        System.out.println("Option 0: Exit");

        while (true)
        {
            int option = scanInt(scanner);

            if(option > 0 && option <= auswahl)
            {
                System.out.println("Super! Sie haben " + option + " eingegeben");
                auswahlEinlesen(scanner);
            }
            else if (option==0)
            {
                System.out.println("Sie haben exit eingegeben");
                break;
            }
            else
            {
                System.out.println("Sie haben falsch eingegeben. Versuchen Sie noch mal");
            }
        }
    }

    public static int scanInt(Scanner scanner)
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
}
