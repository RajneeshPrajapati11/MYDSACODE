
import java.util.*;

public class linkedhashset {
    public static void main(String[]args){

        LinkedHashSet<Integer>ls = new LinkedHashSet<>();

        ls.add(10);
        ls.add(20);
        ls.add(30);

        for(Integer x:ls){
            System.out.println(x);
        }
    }
}
