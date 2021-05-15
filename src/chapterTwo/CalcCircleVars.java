package chapterTwo;

import java.util.Scanner;

public class CalcCircleVars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius;
        double diameter, circumference, area;

        System.out.print("Enter radius: ");
        radius = scanner.nextInt();

        diameter = radius * 2;
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);

        System.out.println("Diameter = " + diameter);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
    }

}
