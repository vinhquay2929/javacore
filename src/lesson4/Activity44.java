package lesson4;

import java.util.Scanner;

public class Activity44 {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        int n = sum.nextInt();
        float s = 0;
        for(int i = 1; i <= n; i++){
            s+=i;
        }
        System.out.println("The sum of 1 to " + n + " is " + (int)s);
        System.out.println("The average is " + (float)(s/n));
    }
}
