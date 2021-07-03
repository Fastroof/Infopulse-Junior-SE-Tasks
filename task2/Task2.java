package task2;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] test = generateRandomArray(15, 1, 10);
        System.out.print("Common array: ");
        printArray(test);
        // This algorithm is used when the input array's length is around 10-20.
        insertionSortRecursive(test);
        System.out.print("Array after sorting(my algorithm): ");
        printArray(test);
        System.out.print("Array after sorting(Java Core): ");
        Arrays.sort(test);
        printArray(test);
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void insertionSortRecursive(int[] arr) {
        insertionSortRecursive(arr, arr.length);
    }

    private static void insertionSortRecursive(int[] arr, int i) {
        if (i <= 1) {
            return;
        }
        insertionSortRecursive(arr, i - 1);
        int key = arr[i - 1];
        int j = i - 2;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }

    public static int[] generateRandomArray(int length, int min, int max) {
        int[] arr = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt((max - min) + 1) + min;
        }
        return arr;
    }
}
