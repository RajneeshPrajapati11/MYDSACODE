public class ropecuttingprob {
    
    static int maxpieces(int n,int a,int b,int c){

        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }

        int res=Math.max(maxpieces(n-a, a, b, c),Math.max(maxpieces(n-b, a, b, c),maxpieces(n-c, a, b, c)));

        if(res==-1){
            return -1;
        }

        return res+1;
    }
    
    
    public static void main(String[]args){

        int n=5;
        int a=2,b=5,c=1;

        System.out.println(maxpieces(n,a,b,c));
    }
}
