package task2.first;

import java.util.Random;
import java.util.Scanner;

public class FirstTask {

    public static int[] fillArray(int n, Random random) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static int findLastPositive(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                return array[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = scanner.nextInt();
        int[] array = fillArray(n, random);

        for (int i=0; i<n;i++) {
            array[i] = random.nextInt();
        }

        for (int j: array) {
            System.out.print(j+" ");
        }

        int positiveNum = findLastPositive(array);

        if (positiveNum != -1) {
            System.out.println();
            System.out.println(positiveNum);
        } else {
            System.out.println();
            System.out.println("Положительных элементов нет");
        }
    }
}