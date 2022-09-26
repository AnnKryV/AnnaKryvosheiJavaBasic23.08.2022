package com.hillel.kryvoshei.homework.homework11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
        Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.
       */

        Scanner scanner = new Scanner(System.in);
        int n = getNumber(scanner);
        int m = getNumber(scanner);

        int[][] array1 = new int[n][m];
        int[][] array2 = new int[m][n];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 101);
            }
        }
        System.out.println("First array:");
        printArray(array1);

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
        }
        System.out.println("Second array:");
        printArray(array2);

        scanner.close();
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int getNumber(Scanner scanner) {
        int temp = 0;
        System.out.println("Please enter length");
        while (true) {
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                if (temp < 0) {
                    System.out.println("Please enter positive number");
                } else {
                    break;
                }
                scanner.nextLine();
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        }
        return temp;
    }

    }

