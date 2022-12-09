package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input day of the week: ");
        String day = in.nextLine();

        switch (day){
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            case "Sunday":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }

        System.out.print("Input the month: ");
        String month = in.nextLine();

        switch (month){
            case "January":
                System.out.println("January");
                break;
            case "February":
                System.out.println("February");
                break;
            case "March":
                System.out.println("March");
                break;
            case "April":
                System.out.println("April");
                break;
            case "May":
                System.out.println("May");
                break;
            case "June":
                System.out.println("June");
                break;
            case "July":
                System.out.println("July");
                break;
            case "August":
                System.out.println("August");
                break;
            case "September":
                System.out.println("September");
                break;
            case "October":
                System.out.println("October");
                break;
            case "November":
                System.out.println("November");
                break;
            case "December":
                System.out.println("December");
                break;
            default:
                System.out.println("Error");
        }

        System.out.print("Input the date: ");
        int date = in.nextInt();

        if (date <= 31 && date > 0){
            System.out.println(date);
        } else {
            System.out.println("Error");
        }

        System.out.printf("Date: %s %d %s \n", day, date, month);
        in.close();
    }
}
