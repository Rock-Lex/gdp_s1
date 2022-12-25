package Aktienoptimierung;

import java.io.IOException;

import javax.swing.JOptionPane;


public class Aktienoptimierung2 {

	public static void main(String[] args) throws IOException {
		erzeugeVerlauf();
		int [] feld = liesVerlauf();
		
		long start, end;
		int ergebnis;
		
		
		start = System.currentTimeMillis();
		ergebnis = teilsumme2(feld);
		end = System.currentTimeMillis();
		System.out.println("Methode 2 ergibt: "+ergebnis+" nach "+(end-start)+" ms.");
		
	}
	
	
	static int teilsumme2(int[] feld){
		int anzahl = feld.length;
		// 2-dimensionales Feld f�r Zwischenspeicherung
		int[][] s = new int[anzahl][anzahl];
		// Alle Feldelemente mit 0 initialisieren
		for (int i=0; i<anzahl; i++){
			for (int j=0; j<anzahl; j++){
				
			}
		}
		
		// Jetzt werden alle Teilsummen ermittelt
		// Teilsummen aus einem Element eintragen
		for (int bis=0; bis<anzahl; bis++){
			
		}
		// Ausgehend von der ersten Teilsumme k�nnen die restlichen
		// Teilsummen ermittelt und gespeichert werden.
		for (int von=0; von<anzahl; von++){			// Zeile weiterschalten
			for (int bis=von+1; bis<anzahl; bis++){	// Position im Feld setzen
				
			}
		}
		// Tabelle ist gef�llt


		// Jetzt das Maximum suchen
		int maxSumme = Integer.MIN_VALUE;
		for (int von=0; von<anzahl; von++){
			for (int bis=0; bis<anzahl; bis++){
				
			}
		}
		
		return maxSumme;
	}
	
	
	static void erzeugeVerlauf() throws IOException{
		String filename = JOptionPane.showInputDialog("In welche Datei soll geschrieben werden?");
		String eingabe = JOptionPane.showInputDialog("Wieviele Aenderungen sollen erzeugt werden?");
		int anzahl = Integer.parseInt(eingabe);
		
		Verlauf.schreiben(filename+".txt", anzahl);
	}

	static int[] liesVerlauf() throws IOException{
		String filename = JOptionPane.showInputDialog("Dateiname?");
		int[] verlauf = Verlauf.lesen(filename+".txt");
		
		return verlauf;
	}
}
