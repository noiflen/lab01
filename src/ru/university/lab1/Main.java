
package ru.university.lab1;

import ru.university.lab1.numbers.*;
import ru.university.lab1.strings.*;
import ru.university.lab1.arrays.*;
import ru.university.lab1.methods.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("""
                Лабораторная работа 1. Выберите задание:
                1 - Целочисленные типы
                2 - Вещественные числа
                3 - Побитовые операции
                4 - Обработка текста
                5 - Одномерные массивы
                6 - Многомерные массивы
                7 - Методы и аргументы
                0 - Выход
                """);

        do {
            System.out.print("Введите номер задания: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: нужно ввести число!");
                scanner.next();
                continue;
            }
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> new Task01IntegerTraps().run();
                case 2 -> new Task02FloatArithmetic().run();
                case 3 -> new Task03Bitwise().run();
                case 4 -> new Task04TextProcessing().run();
                case 5 -> new Task05Arrays().run();
                case 6 -> new Task06MultiArrays().run();
                case 7 -> new Task07Methods().run();
                case 0 -> {
                    System.out.println("Выход из программы.");
                    exit = true;
                }
                default -> System.out.println("Неверный номер, попробуйте снова.");
            }
        } while (!exit);

        scanner.close();
    }
}