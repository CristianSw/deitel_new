package chapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        int sum, average, product;

        System.out.print("Enter a: ");
        a = scanner.nextInt();

        System.out.print("Enter b: ");
        b = scanner.nextInt();

        System.out.print("Enter c: ");
        c = scanner.nextInt();

        sum = a + b + c;
        average = sum / 3;
        product = a * b * c;

        if (a > b && a > c) {
            System.out.println("A is larger");
        } else if (a > b && a < c) {
            System.out.println("C is larger");
        } else  if (a <b && b > c) {
            System.out.println("B is larger");
        }else if (c > a && c > b){
            System.out.println("C is larger");
        }

        System.out.println("Sum: " + sum);
        System.out.println("AV: " + average);
        System.out.println("Prod: " + product);
    }
}
