import java.util.stream.IntStream;

public class StringReverse {
    public static void main(String args[]) {
        String in = "Hello World";
        char[] ch = in.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i= ch.length -1; i >= 0 ; --i){
            sb.append(ch[i]);
        }
        System.out.println(in);
        System.out.println(sb);

       String reversed = IntStream.rangeClosed(1,in.length()).mapToObj( i -> in.charAt(in.length() -1)).
             collect(StringBuilder:: new ,StringBuilder:: append,StringBuilder::append).toString();

       String rev = new StringBuilder(in).reverse().toString();



       System.out.println(rev);

    }
}
