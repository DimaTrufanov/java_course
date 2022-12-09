package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year1 = 2022;

        System.out.print("Year of birth :");
        int year2 = in.nextInt();

        int age = year1 - year2;
        System.out.print("You are " + age + " years old.");
        in.close();
    }
}
