package it.unibs.fp.mylib;


/**
 * Questa classe rappresenta un menu testuale generico a piu' voci
 * Si suppone che la voce per uscire sia sempre associata alla scelta 0 
 * e sia presentata in fondo al menu 
 * 
 * @author Valtu
 *
 */
public class MyMenu{

  final private static String CORNICE = "--------------------------------";
  final private static String VOCE_USCITA = "0\tEsci";
  final private static String RICHIESTA_INSERIMENTO = "Digita il numero dell'opzione desiderata > ";

  private String titolo;
  private String [] voci;

  /**
   * Costruttore principale
   * @param titolo	l'intestazione
   * @param voci	il numero di voci del menù
   */
  public MyMenu (String titolo, String [] voci){
	this.titolo = titolo;
	this.voci = voci;
  }
  
  /**
   * Mostra il menù e richiede di effettuare una scelta tra le voci
   * 
   * @return	il valore scelto dall'utente
   */
  public int scegli (){
	stampaMenu();
	return MyInput.leggiIntero(RICHIESTA_INSERIMENTO, 0, voci.length);	 
  }
		
  /**
   * Visualizza il menù nella console
   */
  public void stampaMenu (){
	System.out.println(CORNICE);
	System.out.println(titolo);
	System.out.println(CORNICE);
    for (int i=0; i<voci.length; i++){
	  System.out.println( (i+1) + "\t" + voci[i]);
	 }
    System.out.println();
	System.out.println(VOCE_USCITA);
    System.out.println();
  }
		
}

