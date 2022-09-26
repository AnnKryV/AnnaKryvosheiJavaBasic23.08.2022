package com.hillel.kryvoshei.homework.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team1Name;
        String team2Name;
        final int COUNT_PLAYERS = 5;
        int[] team1 = new int[COUNT_PLAYERS];
        int[] team2 = new int[COUNT_PLAYERS];
        double sumFragsTeam1 = 0;
        double sumFragsTeam2 = 0;
        double avgFragsTeam1 = 0;
        double avgFragsTeam2 = 0;

        System.out.println("Enter team1 name: ");
        team1Name = scanner.nextLine();

        System.out.println("Enter team2 name: ");
        team2Name = scanner.nextLine();

        for (int i = 0; i < team1.length; i++) {
            System.out.println("Please enter frags for player " + (i + 1) + " from team " + team1Name);
            team1[i] = getFrags(scanner);
            sumFragsTeam1 += team1[i];
        }

        for (int i = 0; i < team2.length; i++) {
            System.out.println("Please enter frags for player " + (i + 1) + " from team " + team2Name);
            team2[i] = getFrags(scanner);
            sumFragsTeam2 += team2[i];
        }

        System.out.println("sum frags team " + team1Name + ": " + sumFragsTeam1);
        System.out.println("sum frags team " + team2Name + ": " + sumFragsTeam2);

        avgFragsTeam1 = sumFragsTeam1 / COUNT_PLAYERS;
        avgFragsTeam2 = sumFragsTeam2 / COUNT_PLAYERS;

        System.out.println("avg frags team " + team1Name + ": " + avgFragsTeam1);
        System.out.println("avg frags team " + team2Name + ": " + avgFragsTeam2);

        if (avgFragsTeam1 == avgFragsTeam2) {
            System.out.println("Draw");
        } else if (avgFragsTeam1 > avgFragsTeam2) {
            System.out.println("Team " + team1Name + " won");
        } else {
            System.out.println("Team " + team2Name + " won");
        }

        scanner.close();
    }

    static int getFrags(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if (temp >= 0) {
                    return temp;
                } else {
                    System.out.println("Please enter positive number");
                }
                scanner.nextLine();
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        }
    }
}
