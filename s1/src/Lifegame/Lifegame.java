package Lifegame;

public class Lifegame {

    public static void main(String[] args) throws InterruptedException {
        GUI gui = new GUI();								// Neues Fenster anlegen
        boolean matrix [][] = zufallsMatrixErzeugen();		// Erste Zufallsmatrix erzeugen
        gui.init(matrix);									// Fenster mit Matrix �ffnen
        Thread.sleep(5000);									// 3 sec warten
        while (true){
            matrix = neuBerechnen(matrix);					// Neue Matrix berechnen
            gui.zeige(matrix);								// Neue Matrix anzeigen
        }
    }

    public static boolean [][] zufallsMatrixErzeugen(){
        boolean [][] matrix;
        int breite = 200;
        int hoehe = 200;
        matrix = new boolean[breite][hoehe];
        for(int i=0; i<hoehe; i++){
            for(int j=0; j<breite; j++){
                matrix[i][j] = (int)(Math.random()*100)<60 ? false : true;
            }
        }
        return matrix;
    }

    public static boolean [][] neuBerechnen(boolean [][] alteMatrix){
        int nachbarZahl = 0;
        int breite = alteMatrix.length;
        int hoehe = alteMatrix[0].length;
        boolean neueMatrix [][] = new boolean[breite][hoehe];		// Neuen Container erzeugen
        for(int i=0; i<hoehe; i++){
            for(int j=0; j<breite; j++){
                nachbarZahl = zaehleNachbarn(alteMatrix, i, j);     // Zahl der Nachbarn an Stelle i,j
                neueMatrix[i][j] = false;                           // Zelle ist voreingestellt tot
                if(alteMatrix[i][j] && (nachbarZahl == 2 || nachbarZahl == 3)){		// Wenn Zelle lebte und Nachbarzahl 2 oder 3,
                    neueMatrix[i][j] = true;                                        // dann lebt Zelle weiter
                }
                if(nachbarZahl == 3 ){									// Wenn Anzahl der Nachbarn drei,
                    neueMatrix[i][j] = true;                            // dann wird Zelle geboren
                }
            }
        }
        return neueMatrix;
    }

    public static int zaehleNachbarn(boolean [][] matrix, int i, int j){
        int anzahl = 0;

        int iMinus1 = i-1<0 ? matrix.length-1 : i-1;
        int jMinus1 = j-1<0 ? matrix[0].length-1 : j-1;
        int iPlus1 = i+1>matrix.length-1 ? 0 : i+1;
        int jPlus1 = j+1>matrix[0].length-1 ? 0 : j+1;

        if (matrix[iMinus1][jMinus1]) anzahl++;
        if (matrix[iMinus1][j]) anzahl++;
        if (matrix[iMinus1][jPlus1]) anzahl++;

        if (matrix[i][jMinus1]) anzahl++;
        if (matrix[i][jPlus1]) anzahl++;

        if (matrix[iPlus1][jMinus1]) anzahl++;
        if (matrix[iPlus1][j]) anzahl++;
        if (matrix[iPlus1][jPlus1]) anzahl++;

        return anzahl;
    }


}
