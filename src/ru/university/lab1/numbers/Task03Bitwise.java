package ru.university.lab1.numbers;

public class Task03Bitwise {
    public void run() {
        basicOperations();
        shiftDifference();
        utilityMethods();
        xorSwap();
    }

    private void basicOperations() {
        int a = 5, b = 3;
        System.out.println("1. Базовые побитовые операции:");
        System.out.println("   5 & 3 = " + (a & b) + " (AND: оба бита = 1)");
        System.out.println("   5 | 3 = " + (a | b) + " (OR: хотя бы один бит = 1)");
        System.out.println("   5 ^ 3 = " + (a ^ b) + " (XOR: биты различаются)");
        System.out.println("   ~5 = " + (~a) + " (NOT: инвертирует все биты)");
        System.out.println("   5 << 2 = " + (a << 2) + " (сдвиг влево на 2 = умножение на 4)");
        System.out.println("   5 >> 1 = " + (a >> 1) + " (арифметический сдвиг вправо)");
        System.out.println("   5 >>> 1 = " + (a >>> 1) + " (логический сдвиг вправо)");
    }

    private void shiftDifference() {
        System.out.println("2. Разница между >> и >>>:");
        int neg = -5;
        System.out.println("   -5 >> 1 = " + (neg >> 1) + " (арифметический, сохраняет знак, заполняет единицами)");
        System.out.println("   -5 >>> 1 = " + (neg >>> 1) + " (логический, заполняет старшие биты нулями)");
    }

    private void utilityMethods() {
        System.out.println("3. Вспомогательные методы:");
        System.out.println("   8 чётное? " + isEven(8));
        System.out.println("   7 чётное? " + isEven(7));
        System.out.println("   8 - степень двойки? " + isPowerOfTwo(8));
        System.out.println("   6 - степень двойки? " + isPowerOfTwo(6));
        System.out.println("   Количество единичных битов в 5 (101): " + countBits(5));
        System.out.println("   Количество единичных битов в 7 (111): " + countBits(7));
    }

    private void xorSwap() {
        System.out.println("4. Обмен через XOR:");
        int x = 10, y = 20;
        System.out.println("   До: x=" + x + ", y=" + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("   После: x=" + x + ", y=" + y);
    }

    private boolean isEven(int n) {
        return (n & 1) == 0;
    }

    private boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    private int countBits(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1); // убираем младший единичный бит
            count++;
        }
        return count;
    }
}