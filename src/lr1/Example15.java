package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = in.nextInt();

        System.out.print("Input second number: ");
        int b = in.nextInt();

        int result = a + b;
        System.out.print(result);
        in.close();
    }
}
