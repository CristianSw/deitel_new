package chapterTwo;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;

        System.out.print("Enter value: ");
        value = scanner.nextInt();

        if (value % 2 == 0) {
            System.out.println("value is even");
        } else {
            System.out.println("value is odd");
        }
    }
}
