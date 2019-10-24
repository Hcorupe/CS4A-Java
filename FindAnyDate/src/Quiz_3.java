import java.util.Scanner;

public class Quiz_3 {

final int STARTDAY = 1;
final int STARTMONTH = 1;
final int STARTYEAR = 1900;
final String REFERANCE = "Monday";
public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    int day   = 0;
    int month = 0;
    int year  = 0;

    System.out.println("Enter a day in MM DD YYYY format(example 11 1 1970 or 6 21 2011");


    month = in.nextInt();
    day = in.nextInt();
    year = in.nextInt();

    System.out.println("day"+ day + "month" + month + " year"+ year);
    int day_of_the_week = 0;
    int NumOFDaysBetween = getTotalNumberOfDays(year);
    int numberOfDaysInMonth = getNumOfDaysInMonth(year,month);
    int totalNumberOfDays = NumOFDaysBetween + numberOfDaysInMonth + day;

    getNumOfDaysInMonth(year,month);

    if(year == 1900){





    }else{
        

    }


        for(int m = 0; m < month; m++){
            int monthcount++;
            for(int d = 0; d < day;d++){
                int daycount++;
                for(int y = 0; y < year; y++){
                    int yearcount++;
                }
            }
        }


    if(day <= 7){
        day_of_the_week = day;
    }
    else
        day_of_the_week = day % 7;


    System.out.println("Total number of days " + totalNumberOfDays);
    System.out.println("day of week  "+ day_of_the_week);

    System.out.println(" days in month " + numberOfDaysInMonth);

    String result = getDayOfWeek(day_of_the_week);
    System.out.println(result);

}
public static String getDayOfWeek(int day_of_the_week){

    String dayOfWeek = " ";

    switch(day_of_the_week) {
        case 1:
            dayOfWeek = "Monday";break;
        case 2:
            dayOfWeek = "Tuesday";break;
        case 3:
            dayOfWeek = "Wednesday";break;
        case 4:
            dayOfWeek = "Thursday";break;
        case 5:
            dayOfWeek = "Friday";break;
        case 6:
            dayOfWeek = "Saturday";break;
        case 7:
            dayOfWeek = "Sunday";break;

    }

    return dayOfWeek;
}



public static int getTotalNumberOfDays(int year){

    int total = 0;

    for(int i = 1900; i <= year; i++){
        if(isLeapYear(year)) {
            total = total + 365;
            System.out.println("365");
        }
        else {
            total = total + 366;
            System.out.println("366\n");
        }
    }
    return total;
    }



public static boolean isLeapYear(int year) {
    System.out.println("isleapYear");
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

    }


public static int getNumOfDaysInMonth(int year, int month) {


    if (month == 1 || month == 3 || month == 5 || month == 7 ||
            month == 8 || month == 10 || month == 12) {

        return 31;
    }

    if (month == 4 || month == 6 || month == 9 || month == 11) {

        return 30;
    }

    if (month == 2) {

        return isLeapYear(year) ? 29 : 28;
    }
    else return 0;

}




}






