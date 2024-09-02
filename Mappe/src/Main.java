import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<String,Integer> map = new HashMap<String,Integer>();
        Random generatore = new Random();
        int i;

        map.put("Zero", 0);
        map.put("Uno", 0);
        map.put("Due", 0);
        map.put("Tre", 0);
        map.put("Quattro", 0);
        map.put("Cinque", 0);
        map.put("Sei", 0);
        map.put("Sette", 0);
        map.put("Otto", 0);
        map.put("Nove", 0);
        
        for (int j = 0; j<= 1000; j++){
            i = generatore.nextInt(10);
            if(i == 0) map.put("Zero", map.get("Zero")+1);
            else if(i == 1) map.put("Uno", map.get("Uno")+1);
            else if(i == 2) map.put("Due", map.get("Due")+1);
            else if(i == 3) map.put("Tre", map.get("Tre")+1);
            else if(i == 4) map.put("Quattro", map.get("Quattro")+1);
            else if(i == 5) map.put("Cinque", map.get("Cinque")+1);
            else if(i == 6) map.put("Sei", map.get("Sei")+1);
            else if(i == 7) map.put("Sette", map.get("Sette")+1);
            else if(i == 8) map.put("Otto", map.get("Otto")+1);
            else if(i == 9) map.put("Nove", map.get("Nove")+1);
            else System.out.println(i);
        }

        System.out.println(map);

        List<String> lista = new ArrayList<String>();
        lista.add("Zero");
        lista.add("Uno");
        lista.add("Due");
        lista.add("Tre");
        lista.add("Quattro");
        lista.add("Cinque");
        lista.add("Sei");
        lista.add("Sette");
        lista.add("Otto");
        lista.add("Nove");
        System.out.println(creamappa(lista));

        System.out.println("Numero con valore maggiore: "+trovamax(map));
        System.out.println("Chiave con valore massimo: "+valoremax(map));


    }

    static Map<String,Integer> creamappa(List<String> l){
        Map<String,Integer> map = new HashMap<String,Integer>();
        ListIterator<String> li = l.listIterator();
        while(li.hasNext()){
            String temp = li.next();
            map.put(temp, temp.hashCode());
        }

        return map;
    }

    static String trovamax(Map<String,Integer> map){
        int max = 0;
        String text = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(max <= entry.getValue()){
                max = entry.getValue();
                text = entry.getKey();
            }
        }
        return text;
    }

    static Map.Entry<?, ?> valoremax(Map<String,Integer> map){
        Map.Entry<?, ?> max = null;
        int s = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(s < entry.getValue()){
                max = entry;
                s = entry.getValue();
            }
        }
        return max;
    }
}
