package lesson4;

import java.util.Scanner;

public class Activity46 {
    public static void main(String[] args) {
        int count = 0, a;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any decimal number:");
        int n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            x = a + "" + x;
            n = n / 2;
        };
        System.out.println("Binary number:" + x );
    }
}
