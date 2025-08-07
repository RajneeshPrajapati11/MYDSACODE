// this is valid for only distinct element



public class improvepatsearch {
    
    static void patsearching(String txt,String pat){

        int n=txt.length();
        int m =pat.length();

        for(int i=0;i<=(n-m);){
            int j;
            for(j=0;j<m;j++){

                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }

            if(j==m){
               System.out.print(i+" ");
            }

            if(j==0){
                i++;
            }

            else{
                i=(i+j);
            }
        }
    }
    
    
    public static void main(String[]args){
        String txt ="ABCEABEFABCD";
        String pat ="ABCD";

        patsearching(txt,pat);
    }
}
