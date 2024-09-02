import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numeri = new ArrayList<Integer>();
        numeri.add(1);
        numeri.add(4);
        numeri.add(2);
        numeri.add(2);
        numeri.add(3);
        numeri.add(4);
        numeri.add(5);
        System.out.println(numeri);

        selezionaPari(numeri);
        System.out.println(numeri);

        eliminaDuplicati(numeri);
        System.out.println(numeri);
    }

    public static void selezionaPari(ArrayList<Integer> al){
        for(int i=0; i<al.size(); i++){
            if(al.get(i)%2 == 1){al.remove(i);}
        }
        System.out.println("I numeri dispari sono stati rimossi");
    }

    public static void eliminaDuplicati(ArrayList<Integer> al){
        for(int i = 0; i<al.size(); i++){
            for(int j = 0; j<al.size(); j++){
                if(i!=j && al.get(i)==al.get(j)) al.remove(i);
            }
        }
        System.out.println("I numeri duplicati sono stati rimossi");

    }
}
