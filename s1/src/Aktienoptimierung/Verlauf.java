package Aktienoptimierung;

import java.io.*;
import java.util.*;

/*
 * Created on 01.12.2005
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */

/**
 * @author Prof. Dr. Faustmann
 *
 * To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class Verlauf {
	public static void schreiben(String filename, int anzahl) throws IOException{
		PrintWriter out = new PrintWriter(new FileWriter(filename),true);
		for(int i=1; i<=anzahl; i++){
			int zahl = (int)(Math.random()*20)-10;
			out.println(zahl);
			//System.out.println(zahl);
		}
	}
	public static int[] lesen(String filename) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(filename));
		ArrayList liste = new ArrayList();
		String s;
		while((s=in.readLine())!=null){
			liste.add(s);
		}
		int[]erg = new int[liste.size()];
		for(int i=0; i<erg.length; i++){
			erg[i] = Integer.parseInt((String)liste.get(i));
		}
		return erg;
	}
}
