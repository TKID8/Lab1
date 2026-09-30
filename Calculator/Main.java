import java.util.Scanner;
import static java.lang.System.out;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
// Визуальная часть меню
            while (running) {
                out.println("\n=== ГЛАВНОЕ МЕНЮ ЛАБОРАТОРНОЙ №1(Вариант 4) ===");
out.println(" ");
                out.println("Выберите пункт меню (1-5): ");
out.println(" ");
                out.println("1 - Задание 1 (Функции T и F)");
                    out.println("    Функция T");
                    out.println("    Функция F");
out.println(" ");
                out.println("2 - Задание 2 Задача по физике (Расчёт скорости капель относительно автомобиля) ");
out.println(" ");
                out.println("3 - Задание 3 Задача по геометрии (Расчет высоты и медианы к стороне a");
out.println(" ");                
                out.println("4 - Задание 4 Перевод кол-во шагов в Км, Мили и Морские мили");
out.println(" ");
                out.println("5 - Задание 5 - Проекция Точки");
out.println(" ");
                // Если ввод не соответствует ни одному из пунктов меню, то выводится сообщение об ошибке
                if (!scanner.hasNextInt()) {
                    out.println("Неверный ввод. Пожалуйста, введите число от 1 до 5.");
                    scanner.next(); // Пропускаем неверный ввод
                    continue; // Возврат к началу цикла
                }


                

                int choice = scanner.nextInt();



                

// Логика Переходов по меню                




                switch (choice) {
                    case 1:{
                        boolean inTask1 = true;
                        while (inTask1) {
                            out.println("\n=== ЗАДАНИЕ 1 ===");
                            out.println("1 - Функция T");
                            out.println("2 - Функция F");
                            out.println("3 - Назад в главное меню");

                            String subChoice = scanner.next(); 
                            
                            if (subChoice.equalsIgnoreCase("3")) {
                                inTask1 = false; // Возврат в главное меню
                                break;
                            }

                            int subNum;
                            try {
                                subNum = Integer.parseInt(subChoice);
                            } catch (NumberFormatException e) {
                                out.println("Неверный ввод. Введите номер функции или 'назад'.");
                                continue; // Продолжаем цикл, чтобы пользователь мог ввести снова
                            }
                          // Цикл для ввода переменных и вызова функций T и F
                            boolean calculating = true;
                            while (calculating) {
                                if (subNum == 1) {
                                    out.println("\n[ЗАГЛУШКА] функция T");
                                    // Место дял вызова переменных u, y и вызов метода
                                    out.print("Введите переменные или напишите 'ресет' для повторного ввода, 'назад' для выбора функции:");
                                    String Command = scanner.next();

                                    if (Command.equalsIgnoreCase("назад")) {
                                        calculating = false; // Возврат к выбору функции
                                   }else if (Command.equalsIgnoreCase("ресет")) {
                                        out.println("Перезапуск ввода переменных...");
                                        // Цикл Ввода повторится
                                   }
                                } else if (subNum == 2) {
                                    out.println("\n[ЗАГЛУШКА] функция F");
                                    // Здесь будет запрос переменных для F
                                    out.print("Введите переменные или напишите 'ресет' для повторного ввода, 'назад' для выбора функции:");
                                    String Command = scanner.next();

                                    if (Command.equalsIgnoreCase("назад")) {
                                        calculating = false; // Возврат к выбору функции
                                    } else if (Command.equalsIgnoreCase("ресет")) {
                                        out.println("Перезапуск ввода переменных...");
                                    }
                                } else {
                                    out.println("Неверный выбор функции. Пожалуйста, выберите 1 или 2.");
                                    calculating = false;
                                }
                            }
                        }
                            break;
                            }   
                
                    case 2:{
                            boolean calculating = true;
                            while (calculating) {
                                
                                if (calculating) {
                                    out.println("\n[ЗАГЛУШКА] Задача по физике (Расчёт скорости капель относительно автомобиля)");
                                    // Здеcь будет запрос переменных для задачи по физике
                                    out.print("Введите переменные или напишите 'ресет' для повторного ввода, 'назад' для выбора функции: ");
                                    String command = scanner.next();
                
                                    if (command.equalsIgnoreCase("назад")) {
                                        calculating = false; // Возврат к выбору функции
                                    } else if (command.equalsIgnoreCase("ресет")) {
                                        out.println("Перезапуск ввода переменных...");
                                        // цикл продолжится, заново запрашивая данные
                                    }
                                }
                            }
                            break;
                            }
                    case 3:{
                            boolean calculating = true;
                            while (calculating) {
                                
                                if (calculating) {
                                    out.println("\n[ЗАГЛУШКА] Задача по геометрии (Расчет высоты и медианы к стороне a)");
                                    // Здеcь будет запрос переменных для задачи по геометрии
                                    out.print("Введите переменные или напишите 'ресет' для повторного ввода, 'назад' для выбора функции: ");
                                    String command = scanner.next();
                
                                    if (command.equalsIgnoreCase("назад")) {
                                        calculating = false; // Возврат к выбору функции
                                    } else if (command.equalsIgnoreCase("ресет")) {
                                        out.println("Перезапуск ввода переменных...");
                                        // цикл продолжится, заново запрашивая данные
                                    }
                                }
                            }
                            break;
                            }
                    case 4:{
                            boolean calculating = true;
                            while (calculating) {
                                
                                if (calculating) {
                                    out.println("\n[ЗАГЛУШКА] Задача для перевода кол-во шагов в Км, Мили и Морские мили");
                                    // Здеcь будет запрос переменных для задачи по геометрии
                                    out.print("Введите количество шагов или напишите 'ресет' для повторного ввода, 'назад' для выбора функции: ");
                                    String command = scanner.next();
                
                                    if (command.equalsIgnoreCase("назад")) {
                                        calculating = false; // Возврат к выбору функции
                                    } else if (command.equalsIgnoreCase("ресет")) {
                                        out.println("Перезапуск ввода переменных...");
                                        // цикл продолжится, заново запрашивая данные
                                    }
                                }
                            }
                            break;
                            }
                    case 5:{
                            boolean calculating = true;
                            while (calculating) {
                                
                                if (calculating) {
                                    out.println("\n[ЗАГЛУШКА] Задача для Проекции Точки");
                                    // Здеcь будет запрос переменных для задачи по геометрии
                                    out.print("Введите координаты точки или напишите 'ресет' для повторного ввода, 'назад' для выбора функции: ");
                                    String command = scanner.next();
                
                                    if (command.equalsIgnoreCase("назад")) {
                                        calculating = false; // Возврат к выбору функции
                                    } else if (command.equalsIgnoreCase("ресет")) {
                                        out.println("Перезапуск ввода переменных...");
                                        // цикл продолжится, заново запрашивая данные
                                    }
                                }
                            }
                        
                        break;


                        }

                    }
                }
                scanner.close();
            }
     }
  
    