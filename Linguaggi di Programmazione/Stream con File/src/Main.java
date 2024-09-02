import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Stream<String> linee = Files.lines(Path.of("text.txt")); //lines crea stream
        linee.forEach(s -> System.out.println(s));
        
        Map<Character, List<String>> m = Files.lines(Path.of("text.txt"))
            .collect(Collectors.toMap(
                l -> l.charAt(0), 
                s -> new ArrayList<>(Arrays.asList(s)),
                (existing, replacement)->{
                    existing.addAll(replacement);
                    return existing;
                }
            )
        );
        System.out.println(m);
    }
}
