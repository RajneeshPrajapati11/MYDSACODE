

public class naivepatsearch {


    static void patsearching(String txt,String pat){

        int n=txt.length();
        int m=pat.length();

        for(int i=0;i<=n-m;i++){
            int j;
            for( j=0;j<m;j++){
                if(pat.charAt(j)!=txt.charAt(i+j)){
                break;
                }
            }
            
            if(j==m){
                System.out.print(i+" ");
            }
        }


    }
    public static void main(String[]args){

        String txt ="ABCABCD";
        String pat ="ABCD";

        patsearching(txt,pat);
    }
}
