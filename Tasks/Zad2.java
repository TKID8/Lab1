package Tasks;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        run(scanner);
        scanner.close();
    }

    public static void run(Scanner scanner) {
        int[] numbers = new int[3];
        System.out.println("Введите три трёхзначных числа:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = readThreeDigitInt(scanner, i + 1);
        }

        System.out.print("Введите число k: ");
        int k = Main.readInt(scanner);

        System.out.print("Введите число l (максимальная сумма цифр, строго меньше l): ");
        int l = Main.readInt(scanner);

        System.out.println("Числа меньше " + k + " с суммой цифр меньше " + l + ":");
        boolean found = false;

        for (int num : numbers) {
            int sumDigits = digitSum(num);
            if (num < k && sumDigits < l) {
                System.out.println("  " + num + " (сумма цифр: " + sumDigits + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("  Подходящих чисел не найдено.");
        }
    }

    private static int readThreeDigitInt(Scanner scanner, int index) {
        while (true) {
            System.out.print("Число №" + index + ": ");
            int val = Main.readInt(scanner);
            int abs = Math.abs(val);
            if (abs >= 100 && abs <= 999) {
                return val;
            }
            System.out.println("Нужно ввести именно трёхзначное число (от 100 до 999 или от -999 до -100).");
        }
    }

    private static int digitSum(int number) {
        int sum = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}