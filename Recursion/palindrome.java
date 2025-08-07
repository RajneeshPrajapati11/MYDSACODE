public class palindrome {
    
    static boolean ispalindrome(String s,int start,int end){

        if(start>=end){
            return true;
        }

        return s.charAt(start)==s.charAt(end)&& ispalindrome(s, start+1, end-1);
    }
    
    
    
    public static void main(String[]args){

        String s ="abbcbba";
        int start=0;
        int end =s.length()-1;
        System.out.println(ispalindrome(s,start,end));
    }
}
