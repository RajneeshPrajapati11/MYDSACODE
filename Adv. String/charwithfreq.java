import java.util.*;

public class charwithfreq{
    
   static void characterfreq(String mystr){
        
        int count[]=new int[26];

        for(int i=0;i<mystr.length();i++){
             
            count[mystr.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){

             if(count[i]>0){
            System.out.println((char)(i+'a')+" "+count[i]);
        }
        }
        
       
   } 
    
    
    
    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");//geeks for geeks
        String mystr = sc.nextLine();

        characterfreq(mystr);

        sc.close();
    }
}