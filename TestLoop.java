import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestLoop {

    public static void main (String [] args) {

        List<Integer> listOfIntegers = Arrays.asList(7, 9, 4, 3, 4, 3, 36, 42, 3, 42);
        System.out.println("listOfIntegers :"+ listOfIntegers);
       Set<Integer> s = new HashSet<>();
        List<Integer> nonDistinct = listOfIntegers.stream().filter(n -> !s.add(n)).collect(Collectors.toList());
       List<Integer> matches = listOfIntegers.stream().distinct().collect(Collectors.toList());
       System.out.println("matches:" + matches);
        System.out.println("nonDistinct:" + nonDistinct);
    }
}
