public class intersectionofsortedarr {
    
    //-----------------------------------------------------Naive Solution------------------------------------------------------------------
    
    // static void intersection(int a[],int b[]){
    //     int n=a.length;
    //     int m=b.length;

    //     for(int i=0;i<n;i++){

    //         if(i>0&&a[i]==a[i-1]){
    //             continue;
    //         }

    //         for(int j=0;j<m;j++){
    //             if(a[i]==b[j]){
    //                 System.out.print(a[i]+" ");
    //                 break;
    //             }
    //         }
    //     }
    // }
    
    //--------------------------------------------------Efficient solution using merge sort----------------------------------------------------

    static void intersection(int a[],int b[]){
        int n=a.length;
        int m=b.length;

        int i=0;
        int j=0;
        while(i<n&&j<m){
            
            if(i>0&&a[i]==a[i-1]){
                i++;
                continue;
                
            }

            if(a[i]<b[j]){
                i++;
            }

            else if(a[i]>b[j]){
                j++;
            }

            else{
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
    }

    
    
    
    public static void main(String[]args){

        int a[]={3,5,10,10,10,15,15,20};
        int b[]={5,10,10,15,30};


        intersection(a,b);
    }
}
