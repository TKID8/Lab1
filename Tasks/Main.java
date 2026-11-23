package Tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== МЕНЮ ВЫБОРА ЗАДАНИЯ ===");
            System.out.println("Доступные задания: 1, 2, 3, 5, 9");
            System.out.println("Введите 0 для выхода из программы");
            System.out.print("Ваш выбор: ");

            int choice = readInt(scanner);

            if (choice == 0) {
                System.out.println("Выход из программы...");
                break;
            }

            System.out.println("---------------------------");
            switch (choice) {
                case 1:
                    Zad1.run(scanner);
                    break;
                case 2:
                    Zad2.run(scanner);
                    break;
                case 3:
                    Zad3.run();
                    break;
                case 5:
                    Zad5.run(scanner);
                    break;
                case 9:
                    Zad9.run(scanner);
                    break;
                default:
                    System.out.println("Такого задания нет! Выберите из списка: 1, 2, 3, 5, 9.");
                    break;
            }
            System.out.println("---------------------------");
        }

        scanner.close();
    }

    public static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double readDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Ошибка! Введите число: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}