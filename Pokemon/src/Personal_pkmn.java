public class Personal_pkmn extends Pkmn {
    private String soprannome;
    private int livello;
    private int hp = 100;

    public Personal_pkmn(){
        soprannome = this.name;
        livello = 0;
        System.out.println("Hai creato "+ soprannome +" di livello "+livello);
    }

    public Personal_pkmn(String nome, int livello){
        this.soprannome = nome;
        this.livello = livello;
        System.out.println("Hai creato "+ nome +" di livello "+livello);
    }

    public void aumentaLivello(int a){
        this.livello += a;
        System.out.println("Il livello di "+ soprannome +"è aumentato a "+livello);
    }

    public int getLivello (){ return this.livello; }

    public String getSoprannome (){ return this.soprannome + "(" + super.getName() + ")"; }

    public int getHp (){ return this.hp; }
}
