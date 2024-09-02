import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

class Sample{ 
	public static void main (String... args){
		try{
            /* 
			String s = "localhost";
			String path = "hosts.txt"; 
			int count = 0;
			BufferedReader buf = new BufferedReader(new FileReader(path));
			String line = null;
			while ((line = buf.readLine() ) != null){
				if (line.contains(s)) count++;
			}
			System.out.println("Word " + s + " occurred " + count + " times");
            */

            String path = "hosts.txt";
            String s = "localhost";
            long count = Files.lines(Path.of(path)).filter(a -> a.equals(s)).count();
            System.out.println("Word " + s + " occurred " + count + " times");
        }
		catch (IOException e){System.out.println("File not found");}
	}

}