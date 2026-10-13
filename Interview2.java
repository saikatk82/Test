import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Interview2 {
    public static void main(String [] args){
        String s = "Java Streams are really powerful";
        Map<Character,Long> map = s.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(c-> c, Collectors.counting()));
        List<Map.Entry<Character, Long>> list = map.entrySet().stream().sorted(Map.Entry.<Character, Long>comparingByValue().reversed()).limit(4).collect(Collectors.toList());
        System.out.print(list);
    }
}
