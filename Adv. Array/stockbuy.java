public class stockbuy {
    
    //-------------------------------------Naive Solution-----------------------------------------

    // static int sellnbuy(int price[],int start,int end){

    //     int n = price.length;

    //     if(end<=start){
    //         return 0;
    //     }

    //     int profit=0;

    //     for(int i=start;i<end;i++){

    //         for(int j=i+1;j<=end;j++){

    //             if(price[j]>price[i]){

    //                 int curr_profit = (price[j]-price[i])+sellnbuy(price, start, i-1)+sellnbuy(price, j+1, end);

    //                 profit =Math.max(profit,curr_profit);
    //             }
    //         }
    //     }

    //     return profit;
    // }
    
    //------------------------------------------------------Efficient Approach--------------------------------------------------------

    static int sellnbuy(int price[]){
        int n = price.length;
        
        int profit=0;
        for(int i=1;i<n;i++){
             if(price[i-1]<price[i]){

                profit = profit+(price[i]-price[i-1]);
             }
        }

        return profit;
    }
    
    
    
    public static void main(String[]args){

        int price[]={1,5,3,8,12};

        // int n = price.length;
        // int start = 0;

        // int end = n-1;

        // int fayda = sellnbuy(price,start,end);

        // System.out.println("kitna fyada hua bechne pr: "+ fayda);

        
        //-----------------------------------------------------------Efficient Approach----------------------------------------

        int fayda = sellnbuy(price);
        System.out.println("kitna fyada hua bechne pr: "+ fayda);

    }
}
