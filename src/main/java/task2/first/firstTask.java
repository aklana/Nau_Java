package task2.first;

import java.util.Random;
import java.util.Scanner;

public class firstTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i=0; i<n;i++) {
            array[i] = random.nextInt();
        }

        for (int j: array) {
            System.out.print(j+" ");
        }

        int positiveNum = -1;
        boolean exist = false;

        for (int i=n-1; i>=0; i--) {
            if (array[i]>0) {
                positiveNum = array[i];
                exist = true;
                break;
            }
        }

        if (exist) {
            System.out.println();
            System.out.println(positiveNum);
        }
    }
}