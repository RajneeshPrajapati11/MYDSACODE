public class nto1{
    
    static void print_no(int n){
         
        if(n==1){
            System.out.print(1);
            return;
        }
        
        System.out.print(n+" ");

        print_no(n-1);
    }
    
    
    
    
    public static void main(String[]args){

        int n = 5;
        print_no(n);
    }
}