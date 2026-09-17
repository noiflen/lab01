package ru.university.lab1.numbers;
public class Task03Bitwise {
    public void run() {
        int a = 5, b = 3;
        System.out.println("5 & 3 = " + (a & b) + ", 5 | 3 = " + (a | b) + ", 5 ^ 3 = " + (a ^ b));
        System.out.println("-5 >> 1 = " + (-5 >> 1) + " (арифметический сдвиг, сохраняет знак)");
        System.out.println("-5 >>> 1 = " + (-5 >>> 1) + " (логический сдвиг, заполняет старшие биты нулями)");
        System.out.println("8 чётное? " + isEven(8) + ", степень двойки? " + isPowerOfTwo(8));
        int x = 10, y = 20;
        x = x ^ y; y = x ^ y; x = x ^ y;
        System.out.println("Обмен через XOR: x=" + x + ", y=" + y);
    }
    private boolean isEven(int n) { return (n & 1) == 0; }
    private boolean isPowerOfTwo(int n) { return n > 0 && (n & (n - 1)) == 0; }
}