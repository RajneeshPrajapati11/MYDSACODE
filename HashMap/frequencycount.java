import java.util.*;

public class frequencycount{
    public static void main(String[]args){

        
        String s ="Rajneesh Prajapati";
        
        HashMap<Character,Integer>hm = new HashMap<>();

        for(char ch:s.toCharArray()){

            hm.put(ch,hm.getOrDefault(ch,0)+1);

        }

        System.out.println(hm);


    }
}