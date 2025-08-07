public class firstcap {
    public static void main(String[]args){

        String s = "i am debanjan";
        
        String ans = "";
        String []a = s.split(" ");

        for(String itr:a){

            itr = Character.toUpperCase(itr.charAt(0))+itr.substring(1);

            ans = ans+itr+" ";
        }

        System.out.println(ans.trim());
    }
}
