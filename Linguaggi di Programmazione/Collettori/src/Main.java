import java.util.stream.Collectors;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Uno", 1);
        map.put("Due", 2);
        map.put("Tre", 3);
        System.out.println(map);

        Map<?,List<?>> inv = inverti(map);
        System.out.println(inv);
    }

    static Map<?,List<?>> inverti(Map<?,?> map){
        Map<?,List<?>> out = map.entrySet().stream().collect(Collectors.toMap(a -> a.getValue(), b -> Arrays.asList(b.getKey())));
        //toMap(Function.identity(), String::length
        return out;
    }
}
