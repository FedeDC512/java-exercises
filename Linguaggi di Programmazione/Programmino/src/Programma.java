public class Programma{
	//denominazione, produttore, versione, sistema operativo, anno.
	private String denominazione;
	private String produttore;
	private String versione;
	private String sistema;
	private int anno;
	
	public Programma (String denominazione, String produttore, String versione, String sistema, int anno){
		setDenominazione(denominazione);
		setProduttore(produttore);
		setVersione(versione);
		setSistema(sistema);
		setAnno(anno);
	}
	
	public Programma(Programma origine){
		setDenominazione(origine.getDenominazione());
		setProduttore(origine.getProduttore());
		setVersione(origine.getVersione());
		setSistema(origine.getSistema());
		setAnno(origine.getAnno());
	}
	
	public void setDenominazione(String denominazione){
		this.denominazione = denominazione;
	}
	public String getDenominazione (){
		return denominazione;
	}
	
	public void setProduttore(String produttore){
		this.produttore = produttore;
	}
	public String getProduttore (){
		return produttore;
	}
	
	public void setVersione(String versione){
		this.versione = versione;
	}
	public String getVersione (){
		return versione;
	}
	
	public void setSistema(String sistema){
		this.sistema = sistema;
	}
	public String getSistema (){
		return sistema;
	}
	
	public void setAnno(int anno){
		this.anno = anno;
	}
	public int getAnno (){
		return anno;
	}
	
	public String toString(){
		return "Denominazione: " + denominazione + ", Produttore: " + produttore + ", Versione: " + versione + ", Sistema Operativo: " + sistema + ", Anno: " + anno;
	}
}