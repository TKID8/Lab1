package Tasks;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        run(scanner);
        scanner.close();
    }

    public static void run(Scanner scanner) {
        System.out.println("=== Фруктовое анкетирование ===");

        // Вопрос 1
        System.out.println("\n1. Любите ли вы цитрусовые? (да/нет)");
        String q1 = readYesNo(scanner);
        if (q1.equals("да")) {
            System.out.println("Какой цитрус берёте чаще всего?");
            System.out.println("1 - Апельсин");
            System.out.println("2 - Мандарин");
            System.out.println("3 - Лимон / Грейпфрут");
            switch (Main.readInt(scanner)) {
                case 1:
                    System.out.println("Классика для свежего сока и перекуса.");
                    break;
                case 2:
                    System.out.println("Отличный выбор, особенно зимой!");
                    break;
                case 3:
                    System.out.println("Смело — кислинка на любителя.");
                    break;
                default:
                    System.out.println("Необычный вариант из мира цитрусовых.");
                    break;
            }
        } else {
            System.out.println("Понятно, цитрусы — не ваш фаворит.");
        }

        // Вопрос 2
        System.out.println("\n2. Предпочитаете экзотические фрукты? (да/нет)");
        String q2 = readYesNo(scanner);
        if (q2.equals("да")) {
            System.out.println("Что больше по душе?");
            System.out.println("1 - Манго");
            System.out.println("2 - Ананас");
            System.out.println("3 - Маракуйя / Питахайя");
            switch (Main.readInt(scanner)) {
                case 1:
                    System.out.println("Спелое манго — топ для десертов и смузи.");
                    break;
                case 2:
                    System.out.println("Сочно и освежающе!");
                    break;
                case 3:
                    System.out.println("Настоящая экзотика с ярким вкусом.");
                    break;
                default:
                    System.out.println("Экзотический выбор принят.");
                    break;
            }
        } else {
            System.out.println("Местные и привычные фрукты тоже отличные.");
        }

        // Вопрос 3
        System.out.println("\n3. Делаете ли вы фруктовые смузи или салаты? (да/нет)");
        String q3 = readYesNo(scanner);
        if (q3.equals("да")) {
            System.out.println("Какая основа чаще всего?");
            System.out.println("1 - Банан");
            System.out.println("2 - Яблоко или груша");
            System.out.println("3 - Ягоды");
            switch (Main.readInt(scanner)) {
                case 1:
                    System.out.println("Банан даёт густую и сытную текстуру.");
                    break;
                case 2:
                    System.out.println("Лёгкий и хрустящий вариант.");
                    break;
                case 3:
                    System.out.println("Яркий цвет и насыщенный вкус.");
                    break;
                default:
                    System.out.println("Интересный рецепт!");
                    break;
            }
        } else {
            System.out.println("Целый фрукт сам по себе отличный перекус.");
        }

        // Вопрос 4
        System.out.println("\n4. Любите ли вы сушёные фрукты (сухофрукты)? (да/нет)");
        String q4 = readYesNo(scanner);
        if (q4.equals("да")) {
            System.out.println("Что выбираете чаще?");
            System.out.println("1 - Курага");
            System.out.println("2 - Чернослив");
            System.out.println("3 - Финики / Изюм");
            switch (Main.readInt(scanner)) {
                case 1:
                    System.out.println("Сладкая и полезная добавка к каше или чаю.");
                    break;
                case 2:
                    System.out.println("Насыщенный вкус, хорошо сочетается даже с блюдами.");
                    break;
                case 3:
                    System.out.println("Быстрый заряд энергии.");
                    break;
                default:
                    System.out.println("Хороший выбор сухофруктов.");
                    break;
            }
        } else {
            System.out.println("Свежие фрукты вам ближе.");
        }

        System.out.println("\nСпасибо за участие во фруктовом опросе!");
    }

    private static String readYesNo(Scanner scanner) {
        while (true) {
            String answer = scanner.next().trim().toLowerCase();
            if (answer.equals("да") || answer.equals("нет")) {
                return answer;
            }
            System.out.print("Введите «да» или «нет»: ");
        }
    }
}