//add
//contains
//iterator


import java.util.*;

public class hashset{
    public static void main(String[]args){
         
        HashSet<String> h = new HashSet<>();

        h.add("gfg");
        h.add("course");
        h.add("ide");

        System.out.println(h);

       
        System.out.println( h.contains("ide"));

        Iterator<String> i = h.iterator();

        while(i.hasNext()){
            System.out.println(i.next()+" ");
        }
    }
}