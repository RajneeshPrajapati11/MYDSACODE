public class fibonacci {
    
    static int printfib(int n){

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return printfib(n-1)+printfib(n-2);
    }
    
    
    
    public static void main(String[]args){

        int n=3;
        System.out.println(printfib(n));
    }
}
