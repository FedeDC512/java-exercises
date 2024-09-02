public class FactoryTape extends FactoryAudio{
    public Support s1;
    public Recorder r1;
    public Player p1;
    @Override public Support createSupport(){
        return new SupportTape();
    };
    @Override public Recorder createRecorder(){
        return new RecorderTape();
    };
    @Override public Player createPlayer(){
        return new PlayerTape();
    };

    @Override
    public String toString() {
        return s1.createSupport() +", "+ r1.createRecorder() +", "+  p1.createPlayer();
    }

    public FactoryTape(){
        this.s1 = createSupport();
        this.r1 = createRecorder();
        this.p1 = createPlayer();
    }

}
