import java.util.*;
import java.util.stream.Stream;

public class Album { 
    private String author;
    private List<String> songs;
    private int year;
    private String title;
    
    public Album(String author, String title, int year, String... songs){
        this.author = author;
        this.year = year;
        this.title = title;
        this.songs = new ArrayList<>(Arrays.asList(songs));
    }

    public int getYear(){
        return year;
    }

    public String getAuthor(){
        return author;
    }

    public Stream<String> getSongs(){
        return songs.stream();
    }
    // + metodi get per tutti gli attributi
}
