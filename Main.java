package com.hillel.kryvoshei.homework.homework5;

public class Main {
    public static void main(String[] args) {
        /*За владу в стародавньому Китаї боролися дві династії: Лі та Мінь.

З кожного боку боролися 3 типи воїнів з такими показниками атаки:
Лі:

воїн - 13
лучник - 24
вершник - 46

Мінь:

воїн - 9
лучник - 35
вершник - 12
Розрахувати: загальний показник атаки для обох династій, якщо відомо,
що воїнів династії Лі кожного типу було 860, а кількість воїнів династії Мінь
кожного типу в півтора рази більша.

Вивести в консоль значення загальної атаки кожної армії;

*/
        int lisaber = 13*860;
        int liarcher = 24*860;
        int lirider = 46*860;

        double minsaber = 9*860*1.5;
        double minarcher = 35*860*1.5;
        double minrider = 12*860*1.5;

        double litotalattack = liarcher + lirider + lisaber;
        double mintotalattack =  minarcher + minsaber + minrider;
        System.out.println("Min total:"+ (int)mintotalattack);
        System.out.println("Li total:"+ (int)litotalattack);
    }
}
