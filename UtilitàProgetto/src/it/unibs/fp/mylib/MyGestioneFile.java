package it.unibs.fp.mylib;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyGestioneFile {
	/**
	 * Crea un file nell'indirizzo passato
	 * @param path indirizzo nel quale creare il file
	 */
	public static void creaFile(String path) {
		  try {
			File file = new File(path);
		    if (file.exists())
		      System.out.println("Il file  esiste");
		    else if (file.createNewFile())
		      System.out.println("Il file è stato creato");
		    else
		      System.out.println("Il file non può essere creato");
		  }
		  catch (IOException e) {
		    e.printStackTrace();
		  }
		}
	
	/**
	 * Legge un file che si trova all'indirizzo indicato 
	 * @param path indirizzo nel quale si trova il file da leggere
	 */
	public static void leggiFile(String path) {
		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(path));

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	  }
	
	/**
	 * Aggiunge il testo specificato all'indirizzo specificato dall'utente
	 * @param path indirizzo nel quale si trova il file al quale bisogna aggiungere il testo
	 * @param frase testo da aggiungere al file
	 */
	public static void scriviFile(String path, String frase) {
	    try {
			File file = new File(path);
	    	FileOutputStream fw = new FileOutputStream(file,true);
			PrintWriter pw= new PrintWriter(fw);
			pw.append(frase+"\n");
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
	
	public static void scriviBeppe(String path, String stringa){
		try(FileWriter fw = new FileWriter(path, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)){
		    out.println(stringa);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
