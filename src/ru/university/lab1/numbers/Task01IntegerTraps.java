package ru.university.lab1.numbers;

public class Task01IntegerTraps {
    public void run() {
        printMinMax();
        overflowMaxValue();
        multiplyMaxValue();
        divisionAndModulo();
        longToIntCast();
        charArithmetic();
        checkOverflow();
    }

    private void printMinMax() {
        System.out.println("Мин и Макс значения:");
        System.out.println("byte: " + Byte.MIN_VALUE + " .. " + Byte.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " .. " + Integer.MAX_VALUE);
    }

    private void overflowMaxValue() {
        int max = Integer.MAX_VALUE;
        System.out.println("MAX_VALUE + 1 = " + (max + 1) + " (произошло переполнение в минимальное значение)");
    }

    private void multiplyMaxValue() {
        int max = Integer.MAX_VALUE;
        System.out.println("MAX_VALUE * 2 в int: " + (max * 2) + " (ошибка из-за переполнения)");
        System.out.println("MAX_VALUE * 2 в long: " + ((long) max * 2) + " (верно, приведение типа сделано заранее)");
    }

    private void divisionAndModulo() {
        System.out.println("5 / 2 = " + (5 / 2));
        System.out.println("-5 / 2 = " + (-5 / 2));
        System.out.println("-5 % 2 = " + (-5 % 2) + " (знак остатка совпадает со знаком делимого)");
    }

    private void longToIntCast() {
        long big = 3_000_000_000L;
        System.out.println("long " + big + " при приведении к int становится: " + (int) big + " (старшие биты отбрасываются)");
    }

    private void charArithmetic() {
        char a = 'A';
        System.out.println("Следующая буква после '" + a + "': " + (char)(a + 1));
        System.out.println("Сумма кодов 'A' + 'B': " + ('A' + 'B'));
    }

    private void checkOverflow() {
        System.out.println("Переполнение при сложении MAX_VALUE и 10: " + isOverflow(Integer.MAX_VALUE, 10));
        System.out.println("Переполнение при сложении 10 и 20: " + isOverflow(10, 20));
    }

    private boolean isOverflow(int a, int b) {
        if (b > 0 && a > Integer.MAX_VALUE - b) return true;
        if (b < 0 && a < Integer.MIN_VALUE - b) return true;
        return false;
    }
}
