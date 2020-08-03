package lesson2;

import java.util.Scanner;

public class activity23 {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = on.nextInt();
        int i;
        for (i=1;i<=10;i++){
            System.out.println(n + "x" + i + "=" + (n*i));
        }
    }
}
