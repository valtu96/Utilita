package it.unibs.fp.mylib;

import java.util.*;

/**
 * Gestisce le estrazioni casuali
 * 
 * @author Valtu
 *
 */
public class MyNumeriCasuali {
	private static Random estrattore = new Random();
	
	/**
	 * Estrae un intero casuale compreso tra il valore min e il valore max
	 * 
	 * @param min	il valore minimo
	 * @param max	il valore massimo
	 * @return		l'intero estratto compreso tra i due parametri
	 */
	public static int estraiIntero(int min, int max){
		int range = max + 1 - min;
		int casual = estrattore.nextInt(range);
		return casual + min;
	}

}
