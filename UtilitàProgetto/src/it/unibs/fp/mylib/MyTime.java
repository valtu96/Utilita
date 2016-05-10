package it.unibs.fp.mylib;

/**
 * Gestisce i valori relativi al tempo
 * @author Valtulini Claudio
 *
 */
public class MyTime {
	/**
	 * Converte i secondi in una stringa nel formato mm:ss
	 * 
	 * @param seconds	il numero di secondi da convertire in mm:ss
	 * @return			Una stringa contenente il valore convertito in mm:ss
	 */
	public static String secondsToString(int seconds) {
	    return String.format("%02d:%02d", seconds / 60, seconds % 60);
	}
}
