import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase{
    public static void main(String[] args){

       List<String> listString = Arrays.asList("banana","apple","cheery");

        List<String> listUpperCaseString =   listString.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.print(listUpperCaseString);

    }
}