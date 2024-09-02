public class Angolo{
	int gradi, primi, secondi;

	public Angolo (int gradi, int primi, int secondi){
		setGradi(gradi);
		setPrimi(primi);
		setSecondi(secondi);
	}

	public void setGradi(int gradi){
		this.gradi = gradi;
	}
	public void setPrimi(int primi){
		if(primi >= 60){
			gradi += (int) primi/60;
			this.primi += primi%60;
		}
		else this.primi = primi;
	}
	public void setSecondi(int secondi){
		if(secondi >= 60){
			primi += (int) secondi/60;
			this.secondi += secondi%60;
			if(primi >= 60){
				gradi += (int) primi/60;
				this.primi += primi%60;
			}
		}
		else this.secondi += secondi;
	}

	public String visualizzaAngolo(){
		return "Gradi "+ gradi +" Primi "+primi+ " Secondi "+secondi;
	}

}