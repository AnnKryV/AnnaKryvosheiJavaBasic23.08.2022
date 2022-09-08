package com.hillel.kryvoshei.homework.homework8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
//        Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).
        Scanner greet = new Scanner(System.in);
        System.out.print("That's a game where you need to guess number from 0 to 10. Would you try to?(Yes or No):");
        String word = greet.nextLine();
        switch (word) {
            case "No":
                System.out.print("Then good next time visit!");
                break;

            case "Yes":
                System.out.print("Shall the game begin! What number?:");
                int count = greet.nextInt();
                int a = 0;
                int b = 10;
                int random_number = a + (int) (Math.random() * b);
                for (int i = 1; i < 6; i++) {
                    if (random_number > count) {
                        System.out.println("Thou art wrong! My number > of yours");
                        System.out.print("What number?: ");
                        count = greet.nextInt();


                    } else if (random_number < count) {
                        System.out.println("Thou art wrong! My number < of yours");
                        System.out.print("What number?:");
                         count = greet.nextInt();

                    } else {
                        System.out.println("HURAY, THOU'VE DONE IT! " + random_number);
                        break;
                    }
                }
        }


    }
}
