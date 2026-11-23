package Tasks;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        run(scanner);
        scanner.close();
    }

    public static void run(Scanner scanner) {
        System.out.println("Введите четыре числа (a, b, c, d):");
        double a = Main.readDouble(scanner);
        double b = Main.readDouble(scanner);
        double c = Main.readDouble(scanner);
        double d = Main.readDouble(scanner);

        double minAB = Math.min(a, b);
        double minCD = Math.min(c, d);
        double result = Math.max(minAB, minCD);

        System.out.println("min(a, b) = " + minAB + ", min(c, d) = " + minCD);
        System.out.println("max(min(a, b), min(c, d)) = " + result);
    }
}