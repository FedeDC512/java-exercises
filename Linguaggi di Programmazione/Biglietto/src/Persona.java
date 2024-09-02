public class Persona{
	
	private double prezzo;
	//pensionati sconto del 10%, gli studenti del 15% e i disoccupati del 25%
	public Persona (double prezzo, char eta){
		if(eta == 'N') this.prezzo = prezzo;
		else if (eta == 'P') this.prezzo = prezzo - ((10*prezzo)/100);
		else if (eta == 'S') this.prezzo = prezzo - ((15*prezzo)/100);
		else if (eta == 'D') this.prezzo = prezzo - ((25*prezzo)/100);
		else prezzo = 0;
	}
	
	public double getPrezzo (){
		return prezzo;
	}

	
}