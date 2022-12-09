package lr1;

import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
    int a = in.nextInt();

        System.out.print("Input second number: ");
    int b = in.nextInt();

    int res1 = a + b;
    int res2 = a - b;
    System.out.print(res1 + "," + res2 + ".");
    in.close();
    }
}
