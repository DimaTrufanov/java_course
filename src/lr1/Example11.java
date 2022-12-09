package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

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
        System.out.print("Input number of days: ");
        int days = in.nextInt();

        if (days <= 31 && days >= 28){
            System.out.println(days);
        } else {
            System.out.println("Error");
        }
        System.out.printf("There are %d days in %s \n ", days, month);
        in.close();
    }
}
