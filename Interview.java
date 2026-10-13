import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Interview {
    public static void main(String[] args) {
        String test = "Reverse each word of String test";
        StringBuilder stringBuilder = new StringBuilder();
      String sList = Arrays.stream(test.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(sList);

        }
    }

