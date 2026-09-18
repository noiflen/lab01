package ru.university.lab1.numbers;

public class Task02FloatArithmetic {
    public void run() {
        floatPrecision();
        sumTenTimes();
        compareWithEpsilon();
        specialValues();
        roundingComparison();
        floatVsDouble();
    }

    private void floatPrecision() {
        System.out.println("1. 0.1 + 0.2 = " + (0.1 + 0.2) + " (не равно 0.3 из-за двоичного представления дробей)");
    }

    private void sumTenTimes() {
        double sum = 0;
        for (int i = 0; i < 10; i++) sum += 0.1;
        System.out.println("2. Сумма 10 раз по 0.1 == 1.0 ? " + (sum == 1.0) + " (false, накопилась погрешность)");
    }

    private void compareWithEpsilon() {
        double sum = 0;
        for (int i = 0; i < 10; i++) sum += 0.1;
        System.out.println("3. Корректное сравнение с точностью: " + isEquals(sum, 1.0, 1e-9));
    }

    private void specialValues() {
        System.out.println("4. Деление на ноль:");
        System.out.println("   1.0 / 0.0 = " + (1.0 / 0.0) + " (Infinity)");
        System.out.println("   -1.0 / 0.0 = " + (-1.0 / 0.0) + " (-Infinity)");
        System.out.println("   0.0 / 0.0 = " + (0.0 / 0.0) + " (NaN)");
        System.out.println("   NaN == NaN ? " + (Double.NaN == Double.NaN) + " (всегда false по стандарту)");
    }

    private void roundingComparison() {
        System.out.println("5. Сравнение методов округления:");
        System.out.println("   Для 2.7:");
        System.out.println("     (int) 2.7 = " + ((int) 2.7) + " (отбрасывает дробную часть)");
        System.out.println("     Math.round(2.7) = " + Math.round(2.7) + " (округляет до ближайшего целого)");
        System.out.println("     Math.floor(2.7) = " + Math.floor(2.7) + " (округляет вниз)");
        System.out.println("     Math.ceil(2.7) = " + Math.ceil(2.7) + " (округляет вверх)");
        System.out.println("   Для -2.7:");
        System.out.println("     (int) -2.7 = " + ((int) -2.7) + " (отбрасывает дробную часть, движется к нулю)");
        System.out.println("     Math.round(-2.7) = " + Math.round(-2.7) + " (округляет до ближайшего целого)");
        System.out.println("     Math.floor(-2.7) = " + Math.floor(-2.7) + " (округляет вниз, к -3)");
        System.out.println("     Math.ceil(-2.7) = " + Math.ceil(-2.7) + " (округляет вверх, к -2)");
    }

    private void floatVsDouble() {
        System.out.println("6. Сравнение точности float и double:");
        float f = 1.0f / 3.0f;
        double d = 1.0 / 3.0;
        System.out.println("   float:  1.0 / 3.0 = " + f);
        System.out.println("   double: 1.0 / 3.0 = " + d);
        System.out.println("   Разница: " + (d - f) + " (double точнее)");
    }

    private boolean isEquals(double a, double b, double eps) {
        return Math.abs(a - b) < eps;
    }
}

