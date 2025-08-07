import java.util.*;

public class longest_substr_uniq_char {
    public static void main(String[]args){

        String s="aabacbebebe";//given string
        int k=3;//maximum unique character 

        //map for mantaining k

        HashMap<Character,Integer>h = new HashMap<>();

        int i=0;
        int j=0;
        int max=-1;//if not such window then return -1

        while(j<s.length()){

            //map mai character or unki frequency count krte jaayenge

            char ch = s.charAt(j);
            h.put(ch,h.getOrDefault(ch,0)+1);

            if(h.size()<k){
                j++;
            }

            else if(h.size()==k){
               max=Math.max(max,(j-i+1));// substring with k unique characters length
               j++;
            }

            else if(h.size()>k){
                //left se char hataynege jab tk ki k se jayda hai mtlb unique character maintain hone tak
                while(h.size()>k){

                    char leftch = s.charAt(i);
                    //frequency kam krte jaayenge
                    h.put(leftch,h.get(leftch)-1);

                    //frequency kam hote hi remove krdenge

                    if(h.get(leftch)==0){
                        h.remove(leftch);
                    }
                    i++;//i ko badhate rahenge jab tak unique character vapas maintain na ho
                }
                j++;// phir jo aage badha denge
            }
        }

        System.out.print(max);

    }
}
