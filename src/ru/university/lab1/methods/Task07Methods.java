package ru.university.lab1.methods;

public class Task07Methods {
    public void run() {
        overloadingDemo();
        varargsDemo();
        powerDemo();
    }

    private void overloadingDemo() {
        System.out.println("1. Перегрузка метода print:");
        print(5);
        print(3.14);
        print("Hello");
        print(new int[]{1, 2, 3});
    }

    private void varargsDemo() {
        System.out.println("2. Varargs (переменное число аргументов):");
        System.out.println("   Сумма 1,2,3,4,5: " + sum(1, 2, 3, 4, 5));
        System.out.println("   Сумма без аргументов: " + sum());
        int[] arr = {10, 20, 30};
        System.out.println("   Сумма массива {10,20,30}: " + sum(arr));
    }

    private void powerDemo() {
        System.out.println("3. Возведение в степень:");
        System.out.println("   2^3 рекурсивно: " + powerRec(2, 3) + ", итеративно: " + powerIter(2, 3));
        System.out.println("   5^0 рекурсивно: " + powerRec(5, 0) + ", итеративно: " + powerIter(5, 0));
        System.out.println("   3^1 рекурсивно: " + powerRec(3, 1) + ", итеративно: " + powerIter(3, 1));
        // Итеративный способ работает быстрее, так как нет затрат на создание новых кадров стека при каждом вызове функции.
    }

    private void print(int v) { System.out.println("   Вызван метод для int: " + v); }
    private void print(double v) { System.out.println("   Вызван метод для double: " + v); }
    private void print(String v) { System.out.println("   Вызван метод для String: " + v); }
    private void print(int[] v) { System.out.println("   Вызван метод для int[], длина: " + v.length); }

    private int sum(int... nums) {
        int s = 0;
        for (int n : nums) s += n;
        return s;
    }

    private int powerRec(int base, int exp) {
        return exp == 0 ? 1 : base * powerRec(base, exp - 1);
    }

    private int powerIter(int base, int exp) {
        int res = 1;
        for (int i = 0; i < exp; i++) res *= base;
        return res;
    }
}