/* Su una linea ferroviaria, rispetto alla tariffa piena, gli utenti pensionati usufruiscono di uno sconto del
10%, gli studenti del 15% e i disoccupati del 25%. Codificando i pensionati con una P, gli studenti con una S e i
disoccupati con una D, scrivere un programma che, richiesto il costo di un biglietto e l'eventuale condizione
particolare dell'utente, visualizzi l'importo da pagare */
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Persona viaggiatore;
		
		System.out.println("Pensionato = P,");
		System.out.println("Studente = S,");
		System.out.println("Disoccupato = D");
		System.out.println("Se appartieni ad una delle categorie sopra, inserisci la lettera corrispondente");
		System.out.print("altrimenti inserisci N: ");

		Scanner scan  = new Scanner(System.in);
        String eta = scan.nextLine();
		
		System.out.print("Inserisci il prezzo del biglietto: ");
        double prezzo = scan.nextDouble();
		scan.close();
		
		viaggiatore = new Persona(prezzo, eta.charAt(0));
		
		System.out.println("Il prezzo inserito e': "+ prezzo);
		System.out.println("L'eta' inserita e': "+ eta);
		System.out.println("Il prezzo del biglietto scontato e': "+viaggiatore.getPrezzo());
		
	
	}
}