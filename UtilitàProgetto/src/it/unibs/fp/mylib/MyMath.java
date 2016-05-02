package it.unibs.fp.mylib;

public class MyMath {
	
	public static double arrotondaDoubleNDecimali(double value, int numCifreDecimali) {
		double temp = Math.pow(10, numCifreDecimali);
		return Math.round(value * temp) / temp; 
	}
	
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
	
	public static double valoreMedioArray(double []array){
		double valoreMedio = 0;
		double somma = 0;
		
		for(int i = 0; i < array.length; i++) somma += array[i];
		
		valoreMedio = somma/array.length;
		
		return valoreMedio;
	}
	
	public static double valoreMedioArray(double []array, int lunghezzaArray){
		double valoreMedio = 0;
		double somma = 0;
		
		for(int i = 0; i < lunghezzaArray; i++) somma += array[i];
		
		valoreMedio = somma/lunghezzaArray;
		
		return valoreMedio;
	}
}
