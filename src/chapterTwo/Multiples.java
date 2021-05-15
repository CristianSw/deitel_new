package chapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.print("Enter a: ");
        a = scanner.nextInt();

        System.out.print("Enter b: ");
        b = scanner.nextInt();

        if (a % b == 0) {
            System.out.println("a is multiple of b");
        } else {
            System.out.println("a isn't multiple of b");
        }
    }
}
