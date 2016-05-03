package it.unibs.fp.mylib;

/**
 * Gestisce le operazioni matematiche non presenti nella libreria Math base
 * 
 * @author Valtu
 *
 */
public class MyMath {
	
	/**
	 * Arrotonda un valore double al numero di cifre decimali desiderato
	 * 
	 * @param value					il valore da arrotondare
	 * @param numCifreDecimali		il numero di cifre decimali desiderato
	 * @return						il valore arrotondato
	 */
	public static double arrotondaDoubleNDecimali(double value, int numCifreDecimali) {
		double temp = Math.pow(10, numCifreDecimali);
		return Math.round(value * temp) / temp; 
	}
	
	/**
	 * Trova il valore massimo in un'array di interi 
	 * !! Controllare se già presente in librerie standard
	 * 
	 * @param array
	 * @return
	 */
	public static int valoreMaxArray(int []array){
		int valoreMax = array[0];
		int posizioneMax = 0;
		
		for(int i = 0; i < array.length; i++){
			if(array[i] > valoreMax){
				valoreMax = array[i];
				posizioneMax = i;
			}
		}
		
		return posizioneMax;
	}
	
	/**
	 * Trova il valore max in un array di interi
	 * !! Controllare se già presente in librerie standard
	 * 
	 * @param array
	 * @param lunghezzaArray
	 * @return
	 */
	public static int valoreMaxArray(int []array, int lunghezzaArray){
		int valoreMax = array[0];
		int posizioneMax = 0;
		
		for(int i = 0; i < lunghezzaArray; i++){
			if(array[i] > valoreMax){
				valoreMax = array[i];
				posizioneMax = i;
			}
		}
		
		return posizioneMax;
	}
	
	/**
	 * Trova il valore max in un array di double
	 * !! Controllare se già presente in librerie standard
	 * 
	 * @param array
	 * @return
	 */
	public static double valoreMaxArray(double []array){
		double valoreMax = array[0];
		int posizioneMax = 0;
		
		for(int i = 0; i < array.length; i++){
			if(array[i] > valoreMax){
				valoreMax = array[i];
				posizioneMax = i;
			}
		}
		
		return posizioneMax;
	}
	
	/**
	 * Trova il valore max in un array di double
	 * !! Controllare se già presente in librerie standard
	 * 
	 * @param array
	 * @param lunghezzaArray
	 * @return
	 */
	public static double valoreMaxArray(double []array, int lunghezzaArray){
		double valoreMax = array[0];
		int posizioneMax = 0;
		
		for(int i = 0; i < lunghezzaArray; i++){
			if(array[i] > valoreMax){
				valoreMax = array[i];
				posizioneMax = i;
			}
		}
		
		return posizioneMax;
	}
	
	/**
	 * Calcola il valore medio in un array di double
	 * !! Controllare se già presente in librerie standard
	 * 
	 * @param array
	 * @return
	 */
	public static double valoreMedioArray(double []array){
		double valoreMedio = 0;
		double somma = 0;
		
		for(int i = 0; i < array.length; i++) somma += array[i];
		
		valoreMedio = somma/array.length;
		
		return valoreMedio;
	}
	
	/**
	 * Calcola il valore medio in un array di double
	 * !! Controllare se già presente in librerie standard
	 * 
	 * @param array
	 * @param lunghezzaArray
	 * @return
	 */
	public static double valoreMedioArray(double []array, int lunghezzaArray){
		double valoreMedio = 0;
		double somma = 0;
		
		for(int i = 0; i < lunghezzaArray; i++) somma += array[i];
		
		valoreMedio = somma/lunghezzaArray;
		
		return valoreMedio;
	}
}
