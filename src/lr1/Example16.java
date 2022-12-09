package lr1;

import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int a = in.nextInt();

        int b = a - 1;
        int c = a + 1;
        int res = (a + b + c)*(a + b + c);
        System.out.print(b + " , " + a + " , " + c + " , " + res + ".");
        in.close();
    }
}
