package chapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        int sum, prod, diff;
        float divide;

        System.out.print("Enter a: ");
        a = scanner.nextInt();

        System.out.print("Enter b: ");
        b = scanner.nextInt();

        sum = a + b;
        prod = a * b;
        diff = a - b;
        if (b == 0) {
            System.out.println("Division by zero is not available");
            divide = 0;
        } else {
            divide = a / b;
        }

        System.out.println("SUM: " + sum);
        System.out.println("DIF: " + diff);
        System.out.println("PROD: " + prod);
        System.out.println("DIV: " + divide);
    }

}
