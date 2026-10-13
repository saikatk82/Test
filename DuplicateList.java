package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateList {

    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1,2,3,4,2,5,3,6);

        List<Integer> duplicateElements = list.stream()
                .filter(n -> Collections.frequency( list,n) > 1).toList();
        System.out.println(duplicateElements);
    }
}
