//size
//remove
//isEmpty
//clear

import java.util.*;

public class hashset2 {
    public static void main(String[]args){

        HashSet<String> s = new HashSet<>();

        s.add("gfg");
        s.add("course");
        s.add("ide");
        
        System.out.println(s);

        System.out.println(s.size());

        s.remove("gfg");

        System.out.println(s);

        System.out.println(s.isEmpty());

        for(String h:s){

            System.out.println(h+" ");
        }

        s.clear();

        System.out.println("khali hai");

    }
}
