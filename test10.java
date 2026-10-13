
 import java.io.*;
import java.util.stream.*;
import java.util.*;
public class test10 {
    public static void main(String[] args) {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileWriter("tt"));
            inputStream = new BufferedReader(new FileReader("tt"));

            Stream.of("RED","GREEN","BLUE").forEach(outputStream::println);
            outputStream.flush();

            List<String> l=inputStream.lines().collect(Collectors.toList());
            l.stream().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}