

public class stringsubsequence {
    
    static boolean is_subsequenceornot(String str1,String str2){

        int n=str1.length();
        int m=str2.length();
        int j=0;
        
        for(int i=0;i<n&&j<m;i++){

            if(str1.charAt(i)==str2.charAt(j)){
                j++;
            }
        }

        if(j==m){
            return true;
        }

        return false;

    }
    
    public static void main(String[]args){

        

        String str1="abcdef";

        String str2 ="ade";

        is_subsequenceornot(str1,str2);

        System.out.println(is_subsequenceornot(str1,str2));

    }
}
