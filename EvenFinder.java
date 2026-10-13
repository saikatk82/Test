package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenFinder {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<String> evenNum = nums.stream().
                filter(n-> n%2 ==0). // even
                map(n ->n*n). //square
                map(String :: valueOf).// convert into String
                toList(); // collect
        System.out.println(evenNum);
    }
}
