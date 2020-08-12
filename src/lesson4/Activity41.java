package lesson4;

import java.util.Scanner;

public class Activity41 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = nhap.nextInt();
        for(int i = 1 ; i <= n ; i++ ){
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n) {
        int s0 = 0;
        int s1 = 1;
        int sn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 1 ) {
            return 0;
        } else if (n == 2 ) {
            return 1;
        } else{
            for (int i = 3; i < n; i++) {
                s0 = s1;
                s1 = sn;
                sn = s0 + s1;
            }
        }
        return sn;
    }
}

