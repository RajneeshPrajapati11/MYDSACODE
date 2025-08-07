
public class anagram {
    static final int CHAR=256;
    public static boolean is_anagram(String s1,String s2){
        
        int count[]=new int[CHAR];

        if(s1.length()!=s2.length()){
            return false;
        }
        
        for(int i=0;i<s1.length();i++){

            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<CHAR;i++){

            if(count[i]!=0){
                return false;
            }
        }

        return true;


    }
    
    
    
    
    
    public static void main(String[]args){

        String s1 ="abaac";
        String s2 ="aacba";
        

        //-------------------------------------------Naive solution-----------------------------------------------------------------
        // char ch[]=s1.toCharArray();

        // Arrays.sort(ch);
        // s1 = new String(ch);
        // char ch1[]=s2.toCharArray();

        // Arrays.sort(ch1);
        // s2 = new String(ch);

        

        // System.out.println(s1.equals(s2));

        //-----------------------------------------------Efficient----------------------------------------------------------------

        

        System.out.println(is_anagram(s1,s2));
        
    }
}
