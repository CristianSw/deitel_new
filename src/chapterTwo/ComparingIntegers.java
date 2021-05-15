package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.print("Enter a: ");
        a = scanner.nextInt();

        System.out.print("Enter b: ");
        b = scanner.nextInt();

        if (a > b) {
            System.out.println("a is larger");
        } else if (a < b) {
            System.out.println("b is larger");
        } else {
            System.out.println("a equals b");
        }
    }
}
