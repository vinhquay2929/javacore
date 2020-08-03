package lesson2;

import java.util.Scanner;

public class activity22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = in.nextInt();
        System.out.println(n + "+" + n + n + "+" + n + n + n + "=" +(n+(n*10+n)+(n*100+n*10+n)));
    }
}
