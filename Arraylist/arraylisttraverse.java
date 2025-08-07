import java.util.*;

public class arraylisttraverse {
    public static void main(String[]args){

        ArrayList<Integer>al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);

        // for(int i=0;i<al.size();i++){
        //     System.out.println(al.get(i)); //this method is not use generally
        // }


        // //universal approaches

        // for(int i:al){
        //     System.out.println(i);
        // }
        

        // //using iterator
        Iterator it = al.iterator();

        // while(it.hasNext())//hasnext check next element hai ki nahi
        // {
        //     System.out.println(it.next()+" ");//next print the next element
        // }


        //remove element using iterator while traversing

        // while(it.hasNext())//hasnext check next element hai ki nahi
        // {
        //     int x = (Integer)it.next();

        //     if(x<20){
        //         it.remove();
        //     }
        //     else{
        //         System.out.println(x);
        //     }
        // }


        //using forEach() for traversal

        al.forEach(x->System.out.println(x));



    }
}
