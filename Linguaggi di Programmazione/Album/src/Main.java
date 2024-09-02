import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Album> albums = new ArrayList<>();
        albums.add(new Album("Pink Floyd", "The Division Bell", 1994,
        "Cluster One",
        "What Do You Want from Me",
        "Poles Apart",
        "Marooned",
        "A Great Day for Freedom",
        "Wearing the Inside Out",
        "Take It Back",
        "Coming Back to Life",
        "Keep Talking",
        "Lost for Words",
        "High Hopes",
        "Song 11")
        ); // e altre centinaia di album...

        aggiungiCanzoni(albums);

        /*for (Album album : albums)
        if (album.getYear() < 2000)
        System.out.println(album.getAuthor()); */
        albums.stream().filter(a -> a.getYear() < 2000).forEach(a -> System.out.println(a.getAuthor()));
        System.out.println();

        //albums.stream().flatMap(album -> album.getSongs());
        albums.stream().filter(a -> a.getYear() < 2000).flatMap(a -> a.getSongs()).sorted().limit(10).forEach(System.out::println);
    }

    static void aggiungiCanzoni(List<Album> a){
        a.add(new Album("A1", "T1", 1999,"C1", "C2", "C3"));
        a.add(new Album("A2", "T2", 2001,"C4", "C5", "C6"));
    }

}
