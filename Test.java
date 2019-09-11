
import java.lang.String;

public class Test {

    public static void main(String[] arge) {


        String s = "Java";

        if(s.substring(s.length() - 4).equals("Java"))
            System.out.println("True");

        if(s.lastIndexOf("Java")>=0)
            System.out.println("True");

        if(s.substring(s.length() - 5).equals("Java"))
            System.out.println("True");


        if(s.endsWith("Java"))
            System.out.println("True");


        if(s.charAt(s.length()- 4)== 'J'
                && s.charAt(s.length() - 3) == 'a'
                && s.charAt(s.length()-2)== 'v'
                && s.charAt(s.length() - 1) == 'a')
            System.out.println("True");








    }



    }


