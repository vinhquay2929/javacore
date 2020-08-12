package lesson4;

import java.util.Scanner;

public class Activity45 {
    public static void main(String[] args) {
        Scanner gt = new Scanner(System.in);
        int n = gt.nextInt();
        int s = 1;
        for(int i = 1; i <= n; i++){
            s*=i;
        }
        System.out.println(n + "! = " + s);
    }
}
