package com.hillel.kryvoshei.homework.homework7;

public class Main {
    public static void main(String[] args) {
//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати 100
//        космічних шатлів для перевезення людей на Марс так, щоб у номерах шатлів не траплялося
//        нещасливих чисел. Напишіть функцію, яка виводить усі номери таких шатлів.

        int count = 0;
        int value = 0;
        while (count < 100) {
            String s = String.valueOf(++value);
            if ((s.contains("4") || s.contains("9"))) continue;
            System.out.println(value);
            count++;
        }
        System.out.println("TOTAL: " + count);
    }
}
