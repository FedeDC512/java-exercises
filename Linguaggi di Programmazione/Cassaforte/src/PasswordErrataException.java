public class PasswordErrataException extends IllegalArgumentException {
    public PasswordErrataException (){
        super ("La cassaforte è bloccata! Password errata inserita troppe volte.");
    }
    public PasswordErrataException (String msg){
        super (msg);
    }
}