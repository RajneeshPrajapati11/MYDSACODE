public class sumofdigit {
    
    static int digitkasum(int n){

        if(n==0){
            return 0;
        }

        return digitkasum(n/10)+n%10;
    }
    
    
    public static void main(String[]args){
        int n=253;

       System.out.println(digitkasum(n));
    }
}
