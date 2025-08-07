import java.util.*;
public class unionofsortedarr {
   

    //---------------------------------------------------------Naive solution-----------------------------------------------------------
//    static void printunion(int a[],int b[]){

//        int n=a.length;
//        int m=b.length;

//        int c[]=new int[m+n];

//        for(int i=0;i<n;i++){
          
//            c[i]=a[i];
//        }

//        for(int i=0;i<m;i++){
//            c[i+n]=b[i];
//        }
//        Arrays.sort(c);

//        for(int i=0;i<m+n;i++){
//           if(i==0||c[i]!=c[i-1]){
//             System.out.print(c[i]+" ");
//           }
//        }

//    }
   
//---------------------------------------------------------------Efficient solution using merge sort----------------------------------------
   static void printunion(int a[],int b[]){

       int n=a.length;
       int m=b.length;

       int i=0;
       int j=0;

       while(i<n&&j<m){
           
           if(i>0&&a[i]==a[i-1]){ i++; continue;}
           if(j>0&&a[j]==a[j-1]){j++;continue;}

           if(a[i]<b[j]){
               System.out.print(a[i]+" ");
               i++;
           }
           else if(a[i]>b[j]){
            System.out.print(b[j]+" ");
            j++;
           }
           else{
               System.out.print(a[i]+" ");
               i++;
               j++;
           }
       }
       while(i<n){
            if(i>0&&a[i]!=a[i-1]){
                System.out.print(a[i]+" ");
                i++;
            }

            
       }
       while(j<m){
            if(j>0&&b[j]!=b[j-1]){
                System.out.print(b[j]+" ");
                j++;
            }

            
       }
   }
   
    public static void main(String[]args){
        
        int a[]={3,5,8};
        int b[]={2,8,9,10,15};

        printunion(a,b);
    }
}
