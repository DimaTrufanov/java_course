package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input age: ");
        int age = in.nextInt();
        int year1 = 2022;
        int year2 = year1 - age;
        System.out.print("Year of birth " + year2 + ".");
        in.close();
    }
}
