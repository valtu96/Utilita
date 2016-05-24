package it.unibs.fp.mylib;

public class MyOrdinamento {
	/*Ordinamento Bubble-Sort*/
	public void bubbleSort(int [] array) {

        for(int i = 0; i < array.length; i++) {
            boolean flag = false;
            for(int j = 0; j < array.length-1; j++) {

                //Se l' elemento j e maggiore del successivo allora
                //scambiamo i valori
                if(array[j]>array[j+1]) {
                    int k = array[j];
                    array[j] = array[j+1];
                    array[j+1] = k;
                    flag=true; //Lo setto a true per indicare che é avvenuto uno scambio
                }
                

            }

            if(!flag) break; //Se flag=false allora vuol dire che nell' ultima iterazione
                             //non ci sono stati scambi, quindi il metodo può terminare
                             //poiché l' array risulta ordinato
        }
    }
	
	/*Selection Sort*/
	public void selectionSort(int [] array) {

        for(int i = 0; i < array.length-1; i++) {
            int minimo = i; //Partiamo dall' i-esimo elemento
            for(int j = i+1; j < array.length; j++) {

            //Qui avviene la selezione, ogni volta
            //che nell' iterazione troviamo un elemento piú piccolo di minimo
            //facciamo puntare minimo all' elemento trovato
                    if(array[minimo]>array[j]) {
                        minimo = j;
                    }
            }

            //Se minimo e diverso dall' elemento di partenza
            //allora avviene lo scambio
            if(minimo!=i) { 
                int k = array[minimo];
                array[minimo]= array[i];
                array[i] = k;
            }
        }
    }
	
	/*Insertion Sort*/
	public void insertionSort(int [] array,int min) {
        for(int i = 1; i < array.length; i++) {
           int x = i;
           int j = i-1;
           for(; j >= min; j--) {

               //Scambiamo l'elemento in posizione x fino a quando non raggiunge
               //la posizione corretta nel sotto-vettore, cioé quando
               //non é verificata piú questa condizione
               if(array[j]>array[x]) {
                   int k = array[x];
                   array[x] = array[j];
                   array[j] = k;
                   x = j; //La sua nuova posizione nel sotto-vettore
               } else break; //Significa che l'i-esimo elemento è nella sua giusta posizione
                             //quindi possiamo terminare l' iterazione
           }
        }
    }
	
	/*Merge Sort*/
	
}
