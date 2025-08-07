import java.util.ArrayList;
import java.util.Iterator;

public class arraylistrevise {
    public static void main(String[]args){

        //make a arraylist and add three items 10,20,30.

        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println(al);
        //[10, 20, 30]

        // java array list method-----------------------------------------------------
        //(i)add(object)
        //(ii)add(index,object)
        
        al.add(1,40);
        System.out.println(al);
        // output: [10, 40, 20, 30]


        //(iii)contains(object)

        System.out.println(al.contains(20));//return boolean value

        //output: true


        //(iv)remove(index) if index is >= size then it throw null pointer exception.-------------
        //(v)remove(object)----------------------------------------------------------------------

        al.remove(0);
        System.out.println(al);
        //[40, 20, 30]
        al.remove(1);
        System.out.println(al);
        //[40, 30]


        ArrayList<String> alstr = new ArrayList<>();

        alstr.add("Rajneesh");
        alstr.add("Prajapati");
        alstr.add("btech");
        alstr.add("cse");

        System.out.println(alstr);
        //[Rajneesh, Prajapati, btech, cse]
        System.out.println(alstr.remove("btech"));
        //true
        System.out.println(alstr.contains("btech"));
        //false

        System.out.println(alstr);


        //(vi) get(index)--------------------------------------------------------------

        System.out.println(alstr.get(0));
        //Rajneesh

        //(vii)set(index,object)----------------------------------------------------------

        alstr.set(2,"btech");

        System.out.println(alstr);
        //[Rajneesh, Prajapati, btech]

        
        //(viii)indexOf(object)--------------------------------------------------------------------

        System.out.println(alstr.indexOf("Rajneesh"));
        //0

        alstr.add("Rajneesh");
        //[Rajneesh, Prajapati, btech, Rajneesh]

        System.out.println(alstr);


        //(ix)lastIndexOf(object)------------------------------------------------------------------

        System.out.println(alstr.lastIndexOf("Rajneesh")); // last index yeh batayega ki vo word last se pahali baar kab occur hora hai.

       //output: 3


       //(x)clear()-------------------------------------------------------------------------
       //(xi)isEmpty()---------------------------------------------------------------


       System.out.println(alstr.isEmpty());
       //false
       alstr.clear();
      

       
       System.out.println(alstr.isEmpty());
       //true



       //------------------------------------------------------------------------------------------------
       //                         ------****ArrayList Traversal****--------
       //
       //------------------------------------------------------------------------------------------------
       

       ArrayList<Integer> myint = new ArrayList<>();

       myint.add(11);
       myint.add(12);
       myint.add(13);
       myint.add(14);
       myint.add(15);


       //1.first approach but not generally use

       for(int i=0;i<myint.size();i++){  // arraylist mai size()
            
            System.out.print(myint.get(i)+" "); //11 12 13 14 15
            

       }

       System.out.println("");


       // 2. universal approach

       for(int i:myint){
            System.out.print(i+" ");
       }
       
       System.out.println("");
       

       // 3. best approach --iterator---> pahle iterator 

       Iterator<Integer> it = myint.iterator(); //important point first import the **import java.util.Iterator;**

       while(it.hasNext()){

            System.out.print(it.next()+" ");
       }

    //    1. Iterator<Integer> it = myint.iterator();
    //    myint is a collection (e.g., ArrayList<Integer>, HashSet<Integer>, etc.).
    //    myint.iterator() returns an Iterator object that allows iteration over the elements of myint.
    //    Iterator<Integer> means that the iterator works with Integer type elements.
    //    2. while (it.hasNext())
    //    hasNext() checks whether there are more elements left in the collection.
    //    If hasNext() returns true, the loop continues.
    //    3. System.out.println(it.next());
    //    next() returns the next element in the iteration.
    //    The element is printed using System.out.println().


        
        // the important point about 3rd method Iterator is by using this you remove item during traversal but in 1,2 method if you want to do
        // the same thing then you get **modification exception**.

        //removing items during traversal
        System.out.println("");

        Iterator<Integer> tr = myint.iterator();
        while(tr.hasNext()){

            int x=(Integer)tr.next();

            if(x<12){
                tr.remove();
            }
            else{
                System.out.print(x+" ");
            }
        }

        System.out.println("");
        // 4. forEach() method

        ArrayList<Integer> fur = new ArrayList<>();

        fur.add(21);
        fur.add(22);
        fur.add(23);
        fur.add(24);

        fur.forEach(x -> System.out.print(x+" "));

       

        //note:- baaki method se 1,2 se modification allow hai but element remove nahi krskte.
    }
}
