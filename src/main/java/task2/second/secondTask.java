package task2.second;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class secondTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = scanner.nextInt();

        ArrayList<Double> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            list.add(random.nextDouble(100)-50);
        }
        System.out.println(list);
        for (int i=0; i<n-1; i++) {

            int minimum = i;

            for (int j = i + 1; j < n; j++) {

                if (list.get(j) < list.get(minimum)) {
                    minimum = j;
                }
            }

            double temp = list.get(i);
            list.set(i, list.get(minimum));
            list.set(minimum, temp);
        }


        System.out.println();
        System.out.println(list);
    }
}