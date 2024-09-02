public class Pkmn {
    public static int gen1 = 151;

    protected int id = 0;
    protected String name = "MissingNo";
    protected String type1 = null;
    protected String type2 = null;
    protected int totalStats = 0;
    protected int hpStats = 0;
    protected int attackStats= 0;
    protected int defenseStats= 0;
    protected int spatkStats= 0;
    protected int spdefStats= 0;
    protected int speedStats= 0;
    protected int gen= 0;
    protected boolean legendary = false;

    public Pkmn(){
        System.out.println(name + " è stato caricato in memoria!");
    }

    public Pkmn(int id, String name, String type1, String type2, int totalStats, int hpStats, int attackStats, int defenseStats, int spatkStats, int spdefStats, int speedStats, int gen, boolean legendary){
        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.totalStats = totalStats;
        this.hpStats = hpStats;
        this.attackStats = attackStats;
        this.defenseStats = defenseStats;
        this.spatkStats = spatkStats;
        this.spdefStats = spdefStats;
        this.speedStats = speedStats;
        this.gen = gen;
        this.legendary = legendary;

        System.out.println(name + " è stato caricato in memoria!");
    }

    public int getId (){ return this.id; }
    public String getName (){ return this.name; }
    public String getType1 (){ return this.type1; }
    public String getType2 (){ return this.type2; }
    public int getTotalStats (){ return this.totalStats; }
    //da aggiungere le altre stats
    public int getGen (){ return this.gen; }
    public boolean isLegendary (){ return this.legendary; }


}
