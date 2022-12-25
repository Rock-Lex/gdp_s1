//package Aktienoptimierung;
//
//import java.io.IOException;
//
//import javax.swing.JOptionPane;
//
//
//public class Aktienoptimierung {
//
//	public static void main(String[] args) throws IOException {
//		erzeugeVerlauf();
//		int [] feld = liesVerlauf();
//
//		long start, end;
//		int ergebnis;
//
//
//		start = System.currentTimeMillis();
//		ergebnis = teilsumme3(feld);
//		end = System.currentTimeMillis();
//		System.out.println("Methode 3 ergibt: "+ergebnis+" nach "+(end-start)+" ms.");
//
//	}
//
//
//	static int teilsumme3(int[] arr){
//		int maxSum = 0;
//		int startInd = 0;
//		int endInd = 0;
//		int curentSum = 0;
//
//		for (int i = 0; i < arr.length; ++i)
//		{
//			curentSum = 0;
//			for (int j = i; j < arr.length; ++j)
//			{
//				curentSum += arr[j];
//				if (curentSum >= maxSum)        // >= - last; > - first
//				{
//					maxSum = curentSum;
//					startInd = i;
//					endInd = j;
//				}
//			}
//		}
//		System.out.println("Max sum: " + maxSum);
//		System.out.println("Start index: " + startInd);
//		System.out.println("End index: " + endInd);
//	}
//
//
//	static void erzeugeVerlauf() throws IOException{
//		//String filename = JOptionPane.showInputDialog("In welche Datei soll geschrieben werden?");
//		String filename = "verlauf";
//		String eingabe = JOptionPane.showInputDialog("Wieviele Aenderungen sollen erzeugt werden?");
//		int anzahl = Integer.parseInt(eingabe);
//
//		Verlauf.schreiben(filename+".txt", anzahl);
//	}
//
//	static int[] liesVerlauf() throws IOException{
//		//String filename = JOptionPane.showInputDialog("Dateiname?");
//		String filename = "verlauf";
//		int[] verlauf = Verlauf.lesen(filename+".txt");
//
//		return verlauf;
//	}
//}
