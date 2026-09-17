package ru.university.lab1.arrays;
import java.util.Arrays;

public class Task05Arrays {
    public void run() {
        int[] arr = createRandomArray(10);
        System.out.println("Исходный: " + Arrays.toString(arr));
        printStats(arr);
        bubbleSort(arr);
        System.out.println("Отсортированный: " + Arrays.toString(arr));
        compareArrays();
    }

    private int[] createRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = (int)(Math.random() * 100);
        return arr;
    }

    private void printStats(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;
        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
            sum += val;
        }
        System.out.println("Мин: " + min + ", Макс: " + max + ", Среднее: " + ((double)sum / arr.length));
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    private void compareArrays() {
        int[] a = {1, 2}, b = {1, 2};
        System.out.println("Сравнение массивов:");
        System.out.println("a == b: " + (a == b) + " (сравнивает ссылки в памяти)");
        System.out.println("a.equals(b): " + a.equals(b) + " (у массивов этот метод не переопределен, тоже ссылки)");
        System.out.println("Arrays.equals(a, b): " + Arrays.equals(a, b) + " (правильный способ сравнения содержимого)");
    }
}
