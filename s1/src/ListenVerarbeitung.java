
public class ListenVerarbeitung
{
    public static void main(String[] args) {
        System.out.println("Aufbau einer Liste...");
        Node l = null;
        l = knotenEinfuegen(l, 9);
        l = knotenEinfuegen(l, 12);
        l = knotenEinfuegen(l, 3);
        l = knotenEinfuegen(l, 30);
        l = knotenEinfuegen(l, 45);
        l = knotenEinfuegen(l, 1);
        druckeListe(l);
        System.out.println("\nDie Liste hat "+anzahlKnoten(l)+" Knoten.");
        
        int wert = 10;
        int pos = sucheKnoten(l, wert);
        if(pos == -1){
            System.out.println("Knoten mit dem Wert "+wert+" ist nicht in der Liste");
        }else{
            System.out.println("Knoten mit Wert "+wert+" steht an Position "+pos);
        }
        
        wert = 30;
        pos = sucheKnoten(l, wert);
        if(pos == -1){
            System.out.println("Knoten mit dem Wert "+wert+" ist nicht in der Liste");
        }else{
            System.out.println("Knoten mit Wert "+wert+" steht an Position "+pos);
        }
        
        System.out.println("\nKnoten mit Wert "+wert+" wird geloescht...");
        l = loescheKnoten(l, wert);
        druckeListe(l);
        
        Node l1 = null;
        l1 = knotenEinfuegen(l1, 1);
        l1 = knotenEinfuegen(l1, 2);
        l1 = knotenEinfuegen(l1, 3);
        l1 = knotenEinfuegen(l1, 4);
        Node l2 = null;
        l2 = knotenEinfuegen(l2, 1);
        l2 = knotenEinfuegen(l2, 2);
        l2 = knotenEinfuegen(l2, 3);
        l2 = knotenEinfuegen(l2, 4);
        
        System.out.println("\nDie Listen:");
        druckeListe(l1);
        druckeListe(l2);
        System.out.println("sind "+ (sindGleich(l1,l2)? "gleich." : "ungleich."));
        
        System.out.println("\nDie verkn?pften Listen:");
//        ausgebenListe(verknuepfe(l1,l2));
    }

    private static Node verknuepfe(Node l1, Node l2) {
        return new Node();
    }

    private static boolean sindGleich(Node l1, Node l2) {
               	// Zwei leere Listen sind gleich
              	// Eine leere Liste ist ungleich einer nichtleeren Liste
           		// Listen gleich lang und bisher gleiche Elemente
              	// Listen ungleich lang
                // Ungleiche Elemente in den Listen
        return false;
    }

    private static int anzahlKnoten(Node l) {
        return 1;
    }

    private static Node loescheKnoten(Node l, int wert) {
             	// Liste ist leer oder hat nur ein Element
            	// Sonderfall: Knoten mit wert steht an erster Stelle
        return new Node();
    }

    private static int sucheKnoten(Node l, int i) {
        return 1;
    }

    private static Node knotenEinfuegen(Node l, int i) {
        return new Node();
    }


    private static void druckeListe(Node l) {
        while (l != null) {
            System.out.print(l.key + " ");
            l = l.next;
        }
        System.out.println();
    }
}

class Node {
    public int key;
    public Node next;
}