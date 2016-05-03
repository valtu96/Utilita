package it.unibs.fp.mylib;

/**
 * Gestisce la creazione di stringhe con decorazioni
 * 
 * @author Valtu
 *
 */
public class BelleStringhe{
	private final static String SPAZIO = " ";
	private final static String CORNICE = "---------------------------------------------------";
	private final static String ACAPO = "\n";

	/**
	 * Crea una cornice intorno alla stringa immessa
	 * 
	 * @param s		la stringa da incorniciare
	 * @return		la stringa in ingresso incorniciata
	 */
	public static String incornicia (String s){ 
		StringBuffer res = new StringBuffer();
		
		res.append(CORNICE+ACAPO);
		res.append(s+ACAPO);
		res.append(CORNICE+ACAPO);

		return res.toString();
	}
	
	/**
	 * Aggiunge il numero di spazi necessario ad incolonnare correttamente una stringa
	 * 
	 * @param s				la stringa da incolonnare
	 * @param larghezza		la larghezza della colonna
	 * @return				la stringa in ingresso con il corretto numero di spazi per l'incolonnamento
	 */
	public static String incolonna (String s, int larghezza){
		StringBuffer res = new StringBuffer(larghezza);
		int numCharDaStampare = Math.min(larghezza,s.length());
		res.append(s.substring(0, numCharDaStampare));
		for(int i=s.length()+1; i<=larghezza; i++)
			res.append(SPAZIO);
		
		return res.toString();
	}
	
	/**
	 * Centra una stringa in un numero di caratteri predefinito in ingresso
	 * 
	 * @param s				la stringa da centrare
	 * @param larghezza		il numero di caratteri nei quali la stringa deve essere centrata
	 * @return				la stringa centrata nel numero di caratteri richiesto
	 */
	public static String centrata (String s, int larghezza){
		StringBuffer res = new StringBuffer(larghezza);
		if(larghezza <= s.length())
			res.append(s.substring(larghezza));
		else{
			int spaziPrima = (larghezza - s.length())/2;
			int spaziDopo = larghezza - spaziPrima - s.length();
			for(int i=1; i<=spaziPrima; i++)
				res.append(SPAZIO);
			
			res.append(s);
		
			for(int i=1; i<=spaziDopo; i++)
				res.append(SPAZIO);
		}
	 	
		return res.toString();
	}
	
}

