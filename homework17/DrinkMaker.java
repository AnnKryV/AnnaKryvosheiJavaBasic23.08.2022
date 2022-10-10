package com.hillel.kryvoshei.homework.homework17;

public class DrinkMaker {
    public static void makeCoffee() {
        System.out.println("Please, wait. " + DrinkMachine.COFFEE.getTitle() + " is preparing ");
        new Check();
        System.out.println("Please take your " + DrinkMachine.COFFEE.getTitle());
    }
    public static void makeTea() {
        System.out.println("Please, wait. " + DrinkMachine.TEA.getTitle() + " is preparing ");
        new Check();
        System.out.println("Please take your " + DrinkMachine.TEA.getTitle());
    }
    public static void makeLemonade() {
        System.out.println("Please, wait. " + DrinkMachine.LEMONADE.getTitle() + " is preparing ");
        new Check();
        System.out.println("Please take your " + DrinkMachine.LEMONADE.getTitle());
    }
    public static void makeCoca_cola() {
        System.out.println("Please, wait. " + DrinkMachine.COCA_COLA.getTitle() + " is preparing ");
        new Check();
        System.out.println("Please take your " + DrinkMachine.COCA_COLA.getTitle());
    }
    public static void makeWater() {
        System.out.println("Please, wait. " + DrinkMachine.MINERAL_WATER.getTitle() + " is preparing ");
        new Check();
        System.out.println("Please take your " + DrinkMachine.MINERAL_WATER.getTitle());
    }
    public static void makeMojito() {
        System.out.println("Please, wait. " + DrinkMachine.MOJITO.getTitle() + " is preparing ");
        new Check();
        System.out.println("Please take your " + DrinkMachine.MOJITO.getTitle());
    }

    public static void makeDrink(DrinkMachine drinksMachine) {
        System.out.println("Please, wait. " + drinksMachine.getTitle() + " is preparing ");
        make();
        System.out.println("Please take your " + drinksMachine.getTitle());
    }

    private static void make() {
        try {
            Thread.sleep(5000);
            new Check();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
