package lesson2;

import java.util.Scanner;

public class Activity21 {
    public static void main(String[] args) {
        System.out.println("Nhap hai so a va b");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap so b: ");
        int b = scanner.nextInt();
        System.out.println(a + "+" + b + "="  + (a+b));
        System.out.println(a + "-" + b + "="  + (a-b));
        System.out.println(a + "*" + b + "="  + (a*b));
        System.out.println(a + "/" + b + "="  + (a/b));
        System.out.println(a + "%" + b + "="  + (a%b));
    }
}
