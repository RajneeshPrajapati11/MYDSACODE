import java.util.*;

public class methods {
    public static void main(String[] args) {
        ArrayList<String>al = new ArrayList<>();
        

        // add method

        al.add("my");
        al.add("name");
        al.add("is");
        al.add("vishal");

        System.out.println(al);
                                                                     
        al.add(3,"Rajneesh");

        System.out.println(al);

        System.out.println(al.size());


        // contains method ------> return boolean value

        System.out.println(al.contains("Rajneesh"));

        System.out.println(al.contains("rajneesh"));

        //remove method -----> return boolean value
        //index bhi de skte hai or object bhi
        System.out.println(al.remove("vishal"));
        // System.out.println(al.remove(3));

        System.out.println(al);

        // get method----> to get element by index

        System.out.println(al.get(3));

        // set method---->to set element at given index
        
        al.set(3,"vishal");
        System.out.println(al);

        // indexOf---->return index of given object from starting or agr present nahii hai element toh return -1

       System.out.println(al.indexOf("vishal"));


       //lastIndexOf(object)---->jisse index vo element last baar mila hai vo return karega

       al.add("vishal");
       al.add("vishal");
       System.out.println(al);
       
       System.out.println(al.lastIndexOf("vishal"));


       //clear()----->empty the list
       //isEmpty()--->check the list is empty or not----return boolean value

       System.out.println(al.isEmpty());
       

       al.clear();
       System.out.println(al.isEmpty());





    }
}
