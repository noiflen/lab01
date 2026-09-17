package ru.university.lab1.numbers;
public class Task02FloatArithmetic {
    public void run() {
        System.out.println("0.1 + 0.2 = " + (0.1 + 0.2) + " (не равно 0.3 из-за двоичного представления дробей)");
        double sum = 0;
        for (int i = 0; i < 10; i++) sum += 0.1;
        System.out.println("Сумма 10 раз по 0.1 == 1.0 ? " + (sum == 1.0) + " (false, накопилась погрешность)");
        System.out.println("Корректное сравнение с точностью: " + isEquals(sum, 1.0, 1e-9));
        System.out.println("Деление на ноль: " + (1.0 / 0.0) + " (Infinity) и " + (0.0 / 0.0) + " (NaN)");
        System.out.println("NaN == NaN ? " + (Double.NaN == Double.NaN) + " (всегда false по стандарту)");
    }
    private boolean isEquals(double a, double b, double eps) {
        return Math.abs(a - b) < eps;
    }
}
