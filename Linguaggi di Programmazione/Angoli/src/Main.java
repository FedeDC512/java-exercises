/*Si devono gestire degli oggetti di tipo Angolo nella forma g°m`sp dove g rappresenta i gradi, p
i primi e s i secondi (con 0 a g < 360, 0 a p < 60, 0 a s < 60). Dopo avere prodotto il diagramma 
UML della classe Angolo la si implementi in linguaggio Java rendendo disponibili i seguenti 
metodi (n rappresenta un valore intero, mentre a rappresenta un oggetto di tipo Angolo):
visualizzaAngolo() visualizza l’angolo nel formato g°p`sp.
aggiungiGradi(n) aggiunge all’angolo n gradi
aggiungiPrimi(n) aggiunge all’angolo n primi
aggiungiSecondi(n) aggiunge all’angolo n secondi
angoloSecondi() ritorna il valore dell’angolo espresso in secondi
secondiAngolo(n) imposta il valore dell’angolo (gradi, primi e secondi) corrispondente a n secondi
differenzaSecondi(a) restituisce la differenza espressa in secondi tra l’angolo e l’angolo a
sommaAngolo(a) somma all’angolo l’angolo a

Si definisca inoltre un costruttore che accetti in ingresso tre parametri interi per il valore dei gradi, 
dei primi e dei secondi e un costruttore di copia. Quando aggiornati i valori degli attributi devono 
essere normalizzati rispettando i limiti imposti (360 per i gradi, 60 per i primi e i secondi).
Implementare infine il metodo main dove sono istanziati due o più oggetti di tipo Angolo, in modo da 
verificare l’invocazione di ogni singolo metodo in diverse condizioni.*/

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Inserisci gradi: ");
		int gradi = scan.nextInt();
		System.out.print("Inserisci primi: ");
		int primi = scan.nextInt();
		System.out.print("Inserisci secondi: ");
		int secondi = scan.nextInt();
		Angolo a = new Angolo(gradi, primi, secondi);
		
		System.out.print(a.visualizzaAngolo());
		scan.close();
	}
}