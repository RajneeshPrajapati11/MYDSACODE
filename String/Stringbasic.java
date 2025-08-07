import java.util.*;


public class Stringbasic{
    public static void main(String[]args){

        //String declaration

        //1.String class----->**immutable**

        String str = "rajneesh";
        System.out.println(str);

        String str1 = new String("Rajneesh");
        
        System.out.println(str1);


        //2. StringBuffer class---->thread safe class (**mutable**)

        StringBuffer str2 = new StringBuffer("RajneeshPraja");

        System.out.println(str2);

        //3. StringBuilder class----->is not thread safe(**mutable**)

        StringBuilder str3 = new StringBuilder("RajneeshPrajapati");

        System.out.println(str3);

    }
}