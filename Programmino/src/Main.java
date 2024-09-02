/* Progettare mediante un diagramma UML e implementare in linguaggio Java una classe i cui 
oggetti rappresentano programmi per computer. Ogni oggetto deve avere almeno i seguenti 
attributi: denominazione, produttore, versione, sistema operativo, anno.
La classe deve avere almeno i seguenti metodi:
costruttore che ha come parametri denominazione, produttore, versione, sistema operativo, anno;
costruttore di copia;
getDenominazione, getProduttore, getVersione, getSistema e getAnno che restituiscono i valori degli attributi relativi;
setDenominazione, setProduttore, setVersione, setSistema e setAnno che modificano i valori degli attributi relativi;
toString che restituisce una stringa con tutti i dati dell’oggetto su cui è invocato;
compareAnno che consente di confrontare l’anno di rilascio del programma con l’anno di rilascio di un altro programma.
Inserire nella classe un metodo main che consenta di verificarne tutte le funzionalità. */

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Inserisci la denominazione: ");
		String denominazione = scan.nextLine();
		System.out.print("Inserisci il produttore: ");
		String produttore = scan.nextLine();
		System.out.print("Inserisci la versione: ");
		String versione = scan.nextLine();
		System.out.print("Inserisci il sistema operativo: ");
		String sistema = scan.nextLine();
		System.out.print("Inserisci l'anno: ");
		int anno = scan.nextInt();
		
		Programma prog = new Programma(denominazione, produttore, versione, sistema, anno);
		Programma copia = new Programma(prog);
		
		System.out.println(prog.toString());
		System.out.println(copia.toString());
		
		System.out.print("Inserisci l'anno del secondo programma con cui confrontarlo: ");
		int anno2 = scan.nextInt();
		
		if(anno == anno2) System.out.println("I due programmi sono dello stesso anno");
		else if (anno >= anno2) System.out.println("Il prino programma e' uscito " + (anno - anno2) + " anni dopo il secondo");
		else if (anno <= anno2) System.out.println("Il primo programma e' uscito " + (anno2 - anno) + " anni prima del secondo");
		
		
		scan.close();
		
	}
}