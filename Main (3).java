package com.hillel.kryvoshei.homework.homework9;


import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
//        Є дві команди регбі з 25 гравців різного віку у кожній.
//
//       Вік беремо випадковим чином в діапазоні від 18 до 40.
//
//        Виведіть у двох рядках вік гравців кожної команди.
//
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.

        // Варіант коду, який в мене так и не запрацював як слід. Завжди видавало "0".
//        int min = 18;
//        int max = 40;
//
//        int value =  min + (int) (Math.random() * (max - min + 1));
//
//        final int players_count = 25;
//
//        int[] team1 = new int[players_count];
//        int[] team2 = new int[players_count];
//
//        for (int i = 0; i < team1.length; i++) {
//            team1[i] = (int)(Math.random()*value) ;
//        }
//        for (int i = 0; i < team2.length; i++) {
//            team2[i] = (int)(Math.random()*value) ;
//        }
//
//        int sumTeam1 = 0;
//        {
//            int i = 0;
//            while (i < team1.length) {
//                sumTeam1 += team1[i];
//                i++;
//            }
//        }
//        int sumTeam2 = 0;
//        int i = 0;
//        while (i < team2.length) {
//            sumTeam2 += team2[i];
//            i++;
//        }
//
//        int avgTeam1 = sumTeam1 / team1.length;
//        int avgTeam2 = sumTeam2 / team2.length;
//
//        System.out.println(avgTeam1);
//        System.out.println(avgTeam2);
            new Main().execute();
        }

        private void execute() {
            Team one  = new Team("one");
            Team two = new Team("two");
            double oneavgage = one.avgAge();
            double twoavgage = two.avgAge();
            System.out.println(one);
            System.out.println(oneavgage);
            System.out.println(two);
            System.out.println(twoavgage);
        }

        class Team {
            private Person[] players;
            private String name;

            public Team(String name) {
                this.players = new Person[25];
                this.name = name;
                ThreadLocalRandom random = ThreadLocalRandom.current();
                for (int i = 0; i < 25; i++) {
                    Person person = new Person(random.nextInt(18, 30));
                    players[i] = person;
                }

            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                StringBuilder builder = new StringBuilder();
                for (Person person : players) {
                    builder.append(person.getAge());
                    builder.append(" ");
                }
                return "Age's o players:" + name + ": " + builder.toString();
            }

            public double avgAge() {
                double res = 0;
                for (Person person : players) res += person.getAge();
                return res / 25.0;
            }
        }

        class Person {
            private int age;

            public int getAge() {
                return age;
            }
            public Person(int age) {
                this.age = age;
            }

    }
}
