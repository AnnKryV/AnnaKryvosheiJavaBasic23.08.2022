package com.hillel.kryvoshei.homework.homework10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
// Перший масив - це числа, які загадані фірмою-організатором лотереї.
//         Другий масив - це числа, які вгадав гравець.
// Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
//     У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом; Наприклад:
//
//        first[3] повинен дорівнювати second[3], як показано нижче.
//
//        Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
//
//[0, 1, 4, 5, 5, 8, 9]
//
//[1, 1, 2, 3, 5, 6, 9]
//
//        Кількість збігів: 3

        int max = 9;
        final int COUNT = 7;
        int[] array1 = new int[COUNT];
        int[] array2 = new int[COUNT];

        for (int i = 0; i < COUNT; i++) {
            array1[i] = getRandomNumber(max);
            array2[i] = getRandomNumber(max);
        }

        System.out.println("Before sort");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println("After sort");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int counter = 0;
        for (int i = 0; i < COUNT; i++) {
            if (array1[i] == array2[i]) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("Number of coincidences: " + counter);
    }

    static int getRandomNumber(int max) {
        return (int) (Math.random() * (max + 1));
    }
    }

