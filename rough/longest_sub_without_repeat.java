import java.util.*;
public class longest_sub_without_repeat {
    
    public static void main(String[]args){

        String s ="pwwkew";

        int i=0;
        int j=0;
        
        HashMap<Character,Integer>h = new HashMap<>();
        
        int max =-1;
        while(j<s.length()){

            char ch = s.charAt(j);

            h.put(ch,h.getOrDefault(ch,0)+1);

            // if(h.size()>(j-i+1)){
            //     j++;
            // }  // kabhi work hi nhi krega dry run krk dekho

            if(h.size()==(j-i+1)){
                max = Math.max(max,(j-i+1));
                j++;
            }

            else if(h.size()<(j-i+1)){

                while(h.size()<(j-i+1)){

                    char leftch = s.charAt(i);

                    h.put(leftch,h.get(leftch)-1);

                    if(h.get(leftch)==0){
                        h.remove(leftch);
                    }
                    
                    i++;
                }
                j++;
            }

            
        }
        System.out.println(max);
    }
}
