import java.util.*;

public class countchar {
    public static void main(String[]args){
        String s = "Deebaan";

        HashMap<Character,Integer>hm = new HashMap<>();


        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        for(char ch:hm.keySet()){
            System.out.println(ch+"->"+hm.get(ch));
        }
    }
}
