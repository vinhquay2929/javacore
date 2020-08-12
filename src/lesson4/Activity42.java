package lesson4;

import java.util.Scanner;

public class Activity42 {
    public static void main(String[] args) {
        Scanner tg = new Scanner(System.in);
        int n = tg.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for(int j = 1; j <= 2*i-1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
