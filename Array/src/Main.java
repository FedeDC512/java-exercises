import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int[] numeri = new int[]{1, 2, 5, 3, 3, 4, 5, 6, 6, 7};

        System.out.println("L'array contiene "+numeri.length+" elementi");

        
        System.out.println(Arrays.toString(numeri));
        stampaArray(numeri);
        System.out.println();

        System.out.println("Media = "+mediaValori(numeri));

        System.out.println("Numeri Pari = "+Arrays.toString(selezionaPari(numeri)));

        System.out.println("Elimino i duplicati = "+Arrays.toString(numeri)+" -> "+Arrays.toString(eliminaDuplicati(numeri)));
    }

    public static void stampaArray(int[] array){
        for (int num : array )
            { System.out.print(num +", "); };
    }

    public static float mediaValori(int[] array){
        float tot = 0;
        for (int num : array)
            { tot += num; };
        return tot/array.length;
    }

    public static int[] selezionaPari(int[] array){
        int pari = 0;
        for (int num : array)
         { if(num%2 == 0){ pari ++; } }

        int[] numeriPari = new int[pari];
        int count = 0;
        for (int num : array)
         { if(num%2 == 0){ 
                numeriPari[count] = num;
                count++; } }

        return numeriPari;
    }

    public static int[] eliminaDuplicati(int[] array){
        int count = 0;
        for(int num1 : array){
            for(int num2 : array){
                if (num1 == num2){count++;}
            }
        }
        int numeroDuplicati = (count - array.length) /2;
        count=0;

        int[] noDup = new int [array.length - numeroDuplicati];
        for (int num1 : array){
            int flag = 0;
            for(int num2 : noDup){
                if (num1 == num2){
                    flag = 1;
                }
            }
            if(flag == 0){
                noDup[count]=num1; 
                count++;}
        }
        return noDup;

    }
}
