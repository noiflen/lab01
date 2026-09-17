package ru.university.lab1.methods;
public class Task07Methods {
    public void run() {
        print(5);
        print(3.14);
        print("Hello");
        print(new int[]{1, 2});

        System.out.println("Сумма через varargs: " + sum(1, 2, 3, 4, 5));
        System.out.println("2 в степени 3 (рекурсия): " + powerRec(2, 3) + ", (цикл): " + powerIter(2, 3));
        // Итеративный способ (цикл) работает быстрее, так как нет затрат на создание новых кадров стека при каждом вызове функции.
    }

    private void print(int v) { System.out.println("Вызван метод для int: " + v); }
    private void print(double v) { System.out.println("Вызван метод для double: " + v); }
    private void print(String v) { System.out.println("Вызван метод для String: " + v); }
    private void print(int[] v) { System.out.println("Вызван метод для int[], длина: " + v.length); }

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