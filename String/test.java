import java.util.*;


public class test {
    public static void main(String[]args){

        // String s1 ="i am rajneesh";

        // String s = "";

        // String ch[] = s1.split(" ");

        

        // for(String i:ch){

        //     i = Character.toUpperCase(i.charAt(0))+i.substring(1);

        //     s = s+i+" ";
        // }

        // System.out.println(s.trim());



        //q1. print each character of the string in separate line.

        // String s ="Its Simple";

        // int n = s.length();

        // for(int i=0;i<n;i++){

        //     char ch = s.charAt(i);

        //     System.out.println(ch);
        // }

        //q2. print ascii code of each character.
        
        
        // for(int i=0;i<n;i++){

        //     char ch = s.charAt(i);

        //     System.out.println(ch+" "+(int)ch);
        // }
        

        //q3. print only uppercase letter.

        // for(int i=0;i<n;i++){

        //     char ch = s.charAt(i);

        //     if(Character.isUpperCase(ch)){

        //         System.out.println(ch);
        //     }
        // }


        //q4. count only uppercase letter.

        // int count=0;
        
        // for(int i=0;i<n;i++){

        //     char ch = s.charAt(i);

        //     if(Character.isUpperCase(ch)){

        //         count++;
        //     }
        // }

        // System.out.println(count);


        //q5. count number of vowels

        // int count =0;
        // for(int i=0;i<s.length();i++){
            
        //     char ch = s.charAt(i) ;

        //     char u = Character.toUpperCase(ch);

        //     if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U'){

        //         count++;
        //     }
        // }

        // System.out.println(count);


        //q6. create a string only uppercase letter

        // String khaaliforupper = "";
        // String khaaliforlower = "";

        // for(int i=0;i<s.length();i++){

        //     char ch = s.charAt(i);

        //     if(Character.isUpperCase(ch)){
               
        //         khaaliforupper = khaaliforupper+ch;
        //     }
        //     if(Character.isLowerCase(ch)){
        //         khaaliforlower = khaaliforlower+ch;
        //     }
        // }

        // System.out.println(khaaliforupper);
        // System.out.println(khaaliforlower);


        //q7. print string without white spaces

        // String khaali ="";

        // for(int i=0;i<s.length();i++){
            
        //     char ch = s.charAt(i);

        //     if(!Character.isWhitespace(ch)){
        //          khaali = khaali+ch;
        //     }
        // }

        // System.out.println(khaali);


        // q8. reverse case string

        // String khaali = "";

        // for(int i=0;i<s.length();i++){

        //     char ch = s.charAt(i);

        //     if(Character.isUpperCase(ch)){
        //         khaali = khaali+Character.toLowerCase(ch);
        //     }
        //     else{
        //         khaali = khaali+Character.toUpperCase(ch);
        //     }
        // }

        // System.out.println(khaali);


        // q9. reverse the string

        // String ulta ="";

        // for(int i=0;i<s.length();i++){

        //     char ch = s.charAt(i);
            
        //     ulta = ch+ulta;

        // }

        // System.out.println(ulta);

        // q10. String encoding program-piglet

        // String s1 = "Eat";

        // String khaali = "";

        // for(int i=0;i<s1.length();i++){

        //     char ch = s1.charAt(i);

        //     char u = Character.toUpperCase(ch);

        //     if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U'){
                
        //         if(i==0){
        //             khaali = s1+"WAY";
        //         }
        //         else{
        //             khaali = s1.substring(i)+s1.substring(0,i);
        //         }
        //         break;
        //     }
        // }

        // System.out.println(khaali);


        //q11. print each word in different line

        // String s = "i am in the box";

        // s=s+" ";

        // String w ="";

        // for(int i=0;i<s.length();i++){

        //     char ch = s.charAt(i);

        //     if(ch!=' '){
        //        w=w+ch;
        //     }
        //     else{
        //         System.out.println(w);
        //         w="";
        //     }
        // }


        //q12. first character of each word

        // for(int i=0;i<s.length();i++){

        //     char ch= s.charAt(i);

        //     if(ch!=' '){
        //         w = w+ch;
        //     }
        //     else{

        //         System.out.println(w.charAt(0));
        //         w="";
        //     }
        // }


        //q13. word start with specific word

        String s = "r am in rhe box";

        s=s+" ";

        String w ="";

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if(ch!=' '){
                w = w+ch;
            }

            else{
                if(w.startsWith("r")){
                    System.out.println(w);
                }
                w="";
            }
        }


    }
}


