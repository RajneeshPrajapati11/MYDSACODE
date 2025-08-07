public class naturalsum {
    
    static int getsum(int n){

        if(n==0){
            return 0;
        }
        return n+getsum(n-1);
    }
    
    public static void main(String[]args){
        int n=4;

        System.out.println(getsum(n));
    }
}
