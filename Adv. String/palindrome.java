import java.util.*;

public class palindrome {
    
    static boolean ispalindromeornot(String mystr){

        int start =0;int end =mystr.length()-1;

       

        while(start<end){
            if(mystr.charAt(start)!=mystr.charAt(end)){
                return false;
            }

                start++;
                end--;
        }

        return true;
        
    }
    
    
    
    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");

        String mystr = sc.nextLine();

      
        

        System.out.println(ispalindromeornot(mystr));

        sc.close();

    }
}
