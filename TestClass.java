import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String []args){

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer sumInt  = intList.stream().filter(n -> n % 2 == 0).mapToInt(n->n).sum();
        System.out.print(sumInt);


        List<String> fruits = Arrays.asList();

    }
}
