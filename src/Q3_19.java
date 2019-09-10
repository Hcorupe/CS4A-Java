import java.util.Scanner;
import java.lang.*;

public class Q3_19 {

    public static void main(String[] arge){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter three sides of a triangle : ");
        double sideOne = in.nextDouble();
        double sideTwo = in.nextDouble();
        double sideThree = in.nextDouble();
        double perimeter = sideOne + sideTwo + sideThree;
        boolean valid = false;

        if (( sideOne + sideTwo < sideThree )
                && (sideOne + sideThree < sideTwo)
                && (sideThree + sideTwo < sideOne)){
            valid = true;
        }

        if(valid = true){
            System.out.println("The parimeter of the triangle is "+ perimeter);
        }
        else{
            System.out.println("The input is invalid ");
        }

    }

}
